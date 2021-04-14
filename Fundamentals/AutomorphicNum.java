package Fundamentals;

import java.util.Scanner;

public class AutomorphicNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			for (int i = 1; i <= a; i++) {
				if (isAutomorphicNumber(i))
					System.out.println(i);
			}
		}

	}

	public static boolean isAutomorphicNumber(int n) {
		int square = n * n, factor = 1;
		for (int temp = n; temp > 0; temp /= 10) {
			factor *= 10;
		}
		return (square % factor) == n;
	}

}
