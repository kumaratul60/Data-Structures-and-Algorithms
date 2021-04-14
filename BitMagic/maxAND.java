package BitMagic;

import java.util.Scanner;

public class maxAND {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n]; // 4 8 12 16
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(maxAnd(a, n)); // 8
			System.out.println(maxAnd_checkBit(a, n)); // 8
		}
	}

	static int maxAnd(int a[], int n) {
		int res = 0;
		for (int i = 0; i < n; i++)
			for (int j = i + 1; j < n; j++)
				res = res > (a[i] & a[j]) ? res : a[i] & a[j];
		return res;

	}

	static int checkBit(int pattern, int a[], int n) {
		int count = 0;
		for (int i = 0; i < n; i++)
			if ((pattern & a[i]) == pattern)
				count++;
		return count;
	}

	static int maxAnd_checkBit(int a[], int n) {
		int res = 0, count;
		for (int bit = 31; bit >= 0; bit--) {
			count = checkBit(res | (1 << bit), a, n);
			if (count >= 2)
				res |= (1 << bit);
		}
		return res;
	}

}
