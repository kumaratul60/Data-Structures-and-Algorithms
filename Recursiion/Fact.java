package Recursiion;

import java.util.Scanner;

public class Fact {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t--> 0) {
			int n = sc.nextInt();
			Fact f = new Fact();
			System.out.println(f.fact(n));
			
		}
	}

	int fact(int n) {
		if (n == 0)
			return 1;

		return n * fact(n - 1);
	}

}
