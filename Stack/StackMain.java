package Stack;

public class StackMain {
	public static void main(String[] args) {
		
//		StackArray stackArray = new StackArray();
//		stackArray.push(1);
//		stackArray.push(2);
//		stackArray.push(3);
//		int data = stackArray.pop();
//		System.out.println("Element popped " + data);
//		data = stackArray.pop();
//		System.out.println("Element popped " + data);
		
		StackLinkedList stackList = new StackLinkedList();
		stackList.push(3);
		stackList.push(2);
		stackList.push(1);
		stackList.push(5);
		
		int data = stackList.pop();
		System.out.println("element popped " + data);
		data = stackList.pop();
		System.out.println("element popped " + data);
	   
		
	}

}
