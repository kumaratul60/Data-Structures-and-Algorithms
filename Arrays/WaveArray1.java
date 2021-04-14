package Arrays;

import java.util.Scanner;

public class WaveArray1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		new WaveArray1();
		WaveArray1.wave(a, n);
		for (int x : a)
			System.out.print(x + " ");
	}

	static void wave(int a[], int n) {
		for (int i = 0; i < n - 1; i++) {
			if (i % 2 == 0) {
				if (!(a[i] < a[i + 1])) {
					int temp = a[i];
					a[i] = a[i + 1];
					a[i + 1] = temp;
					
				} else {
					if (!(a[i] > a[i + 1])) {
						int temp = a[i+1];
						a[i+1] = a[i];
						a[i] = temp;
						
						// same
//						int temp = a[i];
//						a[i] = a[i + 1];
//						a[i + 1] = temp;
					}
					
				}
				
			}
			

		}
	}

}
