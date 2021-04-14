package NumberPattern;

import java.util.Scanner;

public class DimondPtrn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= n - i; j++) {
					System.out.print("  ");
				}
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
			for (int i = n; i >= 1; i--) {
				for (int j = 1; j <= n - i; j++) {
					System.out.print("  ");
				}
				for (int j = 1; j <= 2 * i - 1; j++) {
					System.out.print(" *");
				}
				System.out.println();
			}
		}
	}

}
