package Mathmetics;

import java.util.Scanner;

public class prime_test {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int primeCheckNumber;
	        int i = 1;
	        int divisibleCount;

	        while (i <= n-1) {
	         divisibleCount = 0;
	         primeCheckNumber = 2;
	         while (primeCheckNumber <= n/2) {
	          if (n % primeCheckNumber == 0) {
	           divisibleCount++;
	           break;
	          }
	          primeCheckNumber++;
	         }
	         if (divisibleCount == 0 && i != 1) {
	          System.out.println(i + " ");
	         }
	         i++;
	        }
	}
}


	            
	              
	           