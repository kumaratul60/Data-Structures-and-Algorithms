package Arrays;

import java.util.Scanner;

public class pizzas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(add(a, n));

	}

	static int add(int a[], int n) {
		int sum = 0;
		while(n%4==0) {
		

		int temp = 0, rTemp = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] % 2 == 0) {

				temp = (a[i] - (a[i] / 2));
				rTemp = a[i] - temp;

			}
			temp = secSmallest(a, n);
			rTemp = secSmallest(a, n);
			
		}
		sum = temp + rTemp;
		}
		return sum;
	}

	static int secSmallest(int a[], int n) {

		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			if (a[i] == smallest)
				secondSmallest = smallest;
			else if (a[i] < smallest) {
				secondSmallest = smallest;
				smallest = a[i];
			} else if (a[i] < secondSmallest)
				secondSmallest = a[i];
		}
		return secondSmallest;

	}

}
