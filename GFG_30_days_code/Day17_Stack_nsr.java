package GFG_30_days_code;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Day17_Stack_nsr {

	public static void main(String[] args) {
		int n = 5;
		// int a[] = { 3, 8, 5, 2, 25 };
		int a[] = { 4, 8, 5, 2, 25 };

		int res[] = help_classmate(a, n);
		// int res[] = nsl(a, n);
		for (int i : res)
			System.out.print(i + " ");

	}

	public static int[] help_classmate(int arr[], int n) {
		Stack<Integer> s = new Stack<>();
		ArrayList<Integer> al = new ArrayList<>();

		for (int i = n - 1; i >= 0; i--) {
			while (s.size() > 0 && arr[s.peek()] >= arr[i])
				s.pop();
			if (s.size() == 0)
				al.add(-1);
			else
				al.add(arr[s.peek()]);
			s.push(i);
		}
		ArrayList<Integer> alr = new ArrayList<>();
		for (int i = al.size() - 1; i >= 0; i--)
			alr.add(al.get(i));

		int temp[] = new int[alr.size()];
		int idx = 0;
		for (int i : alr)
			temp[idx++] = i;

		return temp;

	}

//////////---------M2-----------------------///////////////////
	public static int[] help_classmate1(int arr[], int n) {
		Stack<Integer> s = new Stack<Integer>();
		int result[] = new int[n];
		Arrays.fill(result, -1);

		for (int i = 0; i < n; i++) {

			if (s.empty()) {
				s.push(i);
				continue;
			}

			while (s.empty() == false && arr[s.peek()] > arr[i]) {
				result[s.peek()] = arr[i];
				s.pop();
			}
			s.push(i);
		}
		return result;

	}

}
