package Recursiion;

import java.util.Scanner;

public class CombinationNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) 
			arr[i] = sc.nextInt();
		
		 int k = sc.nextInt();
		 recur(arr, "", 0, arr.length, k);
		
	}

	static void recur(int[] A, String out, int i, int n, int k) {
		if (k == 0)
			System.out.println(out);
		for (int j = i; j < n; j++) 
			recur(A, out + (A[j]) + " ", j + 1, n, k - 1);
		
	}

}
