package LinkedList;

public class LinkedList_Main {

	public static void main(String[] args) {

		LinkedList list = new LinkedList();
		list.insertBig(2);
		list.insertAtEnd(1);
		list.insertAtEnd(5);
		list.printList();
		list.insert(1,6);
		list.insert(6,7);
		list.printList();
		list.delete(1);
		list.printList();
		

	}
}
