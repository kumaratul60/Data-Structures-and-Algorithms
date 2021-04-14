package NinzaPattern;

import java.util.Scanner;

public class p5 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        
	        int i=1;
	       
	       /* while(i<=n) {
	        int j=1;
	       
	        while(j<=i) {
	        	System.out.print(i-j+1);
	            j += 1;
	        }
	        i += 1;
	    System.out.println();
	        }
	        */
	        while(i<=n) {
	        	int j = i;
	        	while(j>=1) {
	        		System.out.print(j);
	        		j -= 1;
	        	}
	        	System.out.println();
	        	i += 1;
	        }
	}

}
