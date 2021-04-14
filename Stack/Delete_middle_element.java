package Stack;

import java.util.ArrayList;
import java.util.Stack;

public class Delete_middle_element {

	public static void main(String[] args) {
		

	}
	static int middleEle(Stack<Integer> s,int n) {
		ArrayList<Integer> al = new ArrayList<>();
	//	if(s.size()==0) return al.add(al.get(s));
		int k = n/2+1;
		solve(s,k);
		//return s;
		return 0;
	}
	static void solve(Stack<Integer> s,int k) {
		if(k==1) {
			s.pop(); return; }
		int temp = s.peek();
		solve(s,k-1);
		s.push(temp);
		return;
	}

}
