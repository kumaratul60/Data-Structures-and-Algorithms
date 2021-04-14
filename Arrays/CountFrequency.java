package Arrays;

import java.util.Scanner;

public class CountFrequency {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		new CountFrequency();
		CountFrequency.countF(a, n);

	}

	static void countF(int a[], int n) {
		for (int i = 1; i <=n; i++) {
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (a[j] == i)
					count++;
			}
			//System.out.println(i + " " + count);
			System.out.print(count+" ");
		}

	}

}
