package Arrays;

import java.util.Scanner;

public class HourSecond {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int hourSec = hS(n);
			System.out.println(hourSec);
		}

	}

	static int hS(int n) {
		int temp = 0;
		temp = n * (60 * 60);
		return temp;
	}
}
