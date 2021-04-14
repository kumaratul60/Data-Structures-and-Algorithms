package Hashing;

import java.util.HashSet;
import java.util.Scanner;

public class SubArray_0Sum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();

			int a[] = new int[n];

			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			//System.out.println(findSum(a, n));
			
			System.out.println(findSum(a, n)==true?"Yes":"No");
		}

	}

	static boolean findSum(int a[], int n) {
		HashSet<Integer> s = new HashSet<>();

		for (int i = 0; i < n; i++) {
			int sum = 0;
			sum += a[i];
			if (s.contains(sum) || a[i] == 0 || sum == 0)
				return true;
			s.add(sum);
		}
		return false;
	}

}
