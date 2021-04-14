package Mathmetics;

import java.util.Scanner;

public class Primality_Check {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int div = 2;
		while(div*div<=n) 
		//while(div<=n-1) 
		//while(div<=n/2) 
		
		{
			if(n%div == 0) {
				System.out.println("Composite");
			return;
		}
		div += 1;
		}
		System.out.println("prime");
		
		
		
		/* boolean isPrime = true;
		if(n%2 == 0)
			isPrime = false;
		int i = 3;
		while (isPrime && i<n) {
			isPrime = !(n%i==0);
			i += 2;
		}
		if(isPrime) 
			System.out.println("Prime");
		else System.out.println("Composite");
		*/
	
	}

}
