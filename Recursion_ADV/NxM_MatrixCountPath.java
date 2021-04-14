package Recursion_ADV;

import java.util.Scanner;

public class NxM_MatrixCountPath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();

//			int a[][] = new int[n][m];
//			for (int i = 0; i < n; i++)
//				for (int j = 0; j < m; j++)
//					a[i][j] = sc.nextInt();

			System.out.println(countPath(n, m));
		}

	}

	private static int countPath(int n, int m) {
		if (n == 1 || m == 1)
			return 1;

		return countPath(n - 1, m) + countPath(n, m - 1);
	}

}
