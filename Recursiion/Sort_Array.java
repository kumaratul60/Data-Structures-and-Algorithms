package Recursiion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Sort_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			int print = sort(a);
			System.out.println(print);
		}
	}

	static int sort(int a[]) {
		List<Integer> al = new ArrayList<>();
		if (a.length == 1)
			return 0;
		int temp = al.remove(a.length - 1);
		Arrays.sort(a);
		insert(a, temp);
		return -1;

	}

	static void insert(int a[], int temp) {
		List<Integer> al = new ArrayList<>();
		if (a.length == 0 || a.length - 1 <= temp) {
			al.add(temp);
			System.out.println(al);
			return;
		}
		int volume = al.remove(a.length - 1);
		insert(a, temp);
		al.add(volume);
		return;
	}
}
