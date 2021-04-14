package Recursion_ADV;

import java.util.Scanner;

public class CountPath_MazeGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			System.out.println(countPathMaze(n, 0, 0));
		}
	}

	static int countPathMaze(int n, int i, int j) {
		if (i == n - 1 && j == n - 1)
			return 1;
		if (i >= n || j >= n)
			return 0;
//		int count=0;
//		count += countPathMaze(n, i + 1, j) + countPathMaze(n, i, j + 1);
//		return count;

		return countPathMaze(n, i + 1, j) + countPathMaze(n, i, j + 1);

	}

}
