package Arrays;

import java.util.Scanner;

public class Insert {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the capacity of array:");
		int cap = sc.nextInt();
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Array element:");
		for (int i = 0; i < a.length; i++)
			a[i] = sc.nextInt();

		System.out.println("Enter the element to be inserted:");
		int x = sc.nextInt();
		System.out.println("Enter the position or index where you want to insert:");
		int pos = sc.nextInt();

		for (int i = n-1 ; i > pos; i--) {
			a[i] = a[i - 1];
			//a[i + 1] = a[i];
		}
		a[pos] = x;
		++n;

		for (int i = 0; i < n-1; i++)
			System.out.print(a[i] + " ");
	}
	

}
