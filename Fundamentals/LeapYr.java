package Fundamentals;

import java.util.Scanner;

public class LeapYr {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			LeapYr ly = new LeapYr();
			System.out.println(ly.check(n) ? "YES":"NO");
			
//			if((n%4 == 0 & n%400 == 0 || n%100 != 0))
//				System.out.println("YES");
//			else
//				System.out.println("NO");
			
			
		}
	}
	static boolean check(int n) {
		return ((n%4 == 0 & n%100 != 0) || (n%400 == 0));
		//return (n%4==0) || (n%400==0 && n%100!=0);
	}

}
