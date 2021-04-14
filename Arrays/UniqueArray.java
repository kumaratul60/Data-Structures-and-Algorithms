package Arrays;

import java.util.Scanner;

public class UniqueArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		new UniqueArray().uniArray(a, n);
	}

	void uniArray(int a[], int n) {
		int ans = 0;
		for (int i = 0; i < n; i++) {
			int visited[] = { 0 };
			int x = a[i];
			int count = 0;
			while (visited[x] != 0) {
				count++;
				visited[x] = 1;
				x = a[x];
				
			}
			ans = Math.max(count, ans);
		}
		System.out.println(ans);
	}

}
