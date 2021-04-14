package Recursiion;

import java.util.Scanner;

public class sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			 System.out.println(sum.print(n));

		}

	}

	static int print(int n) {
		if (n <= 1)
			return 1;
		return n + print(n - 1);

	}

	
}
