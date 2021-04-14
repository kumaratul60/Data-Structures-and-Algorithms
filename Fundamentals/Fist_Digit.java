package Fundamentals;

import java.util.*;
import java.io.*;

public class Fist_Digit {
 public static void main(String args[]) throws IOException {
	    
		  Scanner sc = new Scanner(System.in);

		  int t = sc.nextInt();
		 
		  while(t-->0) {
			  int n = sc.nextInt();
			  
			   while(n>=10) {
				  n /= 10;
				
		 }
		       
				  System.out.println(n);
				 
	
			  }
		
		 
	  }
	}
	