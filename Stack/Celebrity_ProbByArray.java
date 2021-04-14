package Stack;

import java.util.Scanner;

public class Celebrity_ProbByArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				a[i][j] = sc.nextInt();

		System.out.println(celeb(a, n));

	}

	private static int celeb(int[][] a, int n) {

		int celeb = 0;
		for (int i = 0; i < n; i++)
			if (a[celeb][i] == 1)
				celeb = i;

		for (int i = 0; i < n; i++)
			if (i != celeb)
				if (a[i][celeb] == 0 || a[celeb][i] == 1)
					return -1;

		return celeb;
	}

}
