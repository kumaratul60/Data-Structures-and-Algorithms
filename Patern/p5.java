package Patern;

import java.util.Scanner;

public class p5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=n;j>=i;j--)
				System.out.print(" ");
			//for(int k=1;k<=i;k++)
			//System.out.print(" *");
			for(int k=1;k<i*2;k++)
				System.out.print("*");
			System.out.println();
		}
		System.out.println();
		for(int i=n;i>=1;i--) {
			for(int j=n;j>i;j--) 
				System.out.print(" ");
			for(int k=1;k<(i*2);k++)
				System.out.print("*");
			
			System.out.println();
		}
	}
}
