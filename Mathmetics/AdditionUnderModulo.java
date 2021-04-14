package Mathmetics;

/*
   You are given two numbers a and b. You need to find the sum of a and b under modulo M
   Note: Take M as 10^9+7
 */

import java.util.Scanner;

public class AdditionUnderModulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
//		AdditionUnderModulo m = new AdditionUnderModulo();
//		System.out.println(m.sumUnderModulo(a,b));
		
		System.out.println(new Modulo().sumUnderModulo(a,b));
	}
		
}
  class Modulo {
	public static long sumUnderModulo(long a, long b) {
    
        int M=1000000007;
        long c = a%M;
        long d = b%M;
        long result = (a+b)%	M;
        result = (c+d)%M;
        
        return result;
    }   

}
