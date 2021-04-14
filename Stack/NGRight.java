package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class NGRight {

	public static void main(String[] args) {
		int n = 4;

		int a[] = { 1, 3, 2, 4 };

		ArrayList<Integer> list = ngr(a, n);
		System.out.println(list);

	}

	static ArrayList<Integer> ngr(int[] a, int n) {

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

			s.push(a[i]);
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
