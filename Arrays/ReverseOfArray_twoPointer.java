package Arrays;

import java.util.Scanner;

public class ReverseOfArray_twoPointer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int k = sc.nextInt();

			reverse(a);
			 disp(a);
			 System.out.println();
			System.out.println("---------------------------");
			rotate(a, n, k);

			disp(a);

		}

	}

	static void disp(int a[]) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
	}

	static void reverse(int a[]) {

		int low = 0;
		int high = a.length - 1;

		while (low <= high) {

			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;

			low++;
			high--;
		}

	}

	static void reverse(int a[], int low, int high) {

		while (low <= high) {

			int temp = a[low];
			a[low] = a[high];
			a[high] = temp;

			low++;
			high--;
		}
	}

	static void rotate(int a[], int n, int k) {

		reverse(a, n - k - 1, k - 1);
		reverse(a, n - k, n - 1);
		reverse(a, 0, n - 1);
	}

}
