package DLL;

class Node {
	int data;
	Node next;
	Node prev;

	Node(int data) {
		this.data = data;
		this.next = null;
		this.prev = null;
	}

}

public class DoublyLinkedList {
	Node head = null;

	void reverse() {
		Node temp = null, current = head;
		while (current != null) {
			temp = current.prev;
			current.prev = current.next;
			current.next = temp;
			current = current.prev;
		}
		if (temp != null)
			head = temp.prev;
	}

	void insertBig(int data) {

		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}

	void insertEnd(int data) {

		Node newNode = new Node(data);
		if (head == null)
			head = newNode;
		Node tempNode = head;
		while (tempNode.next != null)
			tempNode = tempNode.next;

		tempNode.next = newNode;
		newNode.prev = tempNode;

	}

	void insertAfter(int num, int data) {
		Node tempNode = head;
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		while (tempNode != null && tempNode.data != num)
			tempNode = tempNode.next;

		newNode.next = tempNode.next;
		if (newNode.next != null)
			newNode.next.prev = newNode;
		tempNode.next = newNode;
		newNode.prev = tempNode;

	}

	void delete(int data) {

		if (head == null) {
			System.out.println("List is Empty");
			return;

		}
		Node delNode = head;
		while (delNode != null && delNode.data != data)
			delNode = delNode.next;
		if (delNode == head) {
			head = head.next;
			head.prev = null;
			return;
		}
		delNode.prev.next = delNode.next;
		if (delNode.next != null)
			delNode.prev = delNode.prev;
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

	int getCount() {
		Node tnode = head;
		if (head == null)
			return 0;

		int count = 0;
		while (tnode != null) {
			count++;
			tnode = tnode.next;
		}
		return count;

	}

	void printList() {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " ");
			currNode = currNode.next;

		}
	}

}
