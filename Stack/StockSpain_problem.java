package Stack;

import java.util.Arrays;
import java.util.Stack;

public class StockSpain_problem {

	public static void main(String[] args) {
		int n = 7 - 1;

		// int a[] = new int[] { 100, 80, 60, 70, 60, 75, 85 };

		int[] a = new int[] { 18, 12, 13, 14, 11, 16 };

		// int a[] = new int[] { 10, 4, 5, 90, 120, 80 };

		int ans[] = new int[n];
		calculate_M1(a, n, ans);
		printArray(ans);
		System.out.println();

		System.out.println("------------------M2--------------------");
		printSpan(a, n);
		System.out.println();

		System.out.println("------------------M3--------------------");
		printSpan1(a, n);
		System.out.println();

	}

	// M1 ssp BruteForce

	static void calculate_M1(int price[], int n, int ans[]) {

		ans[0] = 1;

		for (int i = 1; i < n; i++) {
			ans[i] = 1;

			for (int j = i - 1; (j >= 0) && (price[i] > price[j]); j--)
				ans[i]++;
		}

	}

	static void printArray(int arr[]) {
		System.out.print(Arrays.toString(arr));
	}

	////////////////////////////////////////////////////

	public static void printSpan(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			int span = 1;
			for (int j = i - 1; j >= 0 && arr[j] <= arr[i]; j--)
				span++;
			System.out.print(span + " ");
		}
	}

	/////////////////////////////////////////////////////////////////
	public static void printSpan1(int arr[], int n) {
		Stack<Integer> s = new Stack<>();
		s.add(0);
		System.out.print(1 + " ");
		for (int i = 1; i < n; i++) {
			while (s.isEmpty() == false && arr[s.peek()] <= arr[i]) {
				s.pop();
			}
			int span = s.isEmpty() ? i + 1 : i - s.peek();
			System.out.print(span + " ");
			s.push(i);
		}
	}

	//////////////////////////////////////////////
	

}