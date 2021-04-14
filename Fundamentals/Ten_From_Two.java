package Fundamentals;

import java.util.Scanner;

public class Ten_From_Two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {
			int n = sc.nextInt();
			int count = 0;
			boolean b = false;

			while ((n % 10 == 5 || n % 10 == 0)) {
				b = true;
				if (n % 10 != 0) {
					count++;
					n = n * 2;

				} else if (n % 10 == 0) {
					break;
				}
			}
			System.out.println(count);
		}
	}
}
