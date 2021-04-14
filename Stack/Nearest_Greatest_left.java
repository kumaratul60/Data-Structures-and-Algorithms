package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Nearest_Greatest_left {

	public static void main(String[] args) {

		int n = 5 + 2;

		// int a[] = new int[] { 1, 3, 0, 2, 5 };
		int a[] = { 30, 20, 25, 28, 27, 29, 31 };
		// int a[] = new int[] { 10, 4, 5, 90, 120, 80 };

		ArrayList<Integer> list = ngl(a, n);
		System.out.print(list + " ");
		System.out.println();
		System.out.println("-------------BruteForce--------------");
		printPrevGreater(a, n);
		System.out.println();
		System.out.println("----------anotherone--------");
		PrevGreater(a, n);
		System.out.println();
		System.out.println("----------anotherone1--------");
		PrevGreater1(a, n);

	}

	// ----------Bruteforce-----------

	public static void printPrevGreater(int arr[], int n) {

		for (int i = 0; i < n; i++) {
			int j;
			for (j = i - 1; j >= 0; j--) {
				if (arr[j] > arr[i]) {
					System.out.print(arr[j] + " ");
					break;
				}
			}
			if (j == -1)
				System.out.print(-1 + " ");
		}
	}

//	 --------------------------------------------------

	static ArrayList<Integer> ngl(int a[], int n) {

		Stack<Integer> s = new Stack<>();

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < n; i++) {

			if (s.size() == 0)
				al.add(-1);

			else if (s.size() > 0 && s.peek() > a[i])
				al.add(s.peek());

			else if (s.size() > 0 && s.peek() <= a[i]) {
				while (s.size() > 0 && s.peek() <= a[i]) {
					s.pop();
				}

				if (s.size() == 0)
					al.add(-1);
				else
					al.add(s.peek());

			}
			s.push(a[i]);
		}
		return al;

	}

	// GFg
	public static void PrevGreater(int arr[], int n) {

		Stack<Integer> s = new Stack<>();

		for (int i = 0; i < n; i++) {
			while (s.isEmpty() == false && arr[s.peek()] <= arr[i])
				s.pop();
			int pg = s.isEmpty() ? -1 : arr[s.peek()];
			System.out.print(pg + " ");

			s.add(i);

		}
	}

	public static void PrevGreater1(int arr[], int n) {

		Stack<Integer> s = new Stack<>();
		s.add(arr[0]);
		for (int i = 0; i < n; i++) {
			while (s.isEmpty() == false && s.peek() <= arr[i])
				s.pop();
			int pg = s.isEmpty() ? -1 : s.peek();
			System.out.print(pg + " ");
			s.add(arr[i]);
		}

	}

}
