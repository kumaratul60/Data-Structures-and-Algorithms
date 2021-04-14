package Recursiion;

import java.util.Scanner;

public class Kth_Sysmbol_Grammer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			int kth = kthGrammer(n, k);
			System.out.println(kth);
		}
	}

	static int kthGrammer(int n, int k) {
		if (n == 1 && k == 1)
			return 0;
		int mid = (int) Math.pow(2, n - 1) / 2;
		if (k <= mid)
			return kthGrammer(n - 1, k);
		else
			return kthGrammer(n - 1, k - mid) == 0 ? 1 : 0;
	}

}
