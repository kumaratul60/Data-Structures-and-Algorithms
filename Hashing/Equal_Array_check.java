package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Equal_Array_check {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		long a[] = new long[n];
		long b[] = new long[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < n; i++)
			b[i] = sc.nextInt();

		System.out.println(check(a, b, n));

	}

	static boolean check(long a[], long b[], int n) {
		HashMap<Long, Long> hm = new HashMap<>();

		for (int i = 0; i < n; i++) {
			long num = a[i];
			if (hm.containsKey(num)) {
				long frq = hm.get(num);
				frq++;
				hm.put(num, frq);
			} else {
				hm.put(num, (long) 1);
			}
		}

		for (int i = 0; i < n; i++) {
			long num = b[i];
			if (hm.containsKey(num)) {
				long frq = hm.get(num);
				frq--;
				hm.put(num, frq);

			}
		}
		boolean flag = false;

		for (Map.Entry<Long, Long> e : hm.entrySet()) {
			if (e.getValue() != 0) {
				flag = true;
				return false;
			}
		}
		return true;
	}

	static boolean check1(long a[], long b[], int n) {

		Map<Long, Integer> map_a = new HashMap<>();
		Map<Long, Integer> map_b = new HashMap<>();
		for (Long s : a)
			map_a.merge(s, 1, Integer::sum);
		for (Long s : b)
			map_b.merge(s, 1, Integer::sum);
		return map_a.equals(map_b);
	}

}
