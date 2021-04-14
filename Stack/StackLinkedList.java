package Stack;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class StackLinkedList {
	Node head = null;

	void push(int data) {
		Node newNode = new Node(data);

		newNode.next = head;
		head = newNode;

	}

	int pop() {
		if (head == null) {
			System.out.println("Stack is empty");
			return -1;

		}
		int data = head.data;
		head = head.next;
		return data;
	}

}
