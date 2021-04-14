package Matrix;

import java.util.Scanner;

public class RoteteMatrix90digree {

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
				rotate(a);
				printMatrix(a);
		}
	}

	static void rotate(int a[][]) {
		transpose(a);
		reverseColumns(a);

	}

	static void transpose(int arr[][]) {
		for (int i = 0; i < arr.length; i++)
			for (int j = i; j < arr[0].length; j++) {
				int temp = arr[j][i];
				arr[j][i] = arr[i][j];
				arr[i][j] = temp;
			}
	}

	static void reverseColumns(int arr[][]) {
		for (int i = 0; i < arr[0].length; i++)
			for (int j = 0, k = arr[0].length - 1; j < k; j++, k--) {
				int temp = arr[j][i];
				arr[j][i] = arr[k][i];
				arr[k][i] = temp;
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
