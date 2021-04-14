package Stack;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class Revesre_Stack {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int a[] = new int[n];
			for (int i = 0; i < n; i++)
				a[i] = sc.nextInt();
			Stack<Integer> s = new Stack<>();
			for (int i = 0; i < n; i++)
				s.push(a[i]);
			reverse(s);
		//	printStack(s);

		}

	}

	static void insert(Stack<Integer> s, int a) {
		if (s.size() == 0) {
			s.push(a);
		} else {
			int temp = s.peek();
			s.pop();
			insert(s, a);
			s.push(a);
			//return;
		}
	}

	static void reverse(Stack<Integer> s) {
		if (s.size() == 1)
			return;
		int temp = s.peek();
		s.pop();
		reverse(s);
		insert(s, temp);
		//return;
	}

	static int[] reverseStack(int[] s) {
		int res[] = new int[s.length];
		//reverse(s);
		return s;
		
		
	}

}
