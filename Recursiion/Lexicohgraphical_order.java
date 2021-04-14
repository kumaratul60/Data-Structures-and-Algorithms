package Recursiion;

import java.util.Scanner;

public class Lexicohgraphical_order {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
//			int startFrom =  sc.nextInt();
			int endNum = sc.nextInt();

			// lex(startFrom,endNum);
			lex(0, endNum);
		}
	}

	static void lex(int x, int n) {
		
		// base case
		if (x > n)
			return;
		if (x == n) {
			System.out.println(x);
			return;
		}
		
		// self work
		if (x != 0) {
			System.out.println(x);
			
		}
		
		// recursive task
		for (int i = (x == 0) ? 1 : 0; i <= 9; i++) {
			lex(10 * x + i, n);
		}
		
	}
}
