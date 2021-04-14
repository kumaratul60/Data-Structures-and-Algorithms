package Matrix;

import java.util.Scanner;

public class Search {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					a[i][j] = sc.nextInt();
				}
			}
			int x = sc.nextInt();
			boolean subA;
			subA = search(a, n, m, x);
			System.out.println(subA);
		}
	}

	static boolean search(int a[][], int n, int m, int x) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (a[i][j] == x) {
					System.out.println(i + " " + j);
					return true;
				}
			}
		}
		return false;
	}

}
