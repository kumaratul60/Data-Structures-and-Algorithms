package Fundamentals;

import java.util.Scanner;

public class prime_g {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 for(int i=2;i<n;i++) {
	            int last = n%i;
	            int  l=0;
	            if(last==0) {
	          l = n-last;
	        }
	        System.out.println(last+l);
	}
		 if(n<=1) System.out.println(" ");
	}

}
