package Matrix;

import java.util.Arrays;
import java.util.Scanner;

public class Sort1D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();

			int a[] = new int[n];
			for (int i = 0; i < n; i++) {

				a[i] = sc.nextInt();
			}
			sort(a, n);
		}
	}

	static void sort(int a[], int r) {
		Arrays.sort(a);
		for (int i = 0; i < r; i++) {
			System.out.print(a[i] + " ");

		}
		System.out.println();
	}

}
