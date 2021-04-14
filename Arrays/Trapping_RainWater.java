package Arrays;

import java.util.Scanner;

public class Trapping_RainWater {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//FastScanner Fs = new FastScanner();

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			System.out.println(getWater1(a, n));
		}

	}
	
	// i=0 and i= n-1, doesn't store the water make a diagram and check

	static int getWater(int a[], int n) {

		int res = 0;

		for (int i = 1; i < n - 1; i++) {

			int lmax = a[i];

			for (int j = 0; j < i; j++)
				lmax = Math.max(lmax, a[j]);

			int rmax = a[i];

			for (int j = i + 1; j < n; j++)
				rmax = Math.max(rmax, a[j]);

			res = res + (Math.min(lmax, rmax) - a[i]);

		}
		return res;

	}

//// ************Optimize Way**********************

	static int getWatr(int a[], int n) {

		int res = 0;

		int lMax[] = new int[n];
		int rMax[] = new int[n];

		lMax[0] = a[0];
		for (int i = 1; i < n; i++)
			lMax[i] = Math.max(a[i], lMax[i - 1]);

		rMax[n - 1] = a[n - 1];
		for (int i = n - 2; i >= 0; i--)
			rMax[i] = Math.max(a[i], rMax[i + 1]);

		for (int i = 1; i < n-1; i++)
			//for (int i = 1; i < n; i++)
			res += (Math.min(lMax[i], rMax[i]) - a[i]);

		return res;

	}

/////////////////////////////////////////////////Space optimize//////////////

	static int getWater1(int a[], int n) {

		int res = 0;

		int lMax = 0, rMax = 0;

		int left = 0, right = n - 1;

		while (left <= right) {
			if (a[left] < a[right]) {
				if (a[left] > lMax)
					lMax = a[left];
				else
					res = res + lMax - a[left];
				left++;
			} else {
				if (a[right] > rMax)
					rMax = a[right];

				else
					res += rMax - a[right];
				right--;

			}
		}
		return res;
	}

}
