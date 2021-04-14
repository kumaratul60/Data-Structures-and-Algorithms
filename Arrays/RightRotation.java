package Arrays;

import java.util.Scanner;

public class RightRotation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the test cases:");
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			rotate(a, k);

			for (int i = 0; i < a.length; i++)
				System.out.print(a[i] + " ");

		}
	}

	public static void reverse(int a[], int start, int end) {
		while (start < end) {
			int temp = a[start];
			a[start] = a[end];
			a[end] = temp;
			start++;
			end--;
		}

	}

	public static void rotate(int a[], int k) {
		k = k % a.length;
		if (k < 0)
			k = k + a.length;
		reverse(a, 0, a.length - k-1);
		reverse(a, a.length - k, a.length - 1);
		reverse(a, 0, a.length - 1);

	}

}
