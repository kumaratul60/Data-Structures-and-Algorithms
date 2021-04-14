package Stack;

import java.util.Scanner;

public class TwoStackArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StackArray1 sa = new StackArray1(n);
		int stack1 = sc.nextInt();
		int stack2 = sc.nextInt();
		int element;
		for (int i = 0; i < stack1; i++) {
			element = sc.nextInt();
			sa.push1(element);
		}
		for (int i = 0; i < stack2; i++) {
			element = sc.nextInt();
			sa.push2(element);
		}
		System.out.println("stack1: ");
		sa.print1();
		System.out.println("stack2: ");
		sa.print2();

		sa.push1(15);
		int num = sa.top1 + 1;
		while (num != 0) {
			sa.pop1();
			num--;
		}
		sa.pop1();

	}
}

class StackArray1 {
	public int size;
	public int top1, top2;
	public int arr[];

	StackArray1(int n) {
		arr = new int[n];
		size = n;
		top1 = -1;
		top2 = size;
	}

	void push1(int data) {
		if (top1 < top2 - 1) {
			arr[++top1] = data;
		} else
			System.out.println("Stack1 overflow");
	}

	void push2(int data) {
		if (top1 < top2 - 1) {
			arr[--top1] = data;
		} else
			System.out.println("Stack2 overflow");
	}

	void pop1() {
		if (top1 > -1) {
			int poppedElement = arr[top1--];
			System.out.println("Stack1 poppedElement: " + poppedElement);
		} else
			System.out.println("Stack1 underflow");
	}

	void pop2() {
		if (top2 < size) {
			int poppedElement = arr[top2++];
			System.out.println("Stack2 poppedElement: " + poppedElement);
		} else
			System.out.println("Stack2 underflow");
	}

	void print1() {
		for (int i = top1; i >= 0; i--)
			System.out.println(arr[i] + " ");
		System.out.println();
	}

	void print2() {
		for (int i = top2; i < size; i++)
			System.out.println(arr[i] + " ");
		System.out.println();
	}

}
