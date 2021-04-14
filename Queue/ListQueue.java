package Queue;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;

	}
}

public class ListQueue {
	Node front = null, rear = null;

	void enqueue(int data) {
		Node newNode = new Node(data);
		if (rear == null) {
			rear = front = newNode;
			return;
		}
		rear.next = newNode;
		rear = rear.next;
	}

	int dequeue() {
		if (front == null) {
			System.out.println("Queue is empty");

			return -1;
		}
		int data = front.data;
		front = front.next;
		if (front == null) {
			rear = null;

		}
		return data;
	}

}
