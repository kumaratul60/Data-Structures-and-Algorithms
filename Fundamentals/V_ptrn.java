package Fundamentals;

import java.util.Scanner;

public class V_ptrn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++)
				System.out.print(j);
			for (int k =  (i * 2); k <= 5 * 2 - 1; k++)
				System.out.print(" ");
			for (int l = i; l >= 1; l--)
				System.out.print(l);
			System.out.println();

		}
		System.out.println();

	}

}
