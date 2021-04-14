package Recursion_ADV;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LetterCombination_List {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			String ip = sc.next();
			String op = "";

			List<String> list = new ArrayList<String>();
			letterCombination(ip, op, list);
			System.out.println(list);
		}
	}

	static void letterCombination(String ques , String ans, List<String> list) {
		if (ques.length() == 0) {
			list.add(ans);
			return;
		}

		char first = ques.charAt(0);
		String sub = ques.substring(1);

		String code = getCode(first);
		for (int i = 0; i < code.length(); i++) {
			letterCombination(sub, ans + code.charAt(i), list);

		}

	}

	static String getCode(char ch) {
		if (ch == '2')
			return "abc";
		if (ch == '3')
			return "def";
		if (ch == '4')
			return "ghi";
		if (ch == '5')
			return "jkl";
		if (ch == '6')
			return "mno";
		if (ch == '7')
			return "pqrs";
		if (ch == '8')
			return "tuv";
		if (ch == '9')
			return "wxyz";
		else
			return "";

	}

}
