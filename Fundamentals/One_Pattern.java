package Fundamentals;

import java.util.Scanner;

public class One_Pattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n =  sc.nextInt();
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("1");
				
			}
			System.out.println();
		}
		
	}

}
