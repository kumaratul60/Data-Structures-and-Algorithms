package GFG_30_days_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day1_m2 {

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bf.readLine());

		while (t-- > 0) {

			int n = Integer.parseInt(bf.readLine());
			String s[] = bf.readLine().trim().split("\\s+");
			long a[] = new long[n];
			for (int i = 0; i < n; i++)
				a[i] = Long.parseLong(s[i]);

//			Sol ob = new Sol();
//			ob.prank(a,n);

			new Sol().prank(a, n);

			for (int i = 0; i < n; i++)
				System.out.print(a[i] + " ");
			System.out.println();
		}
	}

}

class Sol {

	void prank(long a[], int n) {
		long idx[] = new long[n];

		for (int i = 0; i < n; i++)
			idx[i] = a[(int) a[i]];

		for (int i = 0; i < n; i++)
			a[i] = idx[i];
	}

}
