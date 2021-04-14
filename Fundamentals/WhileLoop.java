package Fundamentals;

import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int i=0,j=0;
			int n = sc.nextInt();
			int arr[] = new int[n];
			while(i<n) {     // entering num
				arr[i] = sc.nextInt();
				i++;
			}
			while(j<n) {     // printing num
				System.out.println(arr[j]);
				j++;
			}
		}
		
	}

}
