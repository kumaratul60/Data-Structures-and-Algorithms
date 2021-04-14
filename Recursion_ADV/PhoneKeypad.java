package Recursion_ADV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneKeypad {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			
			String ip = sc.next();
			String op = "";
			
			// keyPad(ip, op);
			
			System.out.println(letterComb(ip));
		}

	}
	
///////////////--------List--------------	

	public static List<String> letterComb(String digits) {
		List<String> list = new ArrayList<String>();
		if (digits.length() > 0)
			keyPadlist(digits, "", list);
		return list;
	}

	static void keyPadlist(String s, String ans, List<String> list) {

		String keyPadArr[] = { "", "", "abc", "def", "gfi", "jkl", "mno", "pqs", "tuv", "wxyz" };

		if (s.length() == 0) {
			list.add(ans);
			return;
		}

		char ch = s.charAt(0);
		String code = keyPadArr[ch - '0'];// (ASCII code of 0) - (ASCII code of ch) == Integer
		String res = s.substring(1);

		for (int i = 0; i < code.length(); i++) {
			keyPadlist(res, ans + code.charAt(i), list);
		}
	}
	
	
	
	///////////////////////////--------Normal method----------------//////////

	static void keyPad(String s, String ans) {

		String keyPadArr[] = { "", "", "abc", "def", "gfi", "jkl", "mno", "pqs", "tuv", "wxyz" };

		if (s.length() == 0) {
			System.out.print(ans + " ");
			return;
		}

		char ch = s.charAt(0);
		String code = keyPadArr[ch - '0'];// (ASCII code of 0) - (ASCII code of ch) == Integer
		String res = s.substring(1);

		for (int i = 0; i < code.length(); i++) {
			keyPad(res, ans + code.charAt(i));
		}
	}

}
