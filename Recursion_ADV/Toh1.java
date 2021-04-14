package Recursion_ADV;

import java.util.Scanner;

public class Toh1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			toh(n, 1, 3, 2);
			System.out.println(count);
			count = 0;

		}
	}

	static int count = 0;

	static void toh(int n, int s, int d, int h) {
		count++;
		if (n == 1) {
			System.out.println("moving disk " + n + " from rod " + s + " to rod " + d);
			return;
		}
		toh(n - 1, s, h, d);
		System.out.println("moving disk " + n + " from rod " + s + " to rod " + d);
		toh(n - 1, h, d, s);

	}
	 

}
