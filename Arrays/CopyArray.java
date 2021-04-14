package Arrays;

import java.util.Scanner;

public class CopyArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++) 
			a[i] = sc.nextInt();
		int []b = new int[n];
		 
		for(int i=0;i<n;i++) {
			b[i] =a[i];
		
		System.out.println(b[i]+" ");
		}
		
		
	}

}
