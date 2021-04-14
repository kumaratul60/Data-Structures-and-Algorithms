package Mathmetics;

public class Modulo_op {

	public static void main(String[] args) {

		System.out.println(modulo(3978432, 5, 1000000007));

	}

//	Modulo  operator Property : (a+b)%n = (a%n+b%n)%n;
	// (a*b)%n = (a%n*b%n)%n;
	
	static long modulo(long a, long b, int n) {
		long res = 1;
		while (b > 0) {
			if ((b & 1) != 0) {
				res = (res % n * a % n) % n;
			}
			a = (a % n * a % n) % n;
			b = b >> 1;
		}
		return res;
	}

}
