package Hashing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Containing_1_2_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];

		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();

		Arrays.sort(a);
		boolean flag = false;
		for (int x : a) {
			if (mp.containsKey(x)) {
				System.out.println(x + " ");
				flag = true;
			}

			if (flag == false)
				System.out.println(-1);
			System.out.println();
		}

	}

	static HashMap<Integer, Integer> mp = new HashMap<>();

	public static void findAll1() {
		Set<Integer> set = new HashSet<>(Set.of(1, 2, 3));

		for (int i = 1; i < 1000000; i++) {
			int n = i;
			while (n > 0) {
				if (!set.contains(n % 10))
					break;
				n /= 10;
			}
			if (n == 0)
				mp.put(i, 1);
		}
	}

	/* static HashMap<Integer, Integer> mp = new HashMap<>();

	public static void findAll() {
		int num = 1, num2;
		ArrayList<Integer> a = new ArrayList<>();
		int j = 1;
		a.add(j);
		a.add(j + 1);
		a.add(j + 2);
		mp.put(1, 1);
		mp.put(2, 1);
		mp.put(3, 1);

		j = 0;

		// push the elements which have digits as 1, 2, and 3 only
		while (num <= 1000000) {
			num2 = a.get(j++);

			if ((num2 * 10) + 1 <= 1000000) {
				a.add((num2 * 10) + 1);
				mp.put(num2 * 10 + 1, 1);
			}

			if ((num2 * 10) + 2 <= 1000000) {
				a.add((num2 * 10) + 2);
				mp.put(num2 * 10 + 2, 1);
			}

			num2 = (num2 * 10) + 3;

			if (num2 <= 1000000) {
				a.add(num2);
				mp.put(num2, 1);
			}

			num = num2;
			
		}
		
	}
	*/

}
