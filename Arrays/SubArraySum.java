package Arrays;

import java.util.Scanner;

public class SubArraySum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int sum = sum(a, n);
			System.out.println(sum);
		}

	}

	static int sum(int a[], int n) {
		int curr_Sum = 0;
		for (int i = 0; i < n; i++) {
			curr_Sum = 0;
			for (int j = i; j < n; j++) {
				curr_Sum += a[j];
				System.out.print(curr_Sum+" ");
			}
		}
		return 0;
	}

}
