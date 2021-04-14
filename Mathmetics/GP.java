package Mathmetics;

import java.util.Scanner;

public class GP {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter the numbers : ");
		 int n = sc.nextInt();
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    
		   
			  double r = (double)a/(double)b;

		   
		    System.out.println((int)Math.floor(a*Math.pow(r,n-1)));
	}

}
