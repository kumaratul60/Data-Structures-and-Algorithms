package NumberPattern;

import java.util.Scanner;

public class Ganesha_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

// 1
			System.out.print("*");
			for (int i = 1; i <= (n - 3) / 2; i++) {
				System.out.print(" ");
			}
			for (int i = 1; i <= (n + 1) / 2; i++) {
				System.out.print("*");
			}
			System.out.println();

// 2
			for (int rows = 1; rows <= (n - 3) / 2; rows++) {
				System.out.print("*");
				for (int i = 1; i <= (n - 3) / 2; i++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
// 3
			for (int i = 1; i <= n; i++) {
				System.out.print("*");
			}
			System.out.println();
//  4
			for (int rows = 1; rows <= (n - 3) / 2; rows++) {
				for (int i = 1; i <= (n - 3) / 2 + 1; i++) {
					System.out.print(" ");
				}

				System.out.print("*");

				for (int i = 1; i <= (n - 3) / 2; i++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
// 5
			for (int i = 1; i <= (n + 1) / 2; i++) {
				System.out.print("*");
			}
			for (int i = 1; i <= (n - 3) / 2; i++) {
				System.out.print(" ");
			}
			System.out.print("*");
			System.out.println();

		}
	}

}
