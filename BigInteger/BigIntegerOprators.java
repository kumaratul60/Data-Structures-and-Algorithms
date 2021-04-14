package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerOprators {
	public static void main(String[] args) {
		 // Scanner sc = new Scanner(System.in);
		
			  BigInteger a = BigInteger.valueOf(999988577);
			  BigInteger b = BigInteger.valueOf(526365656);
			//  BigInteger sum = BigInteger.TEN;
			
			  System.out.println("add:"+a.add(b));
			  System.out.println("Sub:"+a.subtract(b));
			  System.out.println("multiply:"+a.multiply(b));
			  System.out.println("divide:"+a.divide(b));
			  System.out.println("remainder:"+a.mod(b));
			  
			  BigInteger c = new BigInteger("9223372036854775809");
			  BigInteger d =  new BigInteger("9223372036854775809526365656");
			  System.out.println("add: "+c.add(d));


	}

}
