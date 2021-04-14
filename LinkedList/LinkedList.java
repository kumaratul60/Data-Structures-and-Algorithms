package LinkedList;

class Node {
	int data; // head of list
	Node next;

	Node(int data) // Constructor
	{
		this.data = data;
		this.next = null;
	}
}

public class LinkedList {

	Node head = null;

	void insertBig(int data) // Method of inserting new node at the Beginning
	{

		Node newNode = new Node(data); // Create a new node with given data
		newNode.next = head;
		head = newNode;

	}

	void insert(int num, int data) {

		Node tempNode = head;
		while (tempNode != null && tempNode.data != num)
			tempNode = tempNode.next;

		Node newNode = new Node(data);
		newNode.next = tempNode.next;
		tempNode.next = newNode;

	}

	void insertAtEnd(int data) // Method of inserting new node at the End
	{

		Node newNode = new Node(data); // create a new node

		if (head == null) // If the Linked List is empty,then make the new node as head;
		{
			head = newNode;
		} else {
			Node tempNode = head;
			while (tempNode.next != null) {
				tempNode = tempNode.next;
			}

			tempNode.next = newNode; // Insert the new_node at last node

		}
	}

	void delete(int num) {

		Node currNode = head;
		Node prevNode = null;

		while (currNode != null && currNode.data != num)
			prevNode = currNode;
			currNode = currNode.next;

		if (currNode == head) {
			if (head == null) {
				System.out.println("List is empty");
				return;
			}
			head = head.next; // update head to next node
			return;
		}
		prevNode.next = currNode.next;
	}

	public void printList() // Method to print the LinkedList
	{
		Node  tNode = head;

		while (tNode != null) // Traverse through the LinkedList
		{

			System.out.println(tNode.data); // Print the data at current node

			tNode = tNode.next; // Go to next node
		}
	}
}
