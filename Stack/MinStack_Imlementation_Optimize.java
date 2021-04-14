package Stack;

import java.util.Stack;

public class MinStack_Imlementation_Optimize {

	public static void main(String[] args) {
		MyStack2 s = new MyStack2();
		;
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

class MyStack2 {

	Stack<Integer> s;
	int min;

	MyStack2() {
		s = new Stack<>();
	}

	void push(int x) {
		if (s.size() == 0) {
			s.push(x);
			min = x;
		} else {
			if (x >= min)
				s.push(x);
			else if (x < min)
				s.push(2*x-min);
				min = x;
		}
	}

	void pop() {
		
		if (s.size() == 0)
			System.out.println(-1);
		
		else {
			if (s.peek() >= min)
				s.pop();
			else if (s.peek() <= min) {
				min = 2 * min - s.peek();
				 s.pop();
				
			}
		}
		

	}

	int peek() {
		if (s.size() == 0)
			return -1;
		else {
			if (s.peek() >= min)
				return s.peek();
			else if (s.peek() < min)
				return min;
		}
		return -1;

	}

	int getMin() {
		if (s.size() == 0)
			return -1;

		return min;
	}

}
