package GFG_30_days_code;

import java.util.HashMap;

public class Day15_Count_Triplets_LinkedLinst {

	public static void main(String[] args) {
		Node head = null;

		// insert values in sorted order
		head = Node.insert(head, 9);
		head = Node.insert(head, 8);
		head = Node.insert(head, 6);
		head = Node.insert(head, 5);
		head = Node.insert(head, 4);
		head = Node.insert(head, 2);
		head = Node.insert(head, 1);

		int x = 17;

		System.out.print("Count = " + Node.countTriplets(head, x));
	}

}

class Node {
	int data;
	Node next, prev;

	Node(int val) {
		data = val;
		prev = null;
		next = null;
	}

	static int countTriplets(Node head, int x) {
		Node p1, p2, p3;
		int count = 0;

		HashMap<Integer, Node> hm = new HashMap<>();

		for (p1 = head; p1 != null; p1 = p1.next)
			hm.put(p1.data, p1);

		for (p2 = head; p2 != null; p2 = p2.next)
			for (p3 = p2.next; p3 != null; p3 = p3.next) {

				int pSum = p2.data + p3.data;

				if (hm.containsKey(x - pSum) && hm.get(x - pSum) != p2 && hm.get(x - pSum) != p3)

					count++;
			}

		return count / 3;
	}

	static int countTriplets_loop(Node head, int x) {
		Node ptr1, ptr2, ptr3;
		int count = 0;

		// generate all possible triplets
		for (ptr1 = head; ptr1 != null; ptr1 = ptr1.next)
			for (ptr2 = ptr1.next; ptr2 != null; ptr2 = ptr2.next)
				for (ptr3 = ptr2.next; ptr3 != null; ptr3 = ptr3.next)

					// if elements in the current triplet sum up to 'x'
					if ((ptr1.data + ptr2.data + ptr3.data) == x)

						// increment count
						count++;

		// required count of triplets
		return count;
	}

	static Node insert(Node head, int val) {
		// allocate node
		Node temp = new Node(val);

		if (head == null)
			head = temp;

		else {
			temp.next = head;
			head.prev = temp;
			head = temp;
		}

		return head;
	}

	static Node insert1(Node head, int val) {
		if (head == null)
			return new Node(val);

		head.next = insert(head.next, val);
		return head;
	}

}
