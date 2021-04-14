package Arrays;

import java.util.Scanner;

public class ConfusingNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			boolean con = confusingNumber(n);
			System.out.println(con);
		}

	}

	public static boolean confusingNumber(int N) {
		// without using string;
		int[] rotation = { 0, 1, -1, -1, -1, -1, 9, -1, 8, 6 };
		int num = N;
		int result = 0;
		while (num > 0) {
			int t = num % 10;
			if (rotation[t] == -1)
				return false;
			result = result * 10 + rotation[t];
			num /= 10;
		}
		return result != N;
	}

}
