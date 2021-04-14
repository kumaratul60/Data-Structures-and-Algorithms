package Arrays;

import java.util.Scanner;

public class LargestIndex_Element {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			System.out.println(new LargestIndex_Element().largest(a, n));

		}
	}

	static int largest(int a[], int n) {
		for (int i = 0; i < n; i++) {
			boolean flag = true;
			for (int j = 0; j < n; j++) {
				if (a[i] < a[j]) {
					flag = false;
					break;
				}

			}
			if (flag == true)
				return a[i];
		}
		return -1;
	}

}
