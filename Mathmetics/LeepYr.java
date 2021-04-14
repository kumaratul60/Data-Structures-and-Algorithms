package Mathmetics;

import java.util.Scanner;

public class LeepYr {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the year : ");
		    int year = sc.nextInt();
		    
		   if((year%4 == 0) && (year%100 != 0) || (year%400 == 0))
			   System.out.println("Yes");
		   else System.out.println("No");
	}

}
