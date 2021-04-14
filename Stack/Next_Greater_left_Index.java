package Stack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Next_Greater_left_Index {

	public static void main(String[] args) {

		int n = 7;

		int a[] = { 30, 20, 25, 28, 27, 29, 31 };
		ArrayList<Integer> list = ng(a, n);
		System.out.print(list + " ");

	}

	static ArrayList<Integer> ng(int a[], int n) {

		Stack<Integer> s = new Stack<>();

		ArrayList<Integer> al = new ArrayList<>();

		int idx[] = new int[n];

		for (int i = 0; i < n; i++) {

			if (s.size() == 0) {
				idx[i] = -1;
				al.add(idx[i]);
			}

			else if (s.size() > 0 && a[s.peek()] > a[i]) {
				idx[i] = s.peek();
				al.add(idx[i]);
			}

			else if (s.size() > 0 && a[s.peek()] <= a[i]) {
				while (s.size() > 0 && a[s.peek()] <= a[i]) {
					s.pop();
				}

				if (s.size() == 0) {
					idx[i] = -1;
					al.add(idx[i]);
				} else {
					idx[i] = s.peek();
					al.add(idx[i]);
				}

			}
			s.push(i);
		}
		return al;

	}

}
