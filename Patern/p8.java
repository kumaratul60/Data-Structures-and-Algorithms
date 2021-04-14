package Patern;

import java.util.Scanner;

public class p8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--)
				System.out.print(" ");
			for(int k=1;k<i*2;k++)
				System.out.print("*");
			System.out.println();
			
		}
		System.out.println();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--)
				System.out.print(" ");
			for(int k=1;k<i*2;k++) {
				if(k>1 && k<i*2-1)
					System.out.print(" ");
				else
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}
