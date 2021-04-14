package Recursion_ADV;

import java.util.Scanner;

public class SubSequenceASCII {

	public static void main(String[] args) {
		Scanner sc = 	new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			String ip = sc.next();
			String op = "";
			// subSeq(ip, op);
			subSeqASCII(ip, op);
		}

	}

	static void subSeq(String s, String ans) {
		if (s.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = s.charAt(0);
		String ros = s.substring(1);

		subSeq(ros, ans);
		subSeq(ros, ch + ans);

	}

	static void subSeqASCII(String s, String ans) {
		if (s.length() == 0) {
			System.out.println(ans);
			return;
		}
		char ch = s.charAt(0);
		Integer code = (int) ch;
		String res = s.substring(1);

		subSeqASCII(res, ans);
		subSeqASCII(res, ans + ch);
		subSeqASCII(res, ans + code.toString());

	}

}
