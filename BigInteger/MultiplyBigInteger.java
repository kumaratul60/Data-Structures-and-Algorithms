package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigInteger {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		BigInteger m = mul(a, b);
		System.out.println(m);
	}

//		  while(sc.hasNextBigInteger()) {
//			  BigInteger a = sc.nextBigInteger();
//			  BigInteger b = sc.nextBigInteger();
//			  BigInteger mul = BigInteger.TEN;
//			  mul = a.multiply(b);
//			  System.out.println(mul);  
//		  }

	static BigInteger mul(BigInteger x, BigInteger y) {

		// Your code here

		BigInteger mul = BigInteger.TEN;
		mul = x.multiply(y);
		return mul;

	}

}
