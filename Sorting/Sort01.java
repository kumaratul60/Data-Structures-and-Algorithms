package Sorting;

import java.util.Scanner;

public class Sort01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			sort01(a,n);;
			printArray(a,n);
			
		}
	}
	static void sort01(int a[],int n) {
		int i=0;
		int j =0;
		while(i<n) {
			if(a[i]==1)
				i++;
			else {
				int temp  = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j++;
			}
		}
	}
	static void printArray(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}


}
