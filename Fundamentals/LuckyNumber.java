package Fundamentals;

import java.util.Scanner;

public class LuckyNumber {

	static int counter = 2;

	static boolean lucky(int n) {
		int next_pos = n;
		if (counter > n)
			return true;
		if (n % counter == 0)
			return false;

		next_pos -= next_pos / counter;
		counter++;
		return lucky(next_pos);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the input ");
		int t = sc.nextInt();
		while (t-- > 0) {
			int input = sc.nextInt();

			if (lucky(input))
				System.out.println("Yes");
			else
				System.out.println("No");
		}

	}

}
