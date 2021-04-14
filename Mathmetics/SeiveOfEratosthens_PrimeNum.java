package Mathmetics;

import java.util.Scanner;

public class SeiveOfEratosthens_PrimeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int n = sc.nextInt();
		
		System.out.println("Foloowing are prime number below "+n);

		SeiveOfEratosthens_PrimeNum soe = new SeiveOfEratosthens_PrimeNum();
		soe.SeiveOfEratosthens(n);
	//	System.out.println(soe);  //com.Mathmetics.SeiveOfEratosthens_PrimeNum@15aeb7ab
	
	}
	
	public void SeiveOfEratosthens(int a) {
		
 // Create a boolean array "prime[0..a]" and initialize,  all entries it as true. A value in prime[i] will 
// finally be false if i is Not a prime, else true. 
		
		boolean prime[] = new boolean[a+1];
		
		for(int i=0;i<a;i++)
			prime[i] = true;
		
		for(int p=2;p*p<=a;p++) {
			if(prime[p] == true)   // If prime[p] is not changed, then it is a prime 
			{
				
				for(int i=p*p;i<=a;i+=p) //  Update all multiples of p 
					prime[i] = false;
			}
		}
		
		for(int i=2;i<=a;i++) // Print all prime numbers
		{
			if(prime[i] == true)
				System.out.print(i+" ");
		}
		
// ******* general prime checker method ******************_____--*
		
		boolean isPrime = true;
		for(int i=2;i*i<=a;i++) {
			if(a%i==0)
				isPrime = true;
			break;
		}
		if(a<2)
			isPrime = false;
		System.out.println("\n"+a+ " is prime = "+isPrime );
		
// ************* ______________________*******************-----*****_________	
	}
	
	
}
	
