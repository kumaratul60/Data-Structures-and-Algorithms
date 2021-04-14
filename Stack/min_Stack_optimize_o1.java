package Stack;

import java.util.Scanner;
import java.util.Stack;

public class min_Stack_optimize_o1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {

			int n = sc.nextInt();

			Stack<Integer> st = new Stack<>();

			minStack ms = new minStack();

			while (!ms.isEmpty(st)) {
				ms.pop(st);
			}
			while (!ms.isFull(st, n)) {
				ms.push(sc.nextInt(), st);

			}
			System.out.println(ms.min(st));
		}

	}
}

class minStack {

	public void push(int a, Stack<Integer> s) {
		s.push(a);
	}

	public int pop(Stack<Integer> s) {
		int a = s.pop();
		return a;
	}

	public int min(Stack<Integer> s) {
		minStack g = new minStack();
		int m = g.pop(s);
		while (!g.isEmpty(s)) {
			int n = g.pop(s);
			if (n < m)
				m = n;
		}
		return m;
	}

	public boolean isFull(Stack<Integer> s, int n) {
		if (s.size() == n)
			return true;
		return false;
	}

	public boolean isEmpty(Stack<Integer> s) {
		if (s.size() == 0)
			return true;
		return false;
	}

}
