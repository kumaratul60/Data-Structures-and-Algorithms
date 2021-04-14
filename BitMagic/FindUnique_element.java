package BitMagic;

import java.util.Scanner;

public class FindUnique_element {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n]; // 5 4 1 4 3 5 1
			int k = sc.nextInt();
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(findUnique(a, n, k));
		}
	}

	static int findUnique(int a[], int n, int k) {

		int count[] = new int[n];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				if ((a[j] & (1 << i)) != 0)
					count[i] += 1;
		int res = 0;
		for (int i = 0; i < n; i++)
			res += (count[i] % k) * (1 << i);
		return res;
	}

}
