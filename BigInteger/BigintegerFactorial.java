package BigInteger;

import java.math.BigInteger;
import java.util.Scanner;

public class BigintegerFactorial {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
/*		 // from int mathod gives only 13! correct output,bcoz int range is 2147483647.
		 
		 int n = sc.nextInt();
		 
		 for(int i=0;i<=n;i++) {
			 int fact = 1;
			 for(int j=1;j<=i;j++) 
				 fact = fact*j;
				 System.out.println(i+"!"+" --> "+fact);
		 }
		 
		 // from long mathod gives only 18! correct output,bcoz int range is 9223372036854775807.

		 System.out.println();
		 for(int i=0;i<=n;i++) {
			 long fact = 1;
			 for(int j=1;j<=i;j++) 
				 fact = fact*j;
				 System.out.println(i+"!"+" --> "+fact);
		 }
		 */
			 BigInteger fact = BigInteger.valueOf(1);
			 for(int j=1;j<=89;j++) 
				 fact = fact.multiply(BigInteger.valueOf(j));
				 System.out.println(fact);
				 
				 System.out.println();
				 BigInteger f = BigInteger.ONE;
				// BigInteger f = BigInteger.TWO;
				// BigInteger f = BigInteger.TEN;
				// BigInteger f = BigInteger.ZERO;



				 for(int i=1;i<=5;i++)
					 f = f.multiply(BigInteger.valueOf(i));
				 System.out.println(f);

		 
		 
	}

}
