package Arrays;

import java.util.Scanner;

public class SecondSmallestNum {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int a[] = new int[n];
//		for (int i = 0; i < n; i++)
//			a[i] = sc.nextInt();
//		System.out.println(secSmallest(a, n));

		int a[] = { 6, 8, 39, 7, 2, 35, 2, 6, 4, 0, 8, 9, 256 };
		System.out.println(second(a, a.length));
	}

	static int secSmallest(int a[], int n) {

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (a[i] == smallest)
				secondSmallest = smallest;
			else if (a[i] < smallest) {
				secondSmallest = smallest;
				smallest = a[i];
			} else if (a[i] < secondSmallest)
				secondSmallest = a[i];
		}
		return secondSmallest;

	}

	static int second(int a[], int n) {
		int sec, first;
		sec = first =  -1;
		for (int i = 0; i < n; i++) {
			if (a[i] > first) {
				sec = first;
				first = a[i];
			}
			if (a[i] > sec && a[i] != first) {

				sec = a[i];
			}
		}
		return sec;
	}

}
