package NumberPattern;

import java.util.Scanner;

public class Palindromic_Ptrn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			for (int i = 1; i <= n; i++) {
				int j;
				for (j = 1; j <= n - i; j++) {
					System.out.print("  ");

				}
				int k = i;
				for (; j <= n; j++) {
					System.out.print(k-- + " ");
				}
				k = 2;
				for (; j <= n + i - 1; j++) {
					System.out.print(k++ + " ");
				}

				System.out.println();
			}
		}

	}

}
