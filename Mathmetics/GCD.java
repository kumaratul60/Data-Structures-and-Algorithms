package Mathmetics;

import java.util.Scanner;

public class GCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num");
		int a = sc.nextInt();
		int b = sc.nextInt();

		GCD gcd = new GCD();
		System.out.println(gcd.gcd(a, b));

	}

	int gcd(int a, int b) {

		/*
		 * if(a==0 || b==0) return 0;
		 * 
		 * if(a==b) return b;
		 * 
		 * if(a>b) return gcd(a-b,b);
		 * 
		 * return gcd(a,b-a);
		 */
		if(b==0)
			return a;
		else
			return gcd(b,a%b);
		
	}

}
