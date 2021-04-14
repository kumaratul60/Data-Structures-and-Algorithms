package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SquareList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		System.out.println(solve(a));
	}

	public static int[] solve(int[] nums) {
		int n = nums.length;

		for (int i = 0; i < n; i++)
			nums[i] = nums[i] * nums[i];

		Arrays.sort(nums);

		return nums;
	}

}
