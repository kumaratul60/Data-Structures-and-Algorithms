package Mathmetics;

import java.util.Scanner;

public class FactDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int n = sc.nextInt();
//		if(n<0) System.out.println("0");
//		if(n<=1) System.out.println("1");
		
		double digit = 0;
		
		 for(int i=1;i<=n;i++) 
			 digit += Math.log10(i);
		 System.out.println((int)(1+Math.floor(digit)));
			 
			 
			 
		
	}

}
