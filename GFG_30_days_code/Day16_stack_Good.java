package GFG_30_days_code;

import java.util.Scanner;
import java.util.Stack;

public class Day16_stack_Good {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int t = Integer.parseInt(sc.next());
		while (t-- > 0) {
			int k = Integer.parseInt(sc.next());
			String s = sc.next();

//			Solution ts = new Solution();
//			System.out.println(ts.reduced_String(k,s));

			System.out.println(Solution.reduced_String(k, s));
		}

//		int k = 2;
//		String st = "geeksforgeeks";
//		String ans = Solution.reduced_String(k, st);
//		System.out.println(ans);

	}

	public static String reduced_String1(int k, String s) {
		String regex = "([a-z])" + "\\1" + "{" + (k - 1) + "}";
		for (int i = 1; i < s.length() / 2; i++)
			if (s.length() == (s = s.replaceAll(regex, "")).length())
				break;
		return s;
	}

	/////////////////////////////// Main solution//////////////

	static class Pair {
		char c;
		int ctr;

		Pair(char c, int ctr) {
			this.c = c;
			this.ctr = ctr;
		}
	}

	static class Solution {
		public static String reduced_String(int k, String s) {
			if (k == 1) {
				String ans = "";
				return ans;
			}
			Stack<Pair> st = new Stack<Pair>();
			int l = s.length();
			int ctr = 0;
			for (int i = 0; i < l; i++) {
				if (st.size() == 0) {
					st.push(new Pair(s.charAt(i), 1));
					continue;
				}
				if (st.peek().c == s.charAt(i)) {
					Pair p = st.peek();
					st.pop();
					p.ctr += 1;
					if (p.ctr == k) {
						continue;
					} else {
						st.push(p);
					}
				} else {
					st.push(new Pair(s.charAt(i), 1));
				}
			}
			String ans = "";
			while (st.size() > 0) {
				char c = st.peek().c;
				int cnt = st.peek().ctr;
				while (cnt-- > 0)
					ans = c + ans;
				st.pop();
			}

			return ans;
		}
	}

	//////////////////////////////////////////////////////////////////////

	static class Entity {
		char character;
		int frequency;

		Entity(char p, int q) {
			character = p;
			frequency = q;
		}
	}

	public static String reduced_String2(int k, String s) {

		Stack<Entity> st = new Stack<Entity>();

		int i = 0;
		for (i = 0; i < s.length(); i++) {

			// the current character
			char x = s.charAt(i);

			// if the stack is not empty and the frequency of the element
			// at the top of the stack is = k
			// then pop k elements
			if (st.size() > 0 && st.peek().frequency == k) {

				// stores the character at the top of the stack
				char curr = st.peek().character;

				// while the character at the top of the stack is curr
				// pop the character from the stack
				while (st.size() > 0 && st.peek().character == curr)
					st.pop();
			}

			// if the stack is not empty and the top element of the stack is = x,
			if (st.size() > 0 && st.peek().character == x) {

				// increase it's frequency and push it to the stack
				Entity new_top = new Entity(x, st.peek().frequency + 1);
				st.push(new_top);
			}

			// if the current element is not equal to the character at the top of the stack
			else {
				Entity new_top = new Entity(x, 1);
				st.push(new_top);
			}
		}

		// if the last pushed character has k frequency, then pop the top k characters.
		if (st.size() > 0 && st.peek().frequency == k) {

			// get the character at the top of the stack
			char curr = st.peek().character;

			// while the character at the top of the stack is curr, pop it from the stack
			while (st.size() > 0 && st.peek().character == curr)
				st.pop();
		}

		// Stores the string in reversed fashion from stack
		String stack_string = "";
		while (st.size() > 0)
			stack_string += st.pop().character;

		String reduced_string = "";

		// reverse the stack string
		for (i = stack_string.length() - 1; i >= 0; i--)
			reduced_string += stack_string.charAt(i);

		return reduced_string;
	}

}
