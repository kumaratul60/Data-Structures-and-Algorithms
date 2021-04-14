package Stack;

public class Implement_Stack_LinkedList1 {

	// push: always insert a new node at head of linked-list.
	// pop: always remove node from head of linked-list :)

	public static void main(String[] args) {

		MyStackLinked s = new MyStackLinked();
		s.push(5);
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
//			System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());

	}

}

class StackNode {
	int data;
	StackNode next;

	StackNode(int a) {
		data = a;
		next = null;
	}
}

class MyStackLinked {

	StackNode top;

	void push(int a) {

		StackNode temp = new StackNode(a);
		if (top == null)
			top = temp;
		else {
			temp.next = top;
			top = temp;
		}

	}

	int pop() {

		int a;
		if (top == null)
			a = -1;
		else {
			a = top.data;
			top = top.next;
		}
		return a;
	}

	int peek() {
		if (top == null) {
			return Integer.MAX_VALUE;
		}
		return top.data;
	}

	boolean isEmpty() {
		return top == null;
	}

}
