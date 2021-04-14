package Hashing;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SubArray_givenSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		int sum = sc.nextInt();

		System.out.println(subArraySum_3(a, n, sum));

	}

	static int subArraySum(int arr[], int n, int sum) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int psum = 0;
		int count = 0;
		for (int a : arr) {
			psum += a;
			if (psum == sum)
				count++;
			if (hm.containsKey(psum - sum))
				count += hm.get(psum - sum);
			if (hm.containsKey(psum))
				hm.put(psum, hm.get(psum) + 1);
			else
				hm.put(psum, 1);
		}
		return count;
	}

	static int subArraySum1(int arr[], int n, int sum) {
		int count = 0, sum1 = 0;
		for (int i = 0; i < n; i++) {
			sum1 = 0;
			for (int j = i; j < n; j++) {
				sum1 += arr[j];
				if (sum == sum1)
					count++;
			}
		}
		return count;
	}

	static int subArraySum2(int arr[], int n, int sum) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			int psum = 0;
			for (int j = i; j < n; j++) {
				psum += arr[j];
				if (psum == sum)
					count++;
			}
		}
		return count;
	}

	static boolean subArraySum_3(int a[], int n, int sum) {
		int psum = 0;
		Set<Integer> s = new HashSet<>();
		s.add(0);

		for (int i = 0; i < n; i++) {
			psum += a[i];
			if (s.contains(psum - sum))
				return true;
			s.add(psum);
		}
		return false;

	}

}
