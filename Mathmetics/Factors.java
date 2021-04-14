package Mathmetics;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		 for(int i=2;i<n;i++) 
			if(n%i==0) {
				
				System.out.print(i+" ");
			}
		
		 
		
		 
			
			
		
			 /*for(int i=2; i<=n; i++){
		            while(n%i==0){
		                System.out.println(i + "| " + n);
		                System.out.println(" -----");
		                n = n/i;
		            }
		        }
		        */

	}

}
