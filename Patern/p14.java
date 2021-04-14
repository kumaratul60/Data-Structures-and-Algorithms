package Patern;

import java.util.Scanner;

public class p14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		
		for(int i=1;i<=3;i++) {
			
			for(int j=1;j<=5;j++) {
				//if(j<=n+1-i || j>=n+1+i) 
				if(j>=4-i && j<=2+i)
					System.out.print("*");
			
				else 
					System.out.print(" ");
			
			}
				
			System.out.println();
				
			}
	}
}
