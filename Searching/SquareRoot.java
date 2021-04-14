package Searching;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();

			long sqr = floorSqr(n);
			System.out.println(sqr);

		}
	}

	static long floorSqr(long x) {
		
		long low = 0, high = x, res = -1;  // high == x-1
		
		while (low <= high) {
			
			long mid = low + (high - low) / 2;
			long sqr = mid * mid;
			 
			if (sqr == x)   // perfect Square condition
				return mid;
			else if (sqr > x)
				high = mid - 1;
			else {
				low = mid + 1;
				res = mid;
			}

		}
		return res;

	}

}
