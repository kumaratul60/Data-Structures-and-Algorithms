package Fundamentals;

public class GCD {
	public static void main(String[] args) {
		System.out.println(gcd(24, 60));

	}

	static int gcd(int a, int b) {
		
//		 if(b==0) return a;
//		 return gcd(b,a%b);
		
		return a % b == 0 ? b : gcd(b, a % b);
	}

}
