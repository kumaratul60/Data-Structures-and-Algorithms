package Fundamentals;

import java.util.Scanner;

public class DiceGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int p = sc.nextInt();
//			int q = sc.nextInt();
//
//			if (p > q)
//				System.out.println("Pragya");
//
//			else if (p < q)
//				System.out.println("Tina");
//
//			else
//				System.out.println("Draw");
			int sum = 0;
			for (int i = 0; i <= p; i++)
				sum += i;
			System.out.println(sum);

		}

	}

}
