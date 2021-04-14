package Matrix;

import java.util.Scanner;

public class Reshape_Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int a[][] = new int[n][m];
			for (int i = 0; i < n; i++)
				for (int j = 0; j < m; j++)
					a[i][j] = sc.nextInt();

			System.out.println(Solution.matrixReshape(a, n, m));
		}
	}
}

//		1. Original row * col needs to equal with new r*c: total # of elements should stay the same. Otherwise, return original
//		2. If the total number of items cannot be shaped into evenly into r/c form, return original
//		3. Maintain the new row/col index outside of nums for loop.

class Solution {
	public static int[][] matrixReshape(int[][] nums, int r, int c) {
		int totalElements = nums.length * nums[0].length;
		if (totalElements != r * c || totalElements % r != 0)
			return nums;

		 int[][] result = new int[r][c];
		int newR = 0;
		int newC = 0;
		for (int i = 0; i < nums.length; i++)
			for (int j = 0; j < nums[i].length; j++)
				result[newR][newC] = nums[i][j];
		newC++;
		if (newC == c) {
			newC = 0;
			newR++;
		}

		return result;
	}
}
