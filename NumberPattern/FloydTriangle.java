package NumberPattern;

import java.util.Scanner;

public class FloydTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int count = 1;
			for (int i = 1; i <= n; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(count + " ");
					count++;
				}
				System.out.println();
			}

		}
	}

}
