package DLL;

import java.util.Scanner;

public class DoublyLinkedList_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoublyLinkedList dlist = new DoublyLinkedList();
		int dlistcount = sc.nextInt();
		for (int i = 0; i < dlistcount; i++) {
			int dlistItem = sc.nextInt();
			dlist.insertBig(dlistItem);
		}
		dlist.head.next.next.next.next = dlist.head.next.next.next;
	/*	boolean res = findCycle(dlist.head);
		if (res)
			System.out.println("Cycle found");
		else
			System.out.println("Cycle Not fount");
			*/

		dlist.insertBig(2);
		dlist.insertBig(50);
		dlist.insertBig(0);
		dlist.printList();
		System.out.println("total node " + dlist.getCount());
		dlist.insertEnd(3);
		dlist.insertEnd(4);
		dlist.printList();
		System.out.println("total node " + dlist.getCount());
		dlist.insertAfter(2, 9);
		dlist.printList();
		System.out.println("total node " + dlist.getCount());
		dlist.delete(4);
		dlist.delete(3);
		dlist.printList();
		System.out.println("total node " + dlist.getCount());
		dlist.reverse();
		dlist.printList();
		System.out.println();

	}


}
