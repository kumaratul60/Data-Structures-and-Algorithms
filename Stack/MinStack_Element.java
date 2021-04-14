package Stack;

import java.util.Stack;

public class MinStack_Element {

	public static void main(String[] args) {
		MyStack s = new MyStack();

		s.push(3);
		s.push(5);
		s.push(8);
		s.push(1);
		s.pop();
		s.push(20);
		s.push(10);
		s.push(8);
		s.push(1);
		s.pop();

		System.out.print(" Minimum Element from Stack: " + s.getMin());

	}
}

class MyStack {

	Stack<Integer> ms;
	Stack<Integer> as;

	MyStack() {
		ms = new Stack<>();
		as = new Stack<>();
	}

	void push(int x) {

		ms.push(x);
		if (as.size() == 0 || as.peek() >= x)
			as.push(x);
		return;
	}

	void pop() {

		if (ms.size() == 0)
			System.out.println(-1);
		int ans = ms.peek();
		ms.pop();
		if (as.peek() == ans)
			as.pop();
		// System.out.println(ans);

	}

	int getMin() {
		if (as.size() == 0)
			return -1;

		return as.peek();
	}

}
