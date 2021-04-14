package Mathmetics;

import java.util.Scanner;

public class Primality {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean isPrime = true;
		
		
		 for(int i=2;i*i<=n;i++) {
			if(n%i == 0) {
				isPrime = false;
				break;
			}
		}
			if(n<2)
				isPrime = false;
			System.out.println(isPrime);
			
		
		
		/*  int div = 2;
		// while(div<=n-1)
		while(div<=n/2) 
		{
			if(n%div == 0) {
				isPrime = false;
			}
			div = div+1;
		}
		if(isPrime)
			System.out.println("Prime");
		else System.out.println("Composite");
		
		*/
		
		
	}
}
	
	


