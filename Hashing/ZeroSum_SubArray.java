package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZeroSum_SubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		// int sum = sc.nextInt();

		System.out.println(findSubarray1(a, n));

	}

	public static int findSubarray(int[] arr, int n) {
		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);
		int count = 0, sum = 0;
		int[] sums = new int[n];
		sums[0] = arr[0];
		for (int i = 1; i < n; ++i)
			sums[i] = arr[i] + sums[i - 1];
		for (int s : sums) {
			int diff = s - sum;
			if (map.containsKey(diff))
				count += map.get(diff);
			map.merge(s, 1, Integer::sum);
		}
		return count;
	}

	public static int findSubarray1(int a[], int n) {
		int sum = 0, count = 0;
		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < n; i++) {
			sum += a[i];       				// sum stores prefix sum

			if (sum == 0) 					// if prefix sum is zero that means we encounter a zero sum subarray
				count++; 					// hence we increment the counter

			if (hm.containsKey(sum)) 		// If map contains the sum. This means we have previously seen the sum

				count += hm.get(sum); 		// add the value of sum to counter

			if (hm.containsKey(sum)) {
				int k = hm.get(sum); 		// increment the key
				k++;
				hm.put(sum, k);
			} else
				hm.put(sum, 1);
		}

		return count;						 // answer
	}

}
