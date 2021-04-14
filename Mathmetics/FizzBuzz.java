package Mathmetics;

public class FizzBuzz {

	public static void main(String[] args) {

		// n = size of number
		// +,- -> time complexity = O(n);
		// %,/,* -> time complexity = O(n^2);

		int n = 100;
		// fb1(n);

		// fb2(n);

		fb3_optimize(n);

	}

	// finally fizzBuzz check order is = 15->5->3 is correct way to check

	static void fb1(int n) {
		for (int i = 1; i < n; i++) {

//			if (i % 15 == 0)
//				System.out.println("FizzBuzz");
			if (i % 5 == 0 && i % 3 == 0)
				System.out.println("FizzBuzz");

			else if (i % 5 == 0)
				System.out.println("Buzz");
			else if (i % 3 == 0)
				System.out.println("Fizz");
			else
				System.out.println(i);

		}

	}

	static void fb2(int n) {

		for (int i = 1; i < n; i++) {
			String s = "";

			if (i % 3 == 0) {

				s += "Fizz";
			}
			if (i % 5 == 0) {

				s += "Buzz";
			}
			if (s == "")
				System.out.println(i);
			else
				System.out.println(s);
		}
	}

	static void fb3_optimize(int n) {

		int c3 = 0;
		int c5 = 0;

		for (int i = 1; i < n; i++) {
			c3++;
			c5++;

			String d = "";
			if (c3 == 3) {
				d += "Fizz";
				c3 = 0;
			}
			if (c5 == 5) {
				d += "Buzz";
				c5 = 0;
			}
			if (d == "")
				System.out.println(i);
			else
				System.out.println(d);

		}
	}

}
