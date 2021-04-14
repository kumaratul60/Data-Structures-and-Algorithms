package TCS_NQT;

import java.util.Scanner;

public class count_greaterElement {

	// in - 4,9,5,3,2,10
	// op - 0,0,1,3,4,0

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			countgreater(a);

		}

	}

	static void countgreater(int a[]) {
		int n = a.length;
		int temp[] = new int[n];
		int count = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; i++) {
				if (a[j] > a[i])
					count++;
			}

			temp[i] = count;
		}
		for (int i = 0; i < n; i++)
			System.out.print(temp[i] + " ");
	}

}
