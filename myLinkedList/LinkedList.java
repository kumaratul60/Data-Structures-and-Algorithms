package myLinkedList;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {
	Node head = null;

	void reverse() {

		Node current = head, prev = null, next = null;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}
		head = prev;

	}

	void insertAtBig(int data) {
		Node newNode = new Node(data);

//		if (head == null) {
//			head = newNode;
//			return;
//		}
		newNode.next = head;
		head = newNode;

	}

	void insertAfter(Node prev_node, int data) {
		if (prev_node == null) {
			System.out.println("the given previous node cannot be null");
			return;
		}
		Node new_node = new Node(data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;
	}

	void insert(int num, int data) {

		Node tempNode = head;
		while (tempNode != null && tempNode.data != num)
			tempNode = tempNode.next;

		Node newNode = new Node(data);
		newNode.next = tempNode.next;
		tempNode.next = newNode;

	}

	void insertAtEnd(int data) {
		Node new_node = new Node(data);
		if (head == null) {
			head = new Node(data);
			return;
		}
		new_node.next = null;
		Node lastNode = head;
		while (lastNode.next != null)
			lastNode = lastNode.next;
		lastNode.next = new_node;
		return;
	}

	void deleteNode(int num) {
		Node currNode = head;
		Node prevNode = null;
		if (currNode != null && currNode.data != num) {
			head = currNode.next;
			return;
		}
		while (currNode != null && currNode.data != num) {
			prevNode = currNode;
			currNode = currNode.next;
		}
	}

	public int getCount() {
		Node tempNode = head;
		int count = 0;
		while (tempNode != null) {
			count++;
			tempNode = tempNode.next;
		}
		return count;
	}

	public boolean search(Node head, int x) {
		Node curr = head;
		while (curr != null) {
			if (curr.data == x)
				return true;
			curr = curr.next;
		}
		return false;
	}

	static boolean findCycle(Node head) {
		Node slow = head, fast = head;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast)
				return true;
		}
		return false;
	}

	void printMiddle() {

		if (head == null)
			return;
		// this is optimise method to find middle

		Node slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		System.out.println(slow.data);

		/*
		 * int count = 0; Node curr; for (curr = head; curr != null; curr = curr.next)
		 * count++; curr = head; for (int i = 0; i < count / 2; i++) curr = curr.next;
		 * System.out.println(curr.data);
		 */

	}

	void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + " ");
			tnode = tnode.next;
		}
	}

}
