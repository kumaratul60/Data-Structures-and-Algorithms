package Matrix;

import java.util.Scanner;

public class MultiplicationMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		int[][] m1 = new int[n1][n2];
		int[][] m2 = new int[n2][n3];

		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n2; j++)
				m1[i][j] = sc.nextInt();

		}
		for (int i = 0; i < n2; i++) {
			for (int j = 0; j < n3; j++)
				m2[i][j] = sc.nextInt();
		}

		int ans[][] = new int[n1][n3];
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n3; j++)
				ans[i][j] = 0;
		}
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n3; j++) {
				for (int k = 0; k < n2; k++) {
					ans[i][j] += m1[i][k] * m2[k][j];
				}
			}
		}
		for (int i = 0; i < n1; i++) {
			for (int j = 0; j < n3; j++)
				System.out.print(ans[i][j] + " ");
			System.out.println();
		}

	}

}
