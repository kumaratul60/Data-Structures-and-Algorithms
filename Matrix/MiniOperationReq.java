package Matrix;

import java.util.Scanner;

public class MiniOperationReq {

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
		}
	}

	static int findMinOperation(int mat[][], int n) {
		// code here
		int max = 0, maxColSum = 0;
		int totalSum = 0;

		for (int i = 0; i < n; i++) {
			int currentRowSum = 0;
			for (int j = 0; j < n; j++) {
				currentRowSum += mat[i][j];
			}
			totalSum += currentRowSum;
			max = (max < currentRowSum) ? currentRowSum : max;
		}
		for (int i = 0; i < n; i++) {
			int currentColSum = 0;
			for (int j = 0; j < n; j++)
				currentColSum += mat[j][i];
			max = (max < currentColSum) ? currentColSum : max;
		}

		return ((max * n) - totalSum);
	}

	static int findMinOpeartion(int matrix[][], int n) {
// Initialize the sumRow[] 
// and sumCol[] array to 0 
		int[] sumRow = new int[n];
		int[] sumCol = new int[n];

// Calculate sumRow[] and 
// sumCol[] array 
		for (int i = 0; i < n; ++i)

			for (int j = 0; j < n; ++j) {
				sumRow[i] += matrix[i][j];
				sumCol[j] += matrix[i][j];
			}

// Find maximum sum value  
// in either row or in column 
		int maxSum = 0;
		for (int i = 0; i < n; ++i) {
			maxSum = Math.max(maxSum, sumRow[i]);
			maxSum = Math.max(maxSum, sumCol[i]);
		}

		int count = 0;
		for (int i = 0, j = 0; i < n && j < n;) {
// Find minimum increment 
// required in either row 
// or column 
			int diff = Math.min(maxSum - sumRow[i], maxSum - sumCol[j]);

// Add difference in  
// corresponding cell, 
// sumRow[] and sumCol[] 
// array 
			matrix[i][j] += diff;
			sumRow[i] += diff;
			sumCol[j] += diff;

// Update the count  
// variable 
			count += diff;

// If ith row satisfied, 
// increment ith value  
// for next iteration 
			if (sumRow[i] == maxSum)
				++i;

// If jth column satisfied,  
// increment jth value for 
// next iteration 
			if (sumCol[j] == maxSum)
				++j;
		}
		return count;
	}

}
