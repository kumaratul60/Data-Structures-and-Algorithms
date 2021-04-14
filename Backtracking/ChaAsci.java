package Backtracking;

import java.util.Scanner;

public class ChaAsci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			char ch = sc.next().charAt(0);
			System.out.println((int) ch);
		}
	}

}
