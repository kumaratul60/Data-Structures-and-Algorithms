package Searching;

import java.util.Scanner;

public class BuildingFacing_sun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int max = facing(a, n);
			System.out.println(max);
		}
	}

	static int facing(int a[], int n) {
		int count = 1;
		int curr_Max = a[0];
		for (int i = 0; i < n; i++) {
			if (a[i] > curr_Max) {
				count++;
				curr_Max = a[i];
			}
		}
		return count;

	}

}
