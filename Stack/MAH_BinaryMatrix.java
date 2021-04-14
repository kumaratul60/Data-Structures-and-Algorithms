package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class MAH_BinaryMatrix {

	public static void main(String[] args) {
		int n = 7;

		int[] a = new int[] { 6, 2, 5, 4, 5, 1, 6 };

		// int[] arr[] = { { 1, 0, 1, 0, 0 }, { 1, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1 }, { 1,
		// 0, 0, 1, 0 },};

		int arr[][] = { { 0, 1, 1, 0 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 0, 0 }, };

		System.out.println("Maximum Area in Histogram = " + mah(a, n));
		System.out.println("Maximum Area in BinaryHistogram = " + mahBinary(arr));

	}

	static int[] NSLi(int a[], int n) {

		Stack<Integer> s = new Stack<>();
		ArrayList<Integer> al = new ArrayList<>();
		int idx[] = new int[n];

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
		int res[] = new int[al.size()];
		int index = 0;
		for (int i : al)
			res[index++] = i;

		return res;
	}

	static int[] NSRi(int a[], int n) {

		Stack<Integer> s = new Stack<>();
		ArrayList<Integer> al = new ArrayList<>();
		int idx[] = new int[n];

		for (int i = n - 1; i >= 0; i--) {
			if (s.size() == 0)
				al.add(n);
			else if (s.size() > 0 && a[s.peek()] < a[i]) {
				idx[i] = s.peek();
				al.add(idx[i]);
			} else if (s.size() > 0 && a[s.peek()] >= a[i]) {
				while (s.size() > 0 && a[s.peek()] >= a[i]) {
					s.pop();
				}
				if (s.size() == 0)
					al.add(n);
				else {
					idx[i] = s.peek();
					al.add(idx[i]);
				}
			}
			s.push(i);
		}

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = al.size() - 1; i >= 0; i--)
			list.add(al.get(i));

		int res[] = new int[list.size()];
		int index = 0;
		for (int i : list)
			res[index++] = i;

		return res;

	}

	static int[] widthArr(int a[], int n) {
		int[] nsl = NSLi(a, n);
		int nsr[] = NSRi(a, n);
		int[] width = new int[n];
		for (int i = 0; i < n; i++)
			width[i] = nsr[i] - nsl[i] - 1;
		return width;
	}

	static int[] areaArr(int a[], int n) {
		int[] width = widthArr(a, n);
		int area[] = new int[n];
		for (int i = 0; i < n; i++)
			area[i] = a[i] * width[i];
		return area;
	}

	static int mah(int a[], int n) {
		int[] area = areaArr(a, n);
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++)
			if (area[i] > max)
				max = area[i];

		return max;
	}

	static int mahBinary(int a[][]) {

		int n = a.length;
		int m = a[0].length;

		int res = mah(a[0], n);

		for (int i = 1; i < n; i++) {

			for (int j = 0; j < m; j++)

				if (a[i][j] == 1)
					a[i][j] += a[i - 1][j];

			res = Math.max(res, mah(a[i], n));
		}

		return res;

	}

}
