package Recursiion;

public class Tail_code_recurtuon {

	public static void main(String[] args) {

		System.out.println(fact_tail(5,1));

		System.out.println(fact_normal(5)); 

		System.out.println(fibonacci(5));
		System.out.println(fibonacci_tail(5, 1, 1));

	}

	// Tail call optimization -> It is way to convert recursive function into
	// iterative function
	// but finally syntex of code is look like recursive method.

	static int fact_tail(int n, int a) {
		while (n != 0) {
			int var = n - 1;
			a = n * a;
			n = var;

		}
		return a;

	}

	static int fact_normal(int n) {
		if (n == 0)
			return 1;
		else
			return n * fact_normal(n - 1);

		// return n == 0 ? 1 : n * fact_tail(n - 1);
	}

	static int fibonacci_tail(int n, int a, int b) {

		while (n != 0 && n != 1) {
			int var0 = n - 1;   // n-1
			int var1 = b;       // n-2
			b += a;
			a = var1;
			n = var0;
		}
		return b;
	}

	static int fibonacci(int n) {

		if (n == 0 || n == 1)
			return 1;
		else
			return fibonacci(n - 1) + fibonacci(n - 2);
	}

}
