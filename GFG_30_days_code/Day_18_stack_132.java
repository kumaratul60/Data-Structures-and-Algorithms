package GFG_30_days_code;

import java.util.Stack;

public class Day_18_stack_132 {

	public static void main(String[] args) {

		int n = 6;
		int arr[] = { 4, 7, 11, 5, 13, 2 };
//				Output:
//				True
//				Explanation:
//				[4, 7, 5] fits the condition.
		System.out.println(recreationalSpot(arr, n));

	}

	static boolean recreationalSpot(int[] a, int n) {

		int min, max;
		min = max = a[0];

		for (int i = 1; i < n; i++) {
			if (a[i] < min)
				min = a[i];
			else if (a[i] > max)
				max = a[i];

			if (a[i] < max && a[i] > min)
				return true;

		}
		return false;
	}

	static boolean recreationalSpot1(int[] arr, int n) {
		if (n < 3)
			return false;
		Stack<Integer> stack = new Stack<>();
		int[] temp = new int[n];
		temp[0] = arr[0];
		for (int i = 1; i < n; i++)
			temp[i] = Math.min(temp[i - 1], arr[i]);

		for (int j = n - 1; j >= 0; j--) {
			if (arr[j] > temp[j]) {
				while (!stack.empty() && stack.peek() <= temp[j])
					stack.pop();
				if (!stack.empty() && stack.peek() < arr[j])
					return true;
				stack.push(arr[j]);
			}
		}
		return false;
	}

}
