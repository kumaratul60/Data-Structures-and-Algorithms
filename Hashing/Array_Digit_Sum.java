package Hashing;

import java.util.HashMap;
import java.util.Scanner;

//Geek Land has a population of N people and each person's ability to rule
//the town is measured by a numeric value arr[i]. The two people that can 
//together rule Geek Land must be compatible with each other i.e., 
//the sum of digits of their ability arr[i] must be equal. Their combined 
//ability should be maximum amongst all the possible pairs of people.
//Find the combined ability of the Ruling Pair.

//N = 5
//arr[] = {55, 23, 32, 46, 88}
//Output:
//101
//Explanation:
//All possible pairs that are 
//compatible with each other are- (23, 32) 
//with digit sum 5 and (55, 46) with digit 
//sum 10. Out of these the maximum combined 
//ability pair is (55, 46) i.e. 55 + 46 = 101

public class Array_Digit_Sum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		System.out.print(RulingPair1(a, n) + " ");
	}

	static int RulingPair(int arr[], int no) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int maxSum = -1;
		for (int i : arr) {
			int sum = 0;
			int num = i;

			while (i != 0) {
				int lastDig = i % 10;
				sum += lastDig;
				i /= 10;
			}
			if (hm.containsKey(sum)) {
				int curr = hm.get(sum);
				maxSum = Math.max(maxSum, curr + num);
				if (num > curr)
					hm.put(sum, num);

			} else
				hm.put(sum, num);
		}
		return maxSum;
	}

	static int digitSum(int n) {
		int sum = 0;
		while (n != 0) {
			sum += (n % 10);
			n /= 10;
		}
		return sum;
	}

	static int RulingPair1(int arr[], int n) {

		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();

		for (int i = 0; i < 1000; i++) {
			mp.put(i, 0);
		}

		int ans = -1;

		for (int i = 0; i < n; i++) {
			// Finding the digit sum of arr[i]
			int dSum = digitSum(arr[i]);

			if ((int) mp.get(dSum) != 0) {
				ans = Math.max(ans, mp.get(dSum) + arr[i]);
			}
			mp.put(dSum, Math.max(mp.get(dSum), arr[i]));
		}
		return ans;
	}
}
