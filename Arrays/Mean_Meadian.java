package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Mean_Meadian {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n ; i++)
			a[i] = sc.nextInt();

		Mean_Meadian mm = new Mean_Meadian();

		System.out.println(mm.median(a, n));
		System.out.println(mm.mean(a, n));

	}

	int median(int a[], int n) {
		Arrays.sort(a); // for result in sorting order
		int median = 0;
		if (n % 2 == 0)
			median = (a[n / 2] + a[(n / 2) - 1]) / 2;
			
		else
			median = a[(n - 1) / 2];
		return median;
	}

	int mean(int[] a, int n) {
		int mean = 0;
		for (int i = 0; i < n; i++)
			mean += a[i];
		return (int) mean / n;
	}

}
