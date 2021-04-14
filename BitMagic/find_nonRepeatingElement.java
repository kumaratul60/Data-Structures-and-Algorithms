package BitMagic;

import java.util.Scanner;

public class find_nonRepeatingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n]; // 5 4 1 4 3 5 1
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(nreArr(a, n)); // 3
		}
	}

	static int nreArr(int a[], int n) {
		int res = 0;
		for (int i = 0; i < n; i++)
			res ^= a[i];
		return res;
	}

}
