package Stack;

public class StackArray {
	int top = -1;
	int max = 1000;
	int stack[] = new int[max];

	boolean isFull() {
		if (top == (max - 1))  // overflow condition
		{
			return true;
		}
		return false;

	}

	boolean push(int data) {
		if (isFull()) 
		{
			System.out.println("stack is full");
			return false;
		}
		stack[++top] = data;
		return true;
	}
	boolean isEmpty() {
		return(top<0);
	}

	int pop() {
		if (isEmpty()) // underflow condition
		{
			System.out.println("stack is empty");
			return -1;
		}
		int data = stack[top];
		top--;
		return data;
	}

}
