package Fundamentals;

import java.util.Scanner;

public class Reverse_Num {
	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	
	int reverse = 0;
	while(n!=0) {
		int rem = n%10;
		reverse = reverse*10+rem;
		n /= 10;

	}
	
	
//	for(; n!=0;n/=10) {
//		int rem = n%10;
//		reverse = reverse*10 + rem;
//	}
	System.out.println(reverse);
	}
}