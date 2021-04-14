package Fundamentals;

import java.util.Scanner;

public class UniqueNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int a = sc.nextInt();
			System.out.println(isUniqueNumber(a));
		}
	}
	public static boolean isUniqueNumber(int n) {
		boolean unique[] = new boolean[n];
		int digit;
		for (int temp = n; temp > 0; temp /= 10) {
			digit = temp % 10;
			if (unique[digit])
				return false;
			else
				unique[digit] = true;
		}
		return true;
	}

}
