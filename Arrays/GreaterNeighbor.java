package Arrays;

import java.util.Scanner;

public class GreaterNeighbor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			greater(a, n);
		}
	}

	static void greater(int a[], int n) {
		if (n == 1)
			System.out.println(0);
		if (a[0] >= a[1])
			System.out.print(0+" ");
		if (a[n - 1] >= a[n - 2])
			System.out.println(n - 1);

		for (int i = 1; i < n-1 ; i++) {
			if (a[i] >= a[i - 1] && a[i] >= a[i + 1])
				System.out.print(i+" ");

		}

	}

}
