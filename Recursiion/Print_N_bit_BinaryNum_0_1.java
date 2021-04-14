package Recursiion;

import java.util.ArrayList;
import java.util.Scanner;

public class Print_N_bit_BinaryNum_0_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
//		String op = " ";
//		int ones = 0;
//		int zeros = 0;

			ArrayList<String> result = NBitBinary(n);
			for (String value : result) {
				System.out.println(value + " ");
			}
			System.out.println();
		}

	}

	static ArrayList<String> NBitBinary(int N) {
		ArrayList<String> res = new ArrayList<String>();
		NBitBinary1(0, 0, N, "", res);

		return res;

	}

	static ArrayList<String> NBitBinary(int ones, int zeros, int n, String op, ArrayList<String> list) {
		if (n == 0) {
			list.add(op);
			return list;
		}
		String op1 = op;
		op1 += "1";
		NBitBinary(ones + 1, zeros, n - 1, op1, list);

		if (ones > zeros) {
			String op2 = op;
			op2 += "0";
			NBitBinary(ones, zeros + 1, n - 1, op2, list);
		}
		return list;
	}
///////////////////////////////////////////////////////////////////////////////////////
	
	static void NBitBinary1(int ones, int zeros, int n, String op, ArrayList<String> list) {
		if (n == 0) {
			list.add(op);
			return;
		}
		String op1 = op;
		op1 += "1";
		NBitBinary(ones + 1, zeros, n - 1, op1, list);

		if (ones > zeros) {
			String op2 = op;
			op2 += "0";
			NBitBinary(ones, zeros + 1, n - 1, op2, list);
		}
		

	}

}
