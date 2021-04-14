package Matrix;

import java.util.Scanner;

public class Sum_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++)
					a[i][j] = sc.nextInt();
			}
			System.out.println(sumMatrix(a));
		}
	}

	static int sumMatrix(int a[][]) {
		int n = a.length;
		int m = a[0].length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++)
				sum += a[i][j];
		}

		return sum;
	}

}
