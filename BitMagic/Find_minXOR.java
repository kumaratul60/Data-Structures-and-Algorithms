package BitMagic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Find_minXOR {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n]; // 5 4 1 4 3 5 1
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(minXOR(a));
		}

	}

	static int minXOR(ArrayList<Integer> a) {
		Collections.sort(a);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.size() - 1; i++) {
			int xor = a.get(i) ^ a.get(i + 1);
			min = Math.min(xor, min);
		}
		return min;
	}

	static int minXOR(int[] a) {
		Arrays.sort(a);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length - 1; i++) {
			int xor = a[i] ^ a[i + 1];
			min = Math.min(xor, min);
		}
		return min;

	}

}
