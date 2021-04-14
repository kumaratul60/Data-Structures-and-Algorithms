package Arrays;

import java.util.Scanner;

public class MaxArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the array element");
	//	int n = sc.nextInt();
		//int[] a= new int[n];
		int a[] = {5,6,25,8,2,10,4,56,89,14,12,32};
		int max = a[0];
		int min = a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
				max = a[i];
			else if(a[i]<min)
				min = a[i];
		}
		System.out.println("max element is = "+max);
		System.out.println("min element is = "+min);


	}

}
