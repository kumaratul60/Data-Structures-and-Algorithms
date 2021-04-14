package Stack;

import java.util.ArrayList;

public class Implement_Stack_ArrayList {

	public static void main(String[] args) {

		ArrayListS s = new ArrayListS();
		s.push(5);
		s.push(10);
		s.push(20);
		System.out.println(s.pop());
		System.out.println(s.size());
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
	}

}

class ArrayListS {

	ArrayList<Integer> al = new ArrayList<>();

	void push(int x) {
		al.add(x);
	}

	int pop() {
		int res = al.get(al.size() - 1);  // last item
		al.remove(al.size() - 1);
		return res;
	}

	int peek() {
		return al.get(al.size() - 1);    
	}

	int size() {
		//return al.get(al.size());
		 return al.size();
	}

	boolean isEmpty() {
		//return al.size() == 0;
		 return al.isEmpty();
	}

}
