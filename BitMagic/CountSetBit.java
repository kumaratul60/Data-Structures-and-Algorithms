package BitMagic;

import java.util.Scanner;

public class CountSetBit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

			System.out.println(countSetBit(n));
		}
		
//		int x[] = { 3, 5, 6, 8, 9, 7 };
//		System.out.println(count(x, 6));

	}

	// 10^9 + 7 -> 1000000007

	static int countSetBit(int n) {

		int count = 0;
		while (n > 0) {

			n &= (n - 1); // Brian Kernighan’s Algorithm

			count++;
		}
		return count;
	}

	static int count(int res[], int n) {
		int count = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			while (res[i] > 0) {
				res[i] &= (res[i] - 1);
				count++;
			}
		}
			 sum += count;
		

		return count;
	}

}
