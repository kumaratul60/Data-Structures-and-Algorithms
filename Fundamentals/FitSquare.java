package Fundamentals;

import java.util.Scanner;

public class FitSquare {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int res = 0;
		while(t-->0) {
			int l = sc.nextInt();
			int w = sc.nextInt();
			int rect = 0;
			int squ = 0;
			
			rect = (l*w);
			squ  = 2*l;
			res = rect%squ;
			
		}
		System.out.println(res);
	}

}
