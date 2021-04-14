package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class factBig {
	public static void main(String[] args) {
		
	/*	Scanner sc = new Scanner(System.in);
//		while(sc.hasNextBigInteger()) {
//			BigInteger n = sc.nextBigInteger();
			BigInteger fact = BigInteger.valueOf(1);
			for(int i=9;i<=99;i++) {
				for(int j=1;j<=10;j++) {
					
				//	fact = fact.multiply(BigInteger.valueOf(j));
					fact = BigInteger.valueOf(i).multiply(BigInteger.valueOf(j));
				//System.out.println(i+"! "+"--> "+fact);
				//System.out.print(i+" x "+j+" = " + fact);
					System.out.print(fact);
				System.out.println();
				}
				
			}
			*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Num: ");
		int n = sc.nextInt();
		
		System.out.println(fact(n));
	}
		 static BigInteger fact(int n) {
			//  BigInteger f = new BigInteger("1");
			  BigInteger f =  BigInteger.ONE;

			  for(int i=1;i<=n;i++) 
			  
				  f = f.multiply(BigInteger.valueOf(i));
			 
			  return f;
			  
		  }
	
}
