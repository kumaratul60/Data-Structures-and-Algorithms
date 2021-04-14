package myLinkedList;

import java.util.Scanner;

import DLL.DoublyLinkedList;

public class LinkedList_Main {
	public static void main(String[] args) {

//		Scanner sc = new Scanner(System.in);
		LinkedList list = new LinkedList();
//		int listcount = sc.nextInt();
//		for (int i = 0; i < listcount; i++) {
//			int dlistItem = sc.nextInt();
//			list.insertAtBig(dlistItem);
//		}
//		list.head.next.next.next.next = list.head.next.next.next;
//		boolean res = findCycle(list.head);
//
//		if (res)
//			System.out.println("Cycle found");
//		else
//			System.out.println("Cycle Not fount");

		list.insertAtBig(5);
		list.insertAtBig(6);
		list.insertAtBig(58);
		list.insertAtBig(58);
		list.printList();
		System.out.println("total node " + list.getCount());
		System.out.println();
		list.insert(6, 7);
		list.insert(58, 59);
		list.printList();
		System.out.println("total node " + list.getCount());
		System.out.println();
		list.insertAfter(list.head.next, 4);
		list.insertAfter(list.head.next, 42);
		list.insertAfter(list.head.next, 47);
		list.printList();
		System.out.println("total node " + list.getCount());
		System.out.println();
		list.insertAtEnd(8);
		list.insertAtEnd(18);
		list.printList();
		System.out.println("total node " + list.getCount());
		System.out.println();
		list.deleteNode(2);
		list.deleteNode(1);
		list.deleteNode(7);
		list.printList();
		System.out.println("total node " + list.getCount());
		System.out.println();
		if (list.search(list.head, 12))
			System.out.println("Yes");
		else
			System.out.println("No");
		System.out.println();
		list.reverse();
		list.printList();
		System.out.println("total node " + list.getCount());
		System.out.println();
		list.printMiddle();
		System.out.println();

	}

}
