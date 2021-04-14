package NumberPattern;

import java.util.Scanner;

public class InvertedNum_Ptrn {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

			int count = 0;
			for (int i = 1; i < n; i++) {
				for (int j = 1; j < n + 1 - i; j++) {
					System.out.print(j);
					count++;
				}
				System.out.println();
			}
		}
	}

}
