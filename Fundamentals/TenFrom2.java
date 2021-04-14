package Fundamentals;

import java.util.Scanner;

public class TenFrom2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int count = 0;
			if (n < 0)
				System.out.println(-1);
			if (n % 10 == 0)
				System.out.println(count);
			else {

				n = n * 2;
				count++;
				System.out.println(count);
			}

		}

	}

}
