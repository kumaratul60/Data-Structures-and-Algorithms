package Stack.parnthesisChecker;

import java.util.Stack;

public class Balenced {
	public static void main(String[] args) {

		String test_good = "()(){}{}{()}";
		String test_bad = "((({}{}))()";

		System.out.println(isBraceBalanced(test_good));
		System.out.println(isBraceBalanced(test_bad));
	}

	public static boolean isBraceBalanced(String braces) {
		Stack<Character> stack = new Stack<Character>();

		for (char c : braces.toCharArray()) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			} else if ((c == ')' && (stack.isEmpty() || stack.pop() != '('))
					|| (c == ']' && (stack.isEmpty() || stack.pop() != '['))
					|| (c == '}' && (stack.isEmpty() || stack.pop() != '{'))) {
				return false;
			}
		}

		return stack.isEmpty();
	}
}
