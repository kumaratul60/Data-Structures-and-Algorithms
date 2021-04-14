package String.java_basic;

import java.math.BigInteger;

public class StringTypeCast { 	
	public static void main(String[] args) {
		
		// typecasting always happense btween one datatype to another datatype or one objext to another object.
		
		// object to dataType use "Integer.paeseDataType(object)",same as String to int use "String.valueOf()".
		
		// string can't store in integer using typecasting.
		
		// when convert object(string) to dataType use Wrapper class(Integer.parseInt).
		 	
		String s = "10";
		int x = Integer.parseInt(s);
		System.out.println(s);
		System.out.println(x);
		System.out.println(s+s);
		System.out.println(x+x);
		
		System.out.println();
		int y = 10;
		String z = String.valueOf(y);
		System.out.println(z);
		System.out.println(z+z);
		System.out.println(y);
		System.out.println(y+y );
		
		System.out.println();
		BigInteger p = 	BigInteger.valueOf(10);
		BigInteger q = 	BigInteger.valueOf(10);
		System.out.println(p.add(q));
		
		System.out.println();
//		String s1 = 10;// error
		String s2 = String.valueOf(10);
		System.out.println(s);
		
		System.out.println();
	//BigInteger x = 10;// error
	BigInteger x1 = BigInteger.valueOf(10);
	System.out.println(x1);
	}
}
