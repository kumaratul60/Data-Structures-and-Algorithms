package Fundamentals;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int sum = 0;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++)
					sum += j;
			}
			System.out.println(sum);

		}
	}

}
