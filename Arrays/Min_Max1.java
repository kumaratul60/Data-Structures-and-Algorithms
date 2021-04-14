package Arrays;

import java.util.Scanner;

public class Min_Max1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		
		Min_Max1 mn = new Min_Max1();
		System.out.print(mn.min(a, n)+" ");
		System.out.print(mn.max(a, n)+" ");
		}
		
	}
		
		public static int min(int a[],int n) {
			int min= a[0];
			
			
			for( int i=0;i<n;i++) {
				if(a[i]<min)
					min = a[i];
				
			}
			return min;
			
		}
		
		public static int max(int a[],int n ) {
			int max= a[0];
			for(int i=1;i<n;i++) {
				if(a[i]>max)
					max = a[i];
			}
			return max;
		}
		
}
