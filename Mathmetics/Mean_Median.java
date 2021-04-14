package Mathmetics;

import java.util.Scanner;

public class Mean_Median {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		Mean_Median mm = new Mean_Median();
		System.out.println(mm.mean(a,n));
		System.out.println(mm.median(a,n));
		
	}
	public int median(int A[],int N) {
		//Array.sort(A);
		int median = 0;
		if(N%2==0)
			median = (A[N/2]+A[(N/2)-1])/2;
		else
			median = A[(N-1)/2];
	    return median;
		
	}
	 public int mean(int A[],int N)
	    {
	       //Your code here
	       int mean =0;
	       for(int i=0;i<N;i++)
	       mean = mean+A[i];
	       return mean/N;

	    }
	   
}
