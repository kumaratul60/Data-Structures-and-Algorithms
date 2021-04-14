package BitMagic;

import java.util.List;
import java.util.Scanner;

public class Find_odd_ele_Array_single_Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n]; // 5 4 1 4 3 5 1
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();

			// System.out.println(singleNumber(new List<Integer>(a)));
		}

	}

	static int singleNumber(final List<Integer> a) {
		long xor_sum = 0;
		for (int a_i : a) {
			xor_sum = xor_sum ^ a_i;
		}

		return (int) xor_sum;
	}

}
