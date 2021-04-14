package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Implement_Stack_Array1 {

	public static void main(String[] args) throws NumberFormatException, IOException {

//		Scanner sc = new Scanner(System.in);
//		int t = sc.nextInt();

		/*BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(read.readLine());

		while (t > 0) {
			MyStacker s = new MyStacker();
			int Q = Integer.parseInt(read.readLine());
			int k = 0;
			String str[] = read.readLine().trim().split(" ");
			while (Q > 0) {
				int QuaryType = 0;
				QuaryType = Integer.parseInt(str[k++]);
				if (QuaryType == 1) {
					int a = Integer.parseInt(str[k++]);
					s.push(a);
				} else if (QuaryType == 1) {
					System.out.println(s.pop() + " ");
				}
				Q--;
			}
			System.out.println("");
			t--;
		}
		*/
		MyStacker s = new MyStacker();
		s.push(5);
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());

	}

}

class MyStacker {

	int top;
	int arr[] = new int[1000];

	MyStacker() {
		top = -1;

	}

	void push(int a) {
		arr[++top] = a;
	}

	int pop() {
		if (top == -1) {

			return -1;
		}
//         int res = arr[top];
// 		top--;
// 		return res;
		return arr[top--];
	}

	int peek() {
		if (top == -1) {
			System.out.println("Stack is Empty");
			return Integer.MIN_VALUE;
		}
		return arr[top];
	}

	int size() {
		return (top + 1);
	}

	boolean isEmpty() {
		return top == -1;
	}
}
