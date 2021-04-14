package Recursiion;

import java.util.Scanner;

public class RecursiveSumBetween {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		RecursiveSumBetween s = new RecursiveSumBetween();
		System.out.println(RecursiveSumBetween.print(n, m));

	}

	static int print(int start, int end) {
		if (end > start)

			return end + print(start, end - 1);
		return end;

	}

}
