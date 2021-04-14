package Stack;

import java.util.Stack;

public class Infix_Evaluation {

	public static void main(String[] args) {

		String s1 = "2+(5-3*6/2)";
		String s = "2";
		System.out.println(eveluation(s));

	}

	static int precedence(char optr) {
		if (optr == '+')
			return 1;
		else if (optr == '-')
			return 1;
		else if (optr == '*')
			return 2;
		else
			return 2;
	}

	static int operation(int v1, int v2, char optr) {
		if (optr == '+')
			return v1 + v2;
		else if (optr == '-')
			return v1 - v2;
		else if (optr == '*')
			return v1 * v2;
		else
			return v1 / v2;
	}

	static int eveluation(String str) {

		Stack<Integer> oprnds = new Stack<>();
		Stack<Character> oprtrs = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch == '(')
				oprnds.push(ch - '0'); // char to int

			else if (ch == ')') {
				while (oprtrs.peek() != '(') {

					char optr = oprtrs.pop();
					int v2 = oprnds.pop();
					int v1 = oprnds.pop();

					int opv = operation(v1, v2, optr);
					oprnds.push(opv);
				}
				oprtrs.pop();

			} else if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {

				while (oprtrs.size() > 0 && oprtrs.peek() != '(' && precedence(ch) <= precedence(oprtrs.peek())) {

					char optr = oprtrs.pop();
					int v2 = oprnds.pop();
					int v1 = oprnds.pop();

					int opv = operation(v1, v2, optr);
					oprnds.push(opv);

				}
				oprtrs.push(ch);
			}
		}
		while (oprtrs.size() != 0) {

			char optr = oprtrs.pop();
			int v2 = oprnds.pop();
			int v1 = oprnds.pop();

			int opv = operation(v1, v2, optr);
			oprnds.push(opv);

		}
		return oprnds.peek();

	}

}
