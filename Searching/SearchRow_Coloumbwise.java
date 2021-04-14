package Searching;

import java.util.Scanner;

public class SearchRow_Coloumbwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int x = sc.nextInt();
			int[][] a = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++)
					a[i][j] = sc.nextInt();
			}
			new SearchRow_Coloumbwise();
			SearchRow_Coloumbwise.search(a, n, x);

		}
	}

	static void search(int a[][], int n, int x) {
		int i = 0, j = n - 1;
		while (i < n && j >= 0) {
			if (a[i][j] == x) {
//				int[] ans = new int[2];
//				ans[0] = i;
//				ans[1] = j;
				System.out.println(i+" " +j);
				return;
			}
			if (a[i][j] > x)
				j--;
			else
				i++;
		}

		return;
	}

}
