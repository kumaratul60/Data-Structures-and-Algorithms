package Arrays;

import java.util.Scanner;

public class Left_Right_RotateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

//			System.out.println("Reverse of original array");
//			reverse(a, 0, n - 1);
//			printArray(a, n);
//			System.out.println();

			System.out.println(k + " place Right rotation of array");
			rightRotation(a, k);
			printArray(a, n);
			System.out.println();

//			System.out.println(k + " place Left rotation of array");
//			leftRotation(a, k);
//			printArray(a, n);
//			System.out.println();

		}
	}

	static void reverse(int a[], int low, int high) {

//		while (low < high) {
//			int temp = a[low];
//			a[low] = a[high];
//			a[high] = temp;
//			low++;
//			high--;
//		}
		while (low >= high)
			return;
		int temp = a[low];
		a[low] = a[high];
		a[high] = temp;
		reverse(a, low + 1, high - 1);
	}

	static void leftRotation(int a[], int k) {
		int n = a.length;
		k = k % n;
		if (k < 0)
			k = k + n;

		reverse(a, 0, k - 1);
		reverse(a, k, n - 1);
		reverse(a, 0, n - 1);

	}

	static void rightRotation(int a[], int k) {
		int n = a.length;
		k = k % n;
		if (k < 0)
			k += n;
		reverse(a, 0, n - k - 1);
		reverse(a, n - k, n - 1);
		reverse(a, 0, n - 1);
	}

	static void printArray(int a[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(a[i] + " ");
	}

}
