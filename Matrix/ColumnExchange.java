package Matrix;

import java.util.Scanner;

public class ColumnExchange {

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
			interchangeFirstLast(a);
			printMatrix(a);
		}
	}

	static void interchangeFirstLast(int m[][]) {
		
		int rows = m.length;
		int cols = m[0].length-1;
		for(int i=0;i<rows;i++) {

		while(rows<cols) {
			int t = m[0][i];
			m[0][i] = m[cols][i];
			m[cols][i] = t;
		}
		
	}
	}

	static void printMatrix(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println("");
		}
	}

}
