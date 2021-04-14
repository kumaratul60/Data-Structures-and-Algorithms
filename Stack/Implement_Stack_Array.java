package Stack;

public class Implement_Stack_Array {

	public static void main(String[] args) throws Exception {
		ArrayStack s = new ArrayStack(5);
		s.push(5);
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
	}

	// push,pop,peek -> O(1)
	// display -> O(n)
}

class ArrayStack {
	int a[];
	int cap; // capacity
	int top;

	ArrayStack(int c) {
		top = -1;
		cap = c;
		a = new int[cap];
	}

	void push(int x) {
		if (top == cap - 1) {
			System.out.println("Stack is full");
			return;
		}
		top++;
		a[top] = x;
	}

	int pop() throws Exception {
		if (top == -1) {
			throw new Exception("Stack is Empty");
		}
		// return Integer.MIN_VALUE;

		int res = a[top];
		top--;
		return res;
	}

	int peek() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			// return Integer.MIN_VALUE;
			return -1;
		}
		return a[top];
	}

	int size() {
		return (top + 1);
	}

	boolean isEmpty() {
		return top == -1;
	}

}
