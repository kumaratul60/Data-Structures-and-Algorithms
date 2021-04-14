package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class MAH_Long {

	public static void main(String[] args) {

		long n = 7;

		long[] a = new long[] { 6, 2, 5, 4, 5, 1, 6 };

		System.out.println("Maximum Area= " + getMaxArea(a, n));

	}

	public static long getMaxArea(long hist[], long n) {
		
		long[] area = areaArr(hist, n);
		
		 long max = Long.MIN_VALUE;
		 //long max = Integer.MIN_VALUE;
		//long max = -1;
		 
		for (int i = 0; i < n; i++) {
			if (area[i] > max)
				max = area[i];
		}
		return max;

	}

	static long[] NSL_i(long a[], long n) {

		Stack<Integer> s = new Stack<>();

		ArrayList<Integer> al = new ArrayList<>();

		int idx[] = new int[(int) n];

		for (int i = 0; i < n; i++) {

			if (s.size() == 0)
				al.add(-1);

			else if (s.size() > 0 && a[s.peek()] < a[i]) {
				idx[i] = s.peek();
				al.add(idx[i]);
			} else if (s.size() > 0 && a[s.peek()] >= a[i]) {
				while (s.size() > 0 && a[s.peek()] >= a[i]) {
					s.pop();
				}
				if (s.size() == 0)
					al.add(-1);
				else {
					idx[i] = s.peek();
					al.add(idx[i]);
				}

			}
			s.push(i);
		}
		long res[] = new long[al.size()];
		int indx = 0;

		for (int i : al)
			res[indx++] = i;

		return res;

	}

	static long[] NSR_i(long a[], long n) {

		Stack<Integer> s = new Stack<>();

		ArrayList<Integer> al = new ArrayList<>();

		int idx[] = new int[(int) n];

		for (int i = (int) n - 1; i >= 0; i--) {

			if (s.size() == 0)
				al.add((int) n);

			else if (s.size() > 0 && a[s.peek()] < a[i]) {
				idx[i] = s.peek();
				al.add(idx[i]);
			} else if (s.size() > 0 && a[s.peek()] >= a[i]) {
				while (s.size() > 0 && a[s.peek()] >= a[i]) {
					s.pop();
				}
				if (s.size() == 0)
					al.add((int) n);
				else {
					idx[i] = s.peek();
					al.add(idx[i]);
				}

			}
			s.push(i);
		}

		ArrayList<Integer> rev = new ArrayList<>();
		for (int i = al.size() - 1; i >= 0; i--) {
			rev.add(al.get(i));

		}
		long res[] = new long[rev.size()];
		int indx = 0;
		{
			for (long i : rev)
				res[indx++] = i;
		}
		return res;

	}

	static long[] widthArr(long a[], long n) {
		long[] nsr = NSR_i(a, n);
		long nsl[] = NSL_i(a, n);
		long width[] = new long[(int) n];
		for (int i = 0; i < n; i++)
			width[i] = nsr[i] - nsl[i] - 1;
		return width;

	}

	static long[] areaArr(long a[], long n) {
		long[] width = widthArr(a, n);
		long area[] = new long[(int) n];
		for (int i = 0; i < n; i++) {
			area[i] = (a[i] * width[i]);

		}
		return area;
	}
}
