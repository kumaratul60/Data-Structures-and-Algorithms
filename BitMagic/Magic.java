package BitMagic;

import java.util.Scanner;

public class Magic {

	public static void main(String[] args) throws java.lang.Exception {
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			System.out.println(magic(n));
		}

	}

	static String magic(int n) {
		int count = 0;
		while (n > 0) {

			n &= (n - 1); // Brian Kernighan’s Algorithm

			count++;
		}
		if ((count & 1) != 0)
			return "Magical";
		else
			return "Non-Magical";
	}

}
