package Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Celebrity_Problem {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < n; j++) {
				a[i][j] = line.charAt(j) - '0';
			}
		}
		System.out.println(celebrity(a));

	}

	static int celebrity(int a[][]) {

		Stack<Integer> st = new Stack<>();

		for (int i = 0; i < a.length; i++)
			st.push(i);

		while (st.size() >= 2) {
			int i = st.pop();
			int j = st.pop();

			if (a[i][j] == 1)
				// if i knows j -> i is not celebrity
				st.push(j);
			else
				// if j knows i -> j is not celebrity
				st.push(i);

		}
		int potential = st.pop();
		for (int i = 0; i < a.length; i++) {
			if (i != potential) {

				// a[i][potential]==0 -> i not know potential
				// a[potential][i] == 1 -> i known by potential
				// in both cases potential is not celebrity

				if (a[i][potential] == 0 || a[potential][i] == 1)
					return potential;

			}
		}
		return -1;
	}

}
