package Stack;

import java.util.Scanner;
import java.util.Stack;

public class ParanthesisChecker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while (t-- > 0) {
			String s = sc.nextLine();
			Stack<Character> stack = new Stack<>();
			boolean isBalenced = true;
			for (int i = 0; i < s.length(); i++) {
				char ch = s.charAt(i);
				if (ch == '(' || ch == '[' || ch == '{') {
					stack.push(ch);
					continue;
				}
				if (stack.isEmpty()) {
					isBalenced = false;
					break;
				}
				if (ch == ')') {
					if (stack.peek() == '(') {
						stack.pop();
					} else {
						isBalenced = false;
						break;
					}
				}
				if (ch == ']') {
					if (stack.peek() == '[') {
						stack.pop();
					} else {
						isBalenced = false;
						break;
					}
				}
				if (ch == '}') {
					if (stack.peek() == '{') {
						stack.pop();
					} else {
						isBalenced = false;
						break;
					}
				}
			}

			if (!stack.isEmpty()) {
				isBalenced = false;
			}

			if (isBalenced) {
				System.out.println("Balenced");
			} else
				System.out.println("Not Balenced");
		}
	}
}
