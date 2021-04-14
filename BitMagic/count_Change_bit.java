package BitMagic;

import java.util.Scanner;

public class count_Change_bit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt(); // 22
			int $ = sc.nextInt(); // 27

			System.out.println(countBitsFlip(n, $)); // 13
			System.out.println(count(n)); // 3

		}
	}

	public static int countBitsFlip(int a, int b) {

		// Your code here
		int res = a ^ b;
		int ans = count(res);
		return ans;
	}

	static int count(int res) {
		int count = 0;
		while (res > 0) {
			res &= res - 1;
			count++;
		}
		return count;
	}

}
