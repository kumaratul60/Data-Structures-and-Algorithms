package Matrix;

import java.util.Scanner;

public class AddMat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					a[i][j] = sc.nextInt();
			int b[][] = new int[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					b[i][j] = sc.nextInt();
			System.out.println(sumMatrix(a, b));
		}

	}

	static int[][] sumMatrix(int A[][], int B[][]) {
		// code here

		int rowA = A.length;
		int colA = A[0].length;
		int rowB = B.length;
		int colB = B[0].length;

		if (rowA != rowB || colA != colB) {
			int res[][] = new int[0][0];
			return res;
		} else {
			int c[][] = new int[rowA][colA];

			for (int i = 0; i < rowA; i++)
				for (int j = 0; j < colA; j++)
					c[i][j] = A[i][j] + B[i][j];

			return c;
		}
	}

}
