package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Nearest_smaller_righ_NSR_ {

	public static void main(String[] args) {
		int n = 5;

		int[] a = new int[] { 4, 5, 2, 10, 8 };

		System.out.println("---foundation  approch------");
		ArrayList<Integer> list = nsr(a, n);
		System.out.print(list + "");
		System.out.println();

		System.out.println("----BruteForce-----------");
		printNGE(a, n);
		System.out.println();

		System.out.println("---Arraylist approch------");

		ArrayList<Integer> nge = new ArrayList<>();
		for (int i = 0; i < a.length; i++)
			nge.add(a[i]);
		System.out.print(nge + " ");
		System.out.println();

		System.out.println("---------Array Appraoch-----------");
		int res[] = help_classmate(a, n);
		for (int i : res)
			System.out.print(i + " ");
	}

	//////// ----BruteForce-----------

	static void printNGE(int arr[], int n) {
		int next, i, j;
		for (i = 0; i < n; i++) {
			next = -1;
			for (j = i + 1; j < n; j++) {
				if (arr[i] < arr[j]) {
					next = arr[j];
					break;
				}
			}
			System.out.println(arr[i] + " -- " + next);
		}
	}

	///////////////// Optimize-------------
	static ArrayList<Integer> nsr(int a[], int n) {

		Stack<Integer> s = new Stack<>();

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = n - 1; i >= 0; i--) {

			if (s.size() == 0)
				al.add(-1);

			else if (s.size() > 0 && s.peek() < a[i])
				al.add(s.peek());

			else if (s.size() > 0 && s.peek() >= a[i]) {

				while (s.size() > 0 && s.peek() >= a[i]) {
					s.pop();
				}
				if (s.size() == 0)
					al.add(-1);
				else
					al.add(s.peek());
			}

			s.push(a[i]);
		}

		// return al;
		ArrayList<Integer> alist = new ArrayList<>();
		for (int i = al.size() - 1; i >= 0; i--)
			alist.add(al.get(i));
		return alist;
	}

	///////////////// -------ArrayList
	///////////////// Approach--------//////////////////////////////////////////////

	public static ArrayList<Integer> prevSmaller(ArrayList<Integer> a) {

		Stack<Integer> s = new Stack<Integer>();

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = a.size() - 1; i >= 0; i--) {
			if (s.size() == 0)
				al.add(-1);
			else if (s.size() > 0 && s.peek() < a.get(i))
				al.add(s.peek());
			else if (s.size() > 0 && s.peek() >= a.get(i)) {
				while (s.size() > 0 && s.peek() >= a.get(i)) {
					s.pop();
				}
				if (s.size() == 0)
					a.add(-1);
				else
					al.add(s.peek());
			}
			s.push(a.get(i));
		}
		return al;
	}

	//// Array Approach

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

}
