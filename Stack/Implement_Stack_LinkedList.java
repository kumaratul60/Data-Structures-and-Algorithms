package Stack;

public class Implement_Stack_LinkedList {
	
	//push: always insert a new node at head of linked-list.
	//pop: always remove node from head of linked-list :)

	public static void main(String[] args) {

		StackMy s = new StackMy();
		s.push(5);
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());

	}

}

class Node_Stack {
	int data;
	Node_Stack next;

	Node_Stack(int d) {
		data = d;
		next = null;

	}
}

class StackMy {
	Node_Stack head;
	int size;

	StackMy() {
		head = null;
		size = 0;
	}

	void push(int x) {
		Node_Stack temp = new Node_Stack(x);
		temp.next = head;
		head = temp;
		size++;
	}

	int pop() {
		if (head == null) {
			return Integer.MAX_VALUE;
		}
		int res = head.data;
		Node_Stack temp = head;
		head = head.next;
		size--;
		return res;
	}

	int peek() {
		if (head == null) {
			return Integer.MAX_VALUE;
		}
		return head.data;
	}

	int size() {
		return size;
	}

	boolean isEmpty() {
		return head == null;
	}

}
