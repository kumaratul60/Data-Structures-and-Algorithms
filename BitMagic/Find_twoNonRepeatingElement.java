package BitMagic;

import java.util.Scanner;

public class Find_twoNonRepeatingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n]; // 5 4 1 4 3 5 1
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			nre2(a, n); //2,3
		}
	}

	static void nre2(int a[], int n) {

		int res = 0;
		int temp = 0;

		int ans1 = 0;
		int ans2 = 0;

		for (int i = 0; i < n; i++) {
			res ^= a[i];
			temp = res;
		}
		for (int i = 0; i < n; i++) {
			if ((a[i] & 1) != 0)
				temp ^= a[i];
		}
		ans1 = temp;
		ans2 = ans1 ^ res;
		System.out.println(ans1 + "," + ans2);

	}

}
