package Arrays;

import java.util.Scanner;

public class SecondLargetElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.println(secondLargets(a, n));

	}
	
//	a[i]>a[largest] : res = largest, largest = i;
//	a[i]==a[largest]: ignore;
//	a[i]<a[largest]: res==-1:res = i;
//	a[i]<=a[res]:ignore
//	a[i]>a[res]:res = i;

	static int secondLargets(int a[], int n) {
		int res = -1, largest = 0;
		for (int i = 1; i < n; i++) {
			if (a[i] > a[largest]) {
				res = largest;
				largest = i;
			} else if (a[i] != a[largest]) {
				if (res == -1 || a[i] > a[res])
					res = i;
			}
		}
		return res;
	}

}
