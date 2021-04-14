package GFG_30_days_code;

public class Day6 {

	public static void main(String[] args) {
		int N = 5, k = 3;
		int mat[][] = { { 1, 1, 1, 1, 1 }, { 2, 2, 2, 2, 2 }, { 3, 8, 6, 7, 3 }, { 4, 4, 4, 4, 4 }, { 5, 5, 5, 5, 5 } };

		System.out.println(Maximum_Sum(mat, N, k));

	}

	public static int Maximum_Sum(int mat[][], int N, int k) {
		int r1 = 0, r2 = k, c1 = 0, c2 = k;
		int res = Integer.MIN_VALUE, sum = 0;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < k; j++) {
				sum += mat[i][j];
			}

		}

		res = Math.max(res, sum);

		int temp = sum;
		while (r2 <= N) {

			while (c2 < N) {

				for (int i = r1; i < r2; i++) {

					sum = sum - mat[i][c1];

					sum = sum + mat[i][c2];
				}

				c1++;
				c2++;

				res = Math.max(res, sum);

			}

			c1 = 0;
			c2 = k;

			if (r2 == N)

				break;

			for (int i = c1; i < c2; i++) {
				temp = temp - mat[r2][i];
				temp = temp - mat[r1][i];

			}
			sum = temp;

			r1++;
			r2++;

			res = Math.max(res, sum);
		}

		return res;
	}

}
