package Recursion_ADV;

import java.util.Scanner;

public class FindPath {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int path = path(n, m);
			System.out.println(path);
		}
	}

	static int path(int a, int b) {
		if (a == 1 || b == 1)
			return 1;
		return path(a, b - 1) + path(b, a - 1);

	}

}
