package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class sumBigInteger {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  while(sc.hasNextBigInteger()) {
			  BigInteger a = sc.nextBigInteger();
			  BigInteger b = sc.nextBigInteger();
			  BigInteger sum = BigInteger.TEN;
			  sum = a.add(b);
			  System.out.println("+: "+sum);
			  BigInteger pro = BigInteger.TEN;
			  pro = a.multiply(b);
			  System.out.println("*: "+pro);
			  BigInteger sub = BigInteger.TEN;
			  sub = a.subtract(b);
			  System.out.println("-: "+sub);
			  BigInteger divide = BigInteger.TEN;
			  divide = a.divide(b);
			  System.out.println("/: "+divide);
			  BigInteger reminder = BigInteger.TEN;
			  reminder = a.remainder(b);
			  System.out.println("%: "+reminder);
			    
		  }
	}

}
