package Arrays;

import java.util.Scanner;

public class EqualSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			System.out.println(new EqualSum().equilibrium(a, n));
		}
	}

	String equilibrium(int a[], int n) {

		int sum = 0; // initialize sum of whole array
		int leftSum = 0; // initialize leftsum

		for (int i = 0; i < n; i++)
			sum += a[i];

		/* Find sum of the whole array */
		for (int i = 0; i < n; ++i) {

			sum -= a[i];// sum is now right sum for index i

			if (leftSum == sum)
				return "YES";

			leftSum += a[i];
		}
		/* If no equilibrium index found, then return 0 */
		return "NO";
	}

}
