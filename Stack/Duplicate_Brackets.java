package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Duplicate_Brackets {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			String s = sc.next();

			// ((a+b)+(c+d)) -> false
			// (a+b)+((c+d)) -> true

			System.out.println(isDuplicate(s));
		}

	}

	static boolean isDuplicate(String str) {
		Stack<Character> s = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == ')') {
				if (s.peek() == '(') {
					return true;
				} else {
					while (s.peek() != '(') {
						s.pop();
					}
					s.pop(); // for remove opening bracket
				}

			} else
				s.push(ch);
		}
		return false;
	}

}
