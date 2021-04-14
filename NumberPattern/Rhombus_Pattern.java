package NumberPattern;

import java.util.Scanner;

public class Rhombus_Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			for (int i = 1; i < n; i++) {
				for (int j = 1; j <= n - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j < n; j++) {
					System.out.print(" *");
				}

				System.out.println();
			}
			System.out.println();
			int count = 0;
			for (int i = 1; i < n; i++) {
				for (int j = 1; j <= n - i; j++) {
					System.out.print(" ");
				}
				for (int j = 1; j <= i; j++) {
					System.out.print(j + " ");
					count++;
				}

				System.out.println();
			}
		}
	}

}
