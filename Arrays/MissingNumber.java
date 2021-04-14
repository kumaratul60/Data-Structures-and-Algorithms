package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

	public static void main(String[] args) {
		int a[] = { 10, 11, 12, 13, 15, 16, 17, 18, 19, 20 };
		int n = a.length;
		System.out.println(missingNumber_gauss(a));
		System.out.println(missingNumber(a));
		System.out.println(missingNumber1(a));
		System.out.println(missing(a, n));

	}

	static int missing(int a[], int n) {
		Arrays.sort(a);

		if (a[n - 1] != n)
			return n;

		else if (a[0] != 0)
			return 0;

		for (int i = 1; i < n; i++) {
			int total = a[i - 1] + 1;
			if (a[i] != total)
				return total;
		}
		return -1;

	}

	public static int missingNumber(int[] nums) {
		Set<Integer> numSet = new HashSet<Integer>();
		for (int num : nums)
			numSet.add(num);

		int expectedNumCount = nums.length + 1;
		for (int number = 0; number < expectedNumCount; number++) {
			if (!numSet.contains(number)) {
				return number;
			}
		}
		return -1;
	}

	public static int missingNumber1(int[] nums) {
		int missing = nums.length;
		for (int i = 0; i < nums.length; i++) {
			missing ^= i ^ nums[i];
		}
		return missing;
	}

	public static int missingNumber_gauss(int[] nums) {
		int expectedSum = nums.length * (nums.length + 1) / 2;
		int actualSum = 0;
		for (int num : nums)
			actualSum += num;
		return expectedSum - actualSum;
	}

}
