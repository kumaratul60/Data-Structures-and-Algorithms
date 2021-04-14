package Fundamentals;

public class FastPow2 {
	public static void main(String[] args) {
		System.out.println(fastPow(3978432, 5, 1000000007));

	}
	// Modulo property
	// (a+b)%n = (a%n+b%n)%n;
	// (a*b)%n = (a%n*b%n)%n;
	//10ˆ9 + 7;

	static long fastPow(long a, long b, int n) {
		long res = 1;
		while (b > 0) {
			if ((b & 1) != 0) {
				// res = (res%n*a%n)%n;
				res = (res * a % n) % n;
			}
			a = (a % n * a % n) % n;
			b = b >> 1;
		}
		return res;
	}

}
