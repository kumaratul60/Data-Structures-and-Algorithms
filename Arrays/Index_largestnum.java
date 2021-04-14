package Arrays;

import java.util.Scanner;

public class Index_largestnum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		int index = 0;
		// int max = a[0];
		for (int i = 1; i < n; i++) {
//			if(a[i]>max) {
//				max = a[i];
//				index = i;
			if (a[i] > a[index]) {
				//index = a[i];
				index = i;
			}
		}
		System.out.println("Index position of Maximum value in an array is  :  " + index);

	}

}
