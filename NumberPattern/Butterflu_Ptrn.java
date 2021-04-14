package NumberPattern;

import java.util.Scanner;

public class Butterflu_Ptrn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}

				int space = 2 * n - 2 * i;
				for (int j = 1; j <= space; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}

				System.out.println();
			}

			for (int i = n; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}

				int space = 2 * n - 2 * i;
				for (int j = 1; j <= space; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

/////////////////////////////////////////////////////////////////
			System.out.println();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}

				int space = 2 * n - 2 * i;
				for (int j = 1; j <= space; j++) {
					System.out.print(" ");
				}

				System.out.println();
			}

			for (int i = n; i >= 1; i--) {
				for (int j = 1; j <= i; j++) {
					System.out.print("*");
				}

				int space = 2 * n - 2 * i;
				for (int j = 1; j <= space; j++) {
					System.out.print(" ");
				}

				System.out.println();
			}

		}

	}

}
