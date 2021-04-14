package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Histogram_MAH {

	public static void main(String[] args) {

		int n = 7;

		int[] a = new int[] { 6, 2, 5, 4, 5, 1, 6 };

		int arr[] = NSR_i(a, n);
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
		int arr1[] = NSL_i(a, n);
		for (int i = 0; i < n; i++)
			System.out.print(arr1[i] + " ");
		System.out.println();

		System.out.println("Maximum Area= " + mah(a, n));

	}
	/*
	 * for HistoGram NSLi = sudo idx = -1; NSRi = sudo idx = n;
	 */

	static int[] NSL_i(int a[], int n) {

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
		int indx = 0;
		
			for (int i : al)
				res[indx++] = i;
		
		return res;

	}

	static int[] NSR_i(int a[], int n) {

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

		ArrayList<Integer> rev = new ArrayList<>();
		for (int i = al.size() - 1; i >= 0; i--) {
			rev.add(al.get(i));

		}
		int res[] = new int[rev.size()];
		int indx = 0;
		{
			for (int i : rev)
				res[indx++] = i;
		}
		return res;

	}

	static int[] widthArr(int a[], int n) {
		int[] nsr = NSR_i(a, n);
		int nsl[] = NSL_i(a, n);
		int width[] = new int[n];
		for (int i = 0; i < n; i++)
			width[i] = nsr[i] - nsl[i] - 1;
		return width;
  
	}

	static int[] areaArr(int a[], int n) {
		int[] width = widthArr(a, n);
		int area[] = new int[n];
		for (int i = 0; i < n; i++) {
			area[i] = (a[i] * width[i]);
			
		}
		return area;
	}

	static int mah(int a[], int n) {
		int[] area = areaArr(a, n);
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (area[i] > max)
				max = area[i];
		}
		return max;
	}

}
