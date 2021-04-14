package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class NGR_Long {

	public static void main(String[] args) {
		int n = 4;

		long a[] = { 1, 3, 2, 4 };
		long[] res = nextLargerElement(a, n);
		for (int i = 0; i < n; i++) {
			System.out.print(res[i] + " ");
			// System.out.println();
		}

	}

	public static long[] nextLargerElement(long[] arr, int n) {
		ArrayList<Integer> sl = ngr(arr, n);
		long[] ar = new long[sl.size()];
		long index = 0;
		{
			for (long val : sl)
				ar[(int) index++] = val;
		}

		return ar;
		/*
		 * //--------NextLevel sol---------------------------------- Stack<Integer> s =
		 * new Stack<>(); s.push(0); long list[] = new long[n]; for (int i = 1; i < n;
		 * i++) { while (!s.isEmpty() && arr[s.peek()] < arr[i]) { list[s.peek()] =
		 * arr[i]; s.pop(); } s.push(i); } while (!s.isEmpty()) { list[s.pop()] = -1; }
		 * return list;
		 */

	}

	static ArrayList<Integer> ngr(long[] a, int n) {

		ArrayList<Integer> al = new ArrayList<>();

		Stack<Integer> s = new Stack<>();

		for (int i = n - 1; i >= 0; i--) {

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

			s.push((int) a[i]);
		}
		// return al;

		// for reversing the list
		ArrayList<Integer> rlist = new ArrayList<>();

		for (int i = al.size() - 1; i >= 0; i--) {
			rlist.add(al.get(i));
		}
		return rlist;

	}

}
