package NumberPattern;

import java.util.Scanner;

public class patrn1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

			int row = 1;
			
			// no of spaces
			int nsp = 0;
			
			//no of star
			int nst = n;
			while (row <= n) {

				// print space
				int csp = 1;
				while (csp <= nsp) {
					System.out.print(" ");
					csp = csp + 1;
				}
				// print star;
				int cst = 1;
				while (cst <= nst) {
					System.out.print("*");
					cst += 1;
				}
				// prep for next line

				System.out.println();
				row = row + 1;
				nsp = nsp + 2;
				nst = nst - 1;

			}
		}
	}

}
