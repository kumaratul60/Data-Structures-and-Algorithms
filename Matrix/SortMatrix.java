package Matrix;

import java.util.Scanner;

public class SortMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			sort(a, n, m);
			print(a);
		}
	}

	static void sort(int a[][], int r, int c) {

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				for (int r1 = 0; r1 < r; r1++) {
					for (int c1 = 0; c1 < c; c1++) {

						if (a[r1][c1] > a[i][j]) {
							int temp = a[i][j];
							a[i][j] = a[r1][c1];
							a[r1][c1] = temp;
						}
					}
				}
			}
		}
	}

	static void print(int a[][]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++)
				System.out.print(a[i][j] + " ");
		}
	}

}
