package Recursion_ADV;

import java.util.Scanner;

public class First_last_Occurrence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int key = sc.nextInt();
			int pos = 0;
			System.out.println(firstOcc(a, n, pos, key));
			System.out.println(lastOcc(a, n, pos, key));

		}
	}

	static int firstOcc(int a[], int n, int pos, int key) {
		if (pos == n)
			return -1;

		if (a[pos] == key)
			return pos;
		return firstOcc(a, n, pos + 1, key);

	}

	static int lastOcc(int a[], int n, int pos, int key) {
		if (pos == n)
			return -1;

		int restArr = lastOcc(a, n, pos + 1, key);
		if (restArr != -1)
			return restArr;
		if (a[pos] == key)
			return pos;
		return -1;
	}

}
