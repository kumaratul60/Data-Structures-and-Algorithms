package Fundamentals;

import java.util.Scanner;

public class ForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
				System.out.println(arr[i]);
			}	
		}	
	}
}
