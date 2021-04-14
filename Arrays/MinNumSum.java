package Arrays;

import java.util.Scanner;

public class MinNumSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			System.out.println(new MinNumSum().oE(a, n));

		}
	}

	static int oE(int a[], int n) {
		int temp=0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {
				temp = a[i];
			}
			if (temp < min)
				min = temp;
			

		}
		return min;
	}

}
