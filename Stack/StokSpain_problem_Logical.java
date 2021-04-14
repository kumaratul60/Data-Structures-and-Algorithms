package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class StokSpain_problem_Logical {

	public static void main(String[] args) {

		int n = 7;

		int a[] = { 30, 20, 25, 28, 27, 29, 31 };
		
		//int a[] = { 10,4,5,90,120,80 };


		int[] st = ssp(a, n);
		for (int i = 0; i < n; i++)
			System.out.print(st[i] + " ");
	}

	static int[] ssp(int a[], int n) {
		ArrayList<Integer> res = NGL_idx(a, n);

		int arr[] = new int[res.size()];

		for (int i = 0; i <n; i++) {
			arr[i] = i - res.get(i);
		}
		return arr;
	}

	static ArrayList<Integer> NGL_idx(int a[], int n) {

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
