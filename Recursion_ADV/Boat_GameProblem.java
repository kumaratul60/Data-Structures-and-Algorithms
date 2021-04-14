package Recursion_ADV;

import java.util.Scanner;

public class Boat_GameProblem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			System.out.println(countPath(start, end));
			
		}
	}

	static int countPath(int start, int end) {
		
		if (start == end)
			return 1;
		if (start > end)
			return 0;
		int count = 0;
		for (int i = 1; i <= 6; i++)
			count += countPath(start + i, end);
		return count;
	}

}
