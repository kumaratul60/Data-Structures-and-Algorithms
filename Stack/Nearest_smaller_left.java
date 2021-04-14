package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Nearest_smaller_left {

	public static void main(String[] args) {

		int n = 5;

		int a[] = new int[] { 4, 5, 2, 10, 8 };

		ArrayList<Integer> list = nsl(a, n);
		System.out.print(list + "");

	}

	static ArrayList<Integer> nsl(int a[], int n) {

		Stack<Integer> s = new Stack<>();

		ArrayList<Integer> al = new ArrayList<>();

		for (int i = 0; i < n; i++) {

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
		return al;
	}

}
