package Stack;

import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class Sort_stack {

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
		//	System.out.print(s+" ");
			printStack(s);
			sortStack(s);
			System.out.println();
			printStack(s);

		}
	}

	static void sortInsert(Stack<Integer> s, int a) {
		if (s.size() == 0 || s.peek() < a) {
			s.push(a);
			return;
		}
		int temp = s.pop();
		sortInsert(s, a);

		s.push(temp);

	}

	static void sortStack(Stack<Integer> s) {
		if (s.size() == 1)
			return;
		int temp = s.pop();
		sortStack(s);
		sortInsert(s, temp);

	}

	static void printStack(Stack<Integer> s) {
		ListIterator<Integer> lt = s.listIterator();

		while (lt.hasNext())
			lt.next();

		while (lt.hasPrevious())
			System.out.print(lt.previous() + " ");
		
	}

}
