package Arrays;

import java.util.Scanner;

public class Remoove_Deplicate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();

			int an = (removDup(arr, n));
			for (int i = 0; i < an; i++)
				// System.out.print(arr[i] + " ");

				// System.out.print(ArrayChallenge(arr));
				// System.out.println(count(arr));
				count(arr);

		}

	}

	static int removDup(int a[], int n) {
		int temp = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				a[temp++] = a[i];
			}
		}

		a[temp] = a[n - 1];

		return temp + 1;

	}

	public static int count(int[] arr) {
		int size = arr.length;
		int count = 0;
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {

				if (arr[i] == arr[j]) {
					count++;
					break;
				}
			}
		}
		return count;

	}

}
