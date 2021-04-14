package Backtracking;

import java.util.ArrayList;

public class ArrayList_ {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		System.out.println(list.size());

		list.add(10);
		System.out.println(list);

		list.add(20);
		System.out.println(list);
		list.add(30);
		System.out.println(list);

		list.remove(1);
		System.out.println(list);

		list.remove(list.size() - 1);
		System.out.println(list);

		list.add(50);
		System.out.println(list);
		list.add(60);
		System.out.println(list);

		// you want to create new list with extactly the same content mathod 1

//		ArrayList<Integer> list1 = new ArrayList<Integer>();
//
//		
//		// add = to add value
//		// if u want to obtain index value use get fuction
//
//		for (int i = 0; i < list.size(); i++) {
//			list1.add(list.get(i));
//		}
//		System.out.println(list1);

		// you want to create new list with extactly the same content method 2

		ArrayList<Integer> list1 = new ArrayList<Integer>(list);
		list1.add(52);
		System.out.println(list1);

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

		// nesting of arrayList

		ArrayList<ArrayList<Integer>> list2 = new ArrayList<ArrayList<Integer>>();
		
		list2.add(list);
		list2.add(list1);
		System.out.println(list2);

	}

}
