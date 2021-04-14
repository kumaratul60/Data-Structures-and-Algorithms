package Mathmetics;

import java.util.Scanner;

//Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).

public class All_PrimeNum {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int p=2;
	        while(p<=n) {

	            boolean flag=true;
	            int i=2;
	            while(i<p) {

	                if(p%i==0) {
	                    flag=false;
	                    break;
	                }
	                i++;
	            }
	            if(flag==true) {
	                System.out.print(p+" ");
	            }
	            p++;
	        }
	}
}
