package Arrays;

import java.util.Scanner;

public class SmallLarge {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		new SmallLarge();
		SmallLarge.smallLarge(a, n);

	}

	static void smallLarge(int a[], int n) {
		int small,sec_small, large,sec_large;

		small = sec_small= large = sec_large= a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] < small) {
				
			sec_small= small;
				small = a[i];
			}
			
			
			if (large < a[i]) {
				sec_large = large;
			
				large = a[i];
			}
			
		}
		System.out.println("small = " + small + " ,  sec_small"+ sec_small+" , sec_large"+ sec_large+" , large = " + large);
	}

}
