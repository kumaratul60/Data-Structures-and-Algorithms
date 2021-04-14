package Fundamentals;

public class ModuloFastPower {
	public static void main(String[] args) {
		// System.out.println(fastPower(316162,5));
		System.out.println(fastPower(3, 5));

	}
	
//Modulo prop:
	// a^b = (a^2)b/2 when b is even;
	// = a.a^b-1 when b is odd;

	// bit prop;
	// right shift(>>), left shift(<<)
	// b>>1 == b/2;
	// b<<1 == b*2;
	
	static int fastPower(int a, int b) {
		int res = 1;
		while (b > 0) {
			if ((b & 1) != 0) {
				res *= a;
			}
			a = a * a;
			b = b >> 1;
		}
		return res;
	}

}
