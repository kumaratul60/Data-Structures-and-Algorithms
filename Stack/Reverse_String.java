package Stack;

import java.util.Stack;

public class Reverse_String {

	public static void main(String[] args) {

		String s = "Hay, man waht r u doing?";

		reverse(s);

	}

	static void reverse(String str) {
		Stack<String> s = new Stack<>();
		for (int i = 0; i < str.length(); i++) {

			String word = "";

			while (str.charAt(i) != ' ' && i <= str.length()) {
				word += str.charAt(i);
				i++;
			}
			s.push(word);

		}
		while (!s.isEmpty()) {
			System.out.print(s.peek() + " ");
			s.pop();
		}
		System.out.println();
	}

}
