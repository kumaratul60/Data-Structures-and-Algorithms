package Recursiion;

import java.util.Scanner;

public class code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int S1 = sc.nextInt();
			int L1 = sc.nextInt();
			int S2 = sc.nextInt();
			int L2 = sc.nextInt();
			String p = print(S1, L1, S2, L2);
			System.out.println(p);
		}
	}

	static String print(int S1, int L1, int S2, int L2) {
		if (S1 == L2 && L1 == S2)
			return "true";
		else
			return "false";

	}

}
