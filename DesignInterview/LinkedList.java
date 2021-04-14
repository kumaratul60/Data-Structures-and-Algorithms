package DesignInterview;

class LinkedList {
	public static void main(String[] args) {

		LinkedList list = new LinkedList();

		// creating first linked list
		LinkedList.head1 = new Node(5);
		list.head1.next = new Node(10);
		list.head1.next.next = new Node(15);
		list.head1.next.next.next = new Node(20);
		list.head1.next.next.next.next = new Node(25);
		list.head1.next.next.next.next = new Node(30);
		list.head1.next.next.next.next = new Node(35);

		// creating second linked list
		list.head2 = new Node(11);
		list.head2.next = new Node(20);
		list.head2.next.next = new Node(30);

		System.out.println("Identifying the node where they join " + "\n" + list.getNode());

//		System.out.println("Count of nodes in list 1 " + list.getCount(head1));
//		System.out.println("Count of nodes in list 2 " + list.getCount(head2));
	}

	static Node head1, head2;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	// function to get the intersection point or Identifying point of two
	// linked lists head1 and head2
	int getNode() {

		int c1 = getCount(head1);
		int c2 = getCount(head2);
		int d;

		if (c1 > c2) {
			d = c1 - c2;
			return getIdentifyingPoint(d, head1, head2);
		} else {
			d = c2 - c1;
			return getIdentifyingPoint(d, head2, head1);
		}
	}

	// function to get the intersection point of two linked lists head1 and head2
	// where head1 has d more nodes than head2

	int getIdentifyingPoint(int d, Node node1, Node node2) {

		int i;

		Node current1 = node1;
		Node current2 = node2;

		for (i = 0; i < d; i++) {
			if (current1 == null) {
				return -1;
			}
			current1 = current1.next;
		}
		while (current1 != null && current2 != null) {
			if (current1.data == current2.data) {
				return current1.data;
			}
			current1 = current1.next;
			current2 = current2.next;
		}

		return -1;
	}

	// Takes head pointer of the linked list and returns the count of nodes in the
	// list

	int getCount(Node node) {

		Node current = node;
		int count = 0;

		while (current != null) {
			count++;
			current = current.next;
		}

		return count;
	}

}

//Time Complexity: O(node+data) 
//Auxiliary Space: O(1)
