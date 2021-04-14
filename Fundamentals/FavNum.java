package Fundamentals;

import java.util.Scanner;

public class FavNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
	    while(t-->0) // t-- > 0
	    {
	    	int n = sc.nextInt();
	    	int rem,count=0;
	    	while(n!=0) {
	    		rem = n%10;  // give the last digit
	    		
	    		if(rem == 5)
	    		count++;
	    		
	    		n /= 10;	// remove the last digit
	    		
	    	}
	    		System.out.println(count);
	    }
	}
}
