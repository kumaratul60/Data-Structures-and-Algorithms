package BitMagic;

import java.util.Scanner;

public class Swap_twoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			swap_Bit(n, m);
			swap_Airthmetic(n, m);
			swap_Airthmetic1(n, m);
			swap(n, m);
		}
	}

	static void swap_Bit(int a, int b) {

		a = a ^ b;
		b = a ^ b;
		a = a ^ b;

		System.out.println("After swaping " + a + " " + b);
	}

	static void swap_Airthmetic(int a, int b) {

		a = a * b;
		b = a / b;
		a = a / b;

		System.out.println("After swaping " + a + " " + b);
	}

	static void swap_Airthmetic1(int a, int b) {

		if (a == b)
			return;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swaping " + a + " " + b);
	}

	static void swap_xor(int a[], int b[]) {

		a[0] = a[0] * b[0];
		b[0] = a[0] / b[0];
		a[0] = a[0] / b[0];

		System.out.println("After swaping " + a[0] + " " + b[0]);
	}

	public static void swap(int a, int b) {
		// same as a = a + b
		a = (a & b) + (a | b);

		// same as b = a - b
		b = a + (~b) + 1;

		// same as a = a - b
		a = a + (~b) + 1;

		System.out.print("After swapping: a = " + a + ", b = " + b);
	}

}
