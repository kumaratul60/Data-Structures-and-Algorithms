package Arrays;

import java.util.Scanner;

public class Leader {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		Leader ldr = new Leader();
		ldr.leader(a, n);
	}

	void leader(int a[], int n) {
		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = i + 1; j < n; j++) {
				if (a[i] <= a[j]) {
					flag = true;
					break;
				}
			}
			if (flag == false)
				System.out.print(a[i]+" ");
		}

	}

//	void leader(int a[], int n) {
//		int curr_ldr = a[n - 1];
//		System.out.print(curr_ldr+" ");
//		for (int i = n - 2; i >= 0; i--) {
//			if (curr_ldr < a[i]) {
//				curr_ldr = a[i];
//				System.out.print(curr_ldr+" ");
//			}
//		}
//	}

}
