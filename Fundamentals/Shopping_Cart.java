package Fundamentals;

import java.util.Scanner;

public class Shopping_Cart {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	      int t = sc.nextInt();
	      
	      while(t-->0) {
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        
	        if(n<=100){
	        	 System.out.printf("%.1f",n*m);
	          }
	          else
	            System.out.println(n*m*0.8);
	      }
	        
	}

}
