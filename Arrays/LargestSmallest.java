package Arrays;

import java.util.Scanner;

public class LargestSmallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int max = a[0];
		int min = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] > max)
				max = a[i];
				//max = i;
			if (a[i] < min)
				min = a[i];
		}
		System.out.println(max);
		System.out.println(min);
	}

}
