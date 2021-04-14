package Arrays;

import java.util.Scanner;

public class Deletion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		// int x = sc.nextInt();
		int pos = sc.nextInt();

		Deletion del = new Deletion();
		System.out.println(del.delete(a, n, pos));
		del.print(a, n);

	}

//	int delete(int a[], int n, int x) {
//		int i = 0;
//		for (i = 0; i < n; i++)
//			if (a[i] == x)
//				break;
//		if (i == n)
//			return n;

	int delete(int a[], int n, int pos) {

		for (int j = pos; j < n - 1; j++)
			a[j] = a[j + 1];
		return n - 1;

	}

	void print(int a[], int n) {
		for (int i = 0; i < n - 1; i++)
			System.out.print(a[i] + " ");
	}

}
