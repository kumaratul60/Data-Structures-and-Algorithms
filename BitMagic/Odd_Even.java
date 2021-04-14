package BitMagic;

import java.util.Scanner;

public class Odd_Even {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			oE(n);
		}
	}

	static void oE(int n) {
		if ((n & 1) == 0)
			System.out.println("Even");
		else
		System.out.println("Odd");
	}

}
