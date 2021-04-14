package TCS_NQT;

import java.util.Scanner;

public class Int2Binary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int2binary(n);
		}

	}

	static void int2binary(int n) {
		int place = 1;
		int bin = 0;
		while (n > 0) {
			int lastDigit = n % 10;
			bin = place * lastDigit+bin;
			place *= 10;
		}
		System.out.println(bin);
	}

}
