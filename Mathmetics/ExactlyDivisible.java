package Mathmetics;

import java.util.Scanner;

/*
   Given a positive integer value N.
    The task is to find how many numbers less than or equal to N have numbers of divisors exactly equal to 3
 */

public class ExactlyDivisible {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int p = sc.nextInt();
		
		ExactlyDivisible ed  = new ExactlyDivisible ();
	System.out.println(ed.exatle(p));	
		//System.out.println(ed);
		
	}

	public	int exatle(int n) {
	
		int count = 1;
		if(n<=3)
			return 0;
		
		for(int i=3;i<Math.sqrt(n);i++) {
			if(isPrime(i) && (i*i)<=n)
				count++;
		}
		
		return count;
	}
	 
	private  boolean isPrime(int n) {
		int limit = (int)Math.sqrt(n);
		for(int i=2;i<=limit;i++) {
			if(n%i==0)
				return false;
		}
		return true;	
	}


}
