package Arrays;

import java.util.Scanner;

public class CountInversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {

			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(mergeSort(a, 0, n - 1));
		}

	}

	static long mergeSort(int a[], int left, int right) {
		long inv = 0;
		if (left < right) {
			int mid = (left + right) / 2;
			inv += mergeSort(a, left, mid);
			inv += mergeSort(a, mid + 1, right);
			inv += merge(a, left, mid, right);
		}
		return inv;
	}

	static long merge(int arr[], int left, int mid, int right) {

		long inv = 0;
		int n1 = mid - left + 1;
		int n2 = right - mid; // right-(mid+1)+1;

		int a[] = new int[n1];
		int b[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			a[i] = arr[left + i];
		}
		for (int i = 0; i < n2; i++) {
			b[i] = arr[mid + 1 + i];
		}

		int i = 0, j = 0, k = left;
		while (i < n1 && j < n2) {
			if (a[i] < b[j]) {
				arr[k] = a[i];
				k++;
				i++;
			} else {
				arr[k] = b[j];

				inv += n1 - i; // this is for count inversion

				// a[i],a[i+1],a[i+2].......>b[j] and i<j ----> that is inversion
				k++;
				j++;
			}

		}
		while (i < n1) {
			arr[k] = a[i];
			k++;
			i++;
		}
		while (j < n2) {
			arr[k] = b[j];
			k++;
			j++;
		}
		return inv;
	}

}
