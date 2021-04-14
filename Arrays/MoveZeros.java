package Arrays;

import java.util.Scanner;

public class MoveZeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();

			int a[] = new int[n];

			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			moveZero1(a, n);
			print(a, n);
		}

	}

	static void moveZero1(int a[], int n) {
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				for (int j = i + 1; j < n; j++)
					if (a[j] != 0) {
						int temp = a[i];
						a[i] = a[j];
						a[j] = temp;
					}
			}

		}

	}

	/// ----------------------Optimize----------------------
	static void moveZero(int a[], int n) {
		int count = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] != 0) {
				int temp = a[i];
				a[i] = a[count];
				a[count] = temp;
				count++;
			}
		}
	}

	static void print(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");

	}

}
