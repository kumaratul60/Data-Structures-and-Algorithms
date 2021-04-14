package Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseOfArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			new ReverseOfArray();
			ReverseOfArray.reverseArray8(a);
		}
	}

	static void reverse1(int a[], int n) {
		for (int i = n - 1; i >= 0; i--)
			System.out.print(a[i] + " ");
		int[] b = new int[n];
		int j = n;
		for (int i = 0; i < n; i++) {
			b[j - 1] = a[i];
			j = j - 1;
		}

		/* printing the reversed array */

		for (int k = 0; k < n; k++) {
			System.out.print(b[k] + " ");
		}
	}

	static void reverse2(int a[], int n) {
		int i, k, t;
		for (i = 0; i < n / 2; i++) {
			t = a[i];
			a[i] = a[n - i - 1];
			a[n - i - 1] = t;
		}

		/* printing the reversed array */

		for (k = 0; k < n; k++) {
			System.out.print(a[k] + " ");
		}
	}

	static void reverse3(Integer a[]) {
		Collections.reverse(Arrays.asList(a));
		System.out.println(Arrays.asList(a));
	}

	static void rvereseArray4(int arr[], int start, int end) {
		int temp;
		if (start >= end)
			return;
		temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		rvereseArray4(arr, start + 1, end - 1);
	}

	/* Utility that prints out an array on a line */
	static void printArray(int arr[], int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
		System.out.println("");
	}

	static void rvereseArray5(int arr[], int start, int end) {
		int temp;

		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	/*
	 * Utility that prints out an array on a line
	 */
	static void printArray5(int arr[], int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

//Function to reverse array 
	static void reverseArray6(int arr[], int n) {
		// Trick to assign -1 to a variable
		int x = (Integer.MIN_VALUE / Integer.MAX_VALUE);

		// Reverse array in simple manner
		for (int i = 0; i < n / 2; i++)

			// Swap ith index value with (n-i-1)th
			// index value
			swap(arr, i, n + (x * i) + x);
	}

	static int[] swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}

//Function to reverse array 
	static void reverseArray7(int arr[], int n) {

		// Reverse array in simple manner
		for (int i = 0; i < n / 2; i++)

		// Swap ith index value with (n-i-1)th
		// index value
		// Note : A - B = A + ~B + 1
		// So n - i = n + ~i + 1 then
		// n - i - 1 = (n + ~i + 1) + ~1 + 1
		{
			swap2(arr, i, (n + ~i + 1) + ~1 + 1);
		}
	}

	static int[] swap2(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		return arr;
	}
	
	static int[] reverseArray8(int a[]) {
		int[] rvers = new int[a.length];
		for(int i=0;i<a.length;i++)
			rvers[i] = a[(a.length-i-1)];
		return rvers;
	}

}
