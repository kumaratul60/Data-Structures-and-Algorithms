package Mathmetics;

import java.util.Scanner;

public class SubProDigit {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int n = sc.nextInt();
		 
		 int temp = 0;
		 int sub = 0;
		 int product = 1;
		 int sum = 0;
		 int result = 0;
		
		 while(n>0) {
			 temp = n%10;
			 n /=10;
			sum += temp;	
			product *= temp;
			sub -= temp;
			result = product-sum;
			
			}
			 System.out.println("sum:"+sum);
			 System.out.println("sub:"+sub);
			 System.out.println("product:"+product);
			 System.out.println("p-s:"+result);
			

			
		 }

}
