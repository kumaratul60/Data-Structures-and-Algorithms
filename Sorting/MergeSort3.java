package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class MergeSort3 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();
			int m = sc.nextInt();
			int o = sc.nextInt();

			int[] a = new int[n];
			int[] b = new int[m];
			int[] c = new int[m];

			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			for (int i = 0; i < m; i++)
				b[i] = sc.nextInt();

			for (int i = 0; i < o; i++)
				c[i] = sc.nextInt();

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int t = Integer.parseInt(br.readLine().trim());
//		while (t-- > 0) {
//			String inputLine[] = br.readLine().trim().split(" ");
//			int n = Integer.parseInt(inputLine[0]);
//			int m = Integer.parseInt(inputLine[1]);
//			int a[] = new int[n];
//			int b[] = new int[m];
//			inputLine = br.readLine().trim().split(" ");
//			for (int i = 0; i < n; i++) {
//				a[i] = Integer.parseInt(inputLine[i]);
//			}
//			inputLine = br.readLine().trim().split(" ");
//			for (int i = 0; i < m; i++) {
//				a[i] = Integer.parseInt(inputLine[i]);
//			}

			new Solution().merge(a, b, c, n, m, o);
			StringBuffer str = new StringBuffer();
			for (int i = 0; i < n; i++) {
				str.append(a[i] + " ");
			}
			for (int i = 0; i < m; i++) {
				str.append(b[i] + " ");
			}
			System.out.println(str);
		}

	}
}

class Solution {

	public void merge(int arr1[], int arr2[], int n, int m) {

		Arrays.sort(merge2(arr1, arr2, n, m));

	}

	public void merge(int arr1[], int arr2[], int arr3[], int n, int m, int o) {

		Arrays.sort(merge3(arr1, arr2, arr3, n, m, o));

	}

	static int[] merge2(int[] a, int[] b, int n, int m) {

		int res[] = new int[n + m];
		int i, j, k;
		i = j = k = 0;
		while (i < n && j < m) {
			if (a[i] < b[j]) {
				res[k] = a[i];
				i++;
				k++;
			} else {
				res[k] = b[j];
				j++;
				k++;
			}
		}
		while (i < n) {
			res[k] = a[i];
			i++;
			k++;

		}
		while (j < m) {
			res[k] = b[j];
			j++;
			k++;

		}

		return res;
	}

	static int[] merge3(int[] a, int[] b, int[] c, int n, int m, int o) {

		int res[] = new int[n + m + o];
		int i, j, k, l;
		i = j = k = l = 0;
		while (i < n && j < m) {
			if (a[i] < b[j]) {
				res[k] = a[i];
				i++;
				k++;
			} else {
				res[k] = b[j];
				j++;
				k++;
			}
		}
//		while (i < n && l < o) {
//			if (a[i] < c[l]) {
//				res[k] = a[i];
//				i++;
//				k++;
//			} else {
//				res[k] = c[l];
//				l++;
//				k++;
//			}
//		}
		while (j < m && l < o) {
			if (b[j] < c[l]) {
				res[k] = b[j];
				j++;
				k++;
			} else {
				res[k] = c[l];
				l++;
				k++;
			}
		}
		while (i < n) {
			res[k] = a[i];
			i++;
			k++;

		}
		while (j < m) {
			res[k] = b[j];
			j++;
			k++;

		}
		while (l < o) {
			res[k] = c[l];
			l++;
			k++;

		}

		return res;
	}
}
