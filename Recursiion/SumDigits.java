package Recursiion;

import java.util.Scanner;

public class SumDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
				System.out.println(sum(n));

	}

	static int sum(int n) {
		 int sum = 0; 
         
	        while (n != 0) 
	        { 
	            sum = sum + n % 10; 
	            n = n/10; 
	        } 
	        return sum;

	}
	
	 static int getSum(int n) 
	    { 
	        int sum; 
	  
	        /* Single line that calculates sum */
	        for (sum = 0; n > 0; sum += n % 10, 
	                                  n /= 10); 
	  
	        return sum; 
	    }
	 static int sumDigits(int no) 
	    { 
	        return no == 0 ? 0 : no%10 +  
	                  sumDigits(no/10) ; 
	    } 
	  

}
