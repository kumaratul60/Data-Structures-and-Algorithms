package Mathmetics;
/*
 Given a positive integer N. Your task is to check if it divisible as given below:
1. If it is divisible by 2, print "Two".
2. If it is divisible by 3, print "Three".
3. If it is divisible by 11, print "Eleven".
4. If not follow above three rules, print "-1".
Note: If N is divisible by more than one of the above given numbers, print the one which is largest.
 */

import java.util.Scanner;

public class StepByStep_Condition {
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number :");
	int n = sc.nextInt();
	
	if((n%2==0 && n%3!=0) && n%11!=0) 
		System.out.println("Two");
	if((n%3==0 || n%6==0) && n%11!=0)
		System.out.println("Three");
	if(n%11==0)
		System.out.println("Eleven");
	if(n%2!=0 && n%3!=0 && n%11!=0)
		System.out.println("-1");

	}

}
