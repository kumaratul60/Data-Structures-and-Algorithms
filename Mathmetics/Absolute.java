package Mathmetics;

import java.util.Scanner;
//import static java.lang.Math.abs;
//import java.lang.*;

public class Absolute {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
	
		Absolute abs = new Absolute();
		
		System.out.println(abs.Abs(n));
		
		
		
	}
	int Abs(Integer I) {
	
		
		return I>=0 ? I : -1*I;
	}

}
