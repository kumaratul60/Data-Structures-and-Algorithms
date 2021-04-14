package Fundamentals;

import java.util.Scanner;

public class First_digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			
			while(n>=10) 
				n /= 10;
			System.out.println(n);
			}
			
		}
		
	}
