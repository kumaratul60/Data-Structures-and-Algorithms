package Arrays;

import java.util.Scanner;

public class LongestArithmeticSubArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int sub = longSub(a, n);
			System.out.println(sub);
		}
	}

	static int longSub(int a[], int n) {
		int ans = 2;
		int privous_diff = a[1] - a[0];
		int j = 0;
		int curr = 2;
		while (j < n) {
			if (privous_diff == a[j] - a[j - 1])
				curr++;
			else {
				privous_diff = a[j] - a[j - 1];
				curr = 2;
			}
			ans = Math.max(ans, curr);
			j++;
		} 
		System.out.println(ans);
		return 0;

	}

}
