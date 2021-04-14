package Hashing;

import java.util.Arrays;
import java.util.HashSet;

public class Triple_problem {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		int A[] = { 1, 4, 45, 6, 10, 8 };
		int sum = 22;
		int arr_size = A.length;

		System.out.println(find3Num(A, arr_size, sum));

	}

	static int find3Number(int a[], int n, int sum) {
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = j + 1; k < n; k++) {
					if (a[i] + a[j] + a[k] == sum)
						return 1;
				}

			}
		}
		return 0;

	}

	static int find3Num(int a[], int n, int sum) {
		int l, r;
		Arrays.sort(a);

		for (int i = 0; i < n - 2; i++) {

			l = i + 1;
			r = n - 1;

			while (l < r) {
				if (a[i] + a[l] + a[r] == sum)
					return 1;
				else if (a[i] + a[l] + a[r] > sum)
					r--;
				else
					l++;

			}
		}
		return 0;
	}

	static int find3Number_1(int a[], int n, int sum) {
		for (int i = 0; i < n - 2; i++) {
			HashSet<Integer> hs = new HashSet<>();
			int currSum = sum - a[i];
			for (int j = i + 1; j < n; j++) {
				if (hs.contains(currSum - a[j])) {

					return 1;

				}
				hs.add(a[j]);
			}

		}
		return 0;
	}

}
