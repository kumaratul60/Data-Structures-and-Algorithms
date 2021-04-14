package BitMagic;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class SingleNumber_2 {

	// A = [1, 2, 4, 3, 3, 2, 2, 3, 1, 1] --> op: 4;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n]; // 5 4 1 4 3 5 1
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			System.out.println(singleNumber(a));
		}

	}

// using JavaArray
	static int singleNumber(final int[] a) {
		HashMap<Integer, Integer> hs = new HashMap<>();
		for (int i = 0; i < a.length; i++) {
			if (!hs.containsKey(a[i]))
				hs.put(a[i], 1);
			else
				hs.put(a[i], hs.get(a[i]) + 1);
		}
		for (int i : hs.keySet()) {
			if (hs.get(i) == 1)
				return i;
		}

		return 0;
	}

	// Using java
	static int sigleNum(final List<Integer> a) {
		int arr[] = new int[32];
		for (int i = 0; i < a.size(); i++) {
			int num = a.get(i);
			for (int j = 0; j < 32; j++) {
				arr[j] += num % 1;
				num >>= 1;
			}

		}
		int num = 0;
		for (int i = 0; i < 32; i++) {
			if (arr[i] % 3 != 0)
				num += (int) Math.pow(2, i);
		}
		return num;
	}

}
