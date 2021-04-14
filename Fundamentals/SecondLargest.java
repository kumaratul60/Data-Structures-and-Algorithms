package Fundamentals;

import java.util.Scanner;

public class SecondLargest {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int t = sc.nextInt();
		 int count = 0;
		 while(t-->0) {
	      int a = sc.nextInt();
	      int b = sc.nextInt();
	      int c = sc.nextInt();
	      
	      if((b>a && b<c) )
	    		  System.out.println("u");
	      else
	    	  System.out.println("m");
		 }
	}
	  
}
