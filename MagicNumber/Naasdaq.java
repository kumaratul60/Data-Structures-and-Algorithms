package MagicNumber;

import java.util.Scanner;

public class Naasdaq {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = sc.nextInt();
			}
			System.out.println(min(a, n));
		}
	}

	static int min(int a[], int n) {
		int temp1 = 0;
		int temp2 = 0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n / 2; i++) {
			temp1 = Math.min(a[i], min);
			return temp1;
		}
		for (int i = n / 2; i < n; i++) {
			temp2 = Math.min(a[i], min);
			return temp2;
		}
		sum = temp1 + temp2;

		return sum;
	}

}
