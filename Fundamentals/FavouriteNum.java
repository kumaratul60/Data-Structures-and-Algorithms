package Fundamentals;

import java.util.Scanner;

public class FavouriteNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int rem,count= 0;
		while(t-->0) {
			int n = sc.nextInt();
			int d = 5;
		
			while(n != 0) {
				rem = n%10;
				
				if(rem == d) 
					count++;
					n /= 10;
	
		}
		System.out.println(count);
		}
		
	}
}
