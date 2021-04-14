package BitMagic;

import java.util.Scanner;

public class Find_kth_nonReapetingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n]; // 5 4 1 4 3 5 1
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int k = sc.nextInt();

			System.out.println(kth(a, n, k));

		}

	}

	static int kth(int a[], int n, int k) {

		// int size = 32 bit (4bytes)

		int count[] = new int[32];

		for (int i = 0; i < 32; i++)
			for (int j = 0; j < n; j++)

				if ((a[j] & (1 << i)) != 0)
					count[i]++;

		int res = 0;
		for (int i = 0; i < n; i++)
			res += (count[i] % k) * (1 << i);

		return res;

	}

}
