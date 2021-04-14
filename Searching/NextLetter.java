package Searching;

import java.util.Scanner;

public class NextLetter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			char chr = sc.next().charAt(0);

			char a[] = new char[n];
			for (int  i = 0; i < n; i++)
				a[i] = sc.next().charAt(0);
			char nextChar = nextChar(a, chr);
			System.out.println(nextChar);
		}

	}

	static char nextChar(char[] a, char ch) {
		int low = 0;
		int high = a.length - 1;
		char res = '$';
		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (a[mid] == ch)
				low = mid + 1;
			else if (a[mid] > ch) {
				res = a[mid];
				high = mid - 1;
			} else
				low = mid + 1;
		}
		return res;

	}

}
