package Queue;

public class ListMain {
	public static void main(String[] args) {
		ListQueue queue = new ListQueue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);

		int data = queue.dequeue();
		System.out.println(data);
		data = queue.dequeue();
		System.out.println(data);
	}

}
