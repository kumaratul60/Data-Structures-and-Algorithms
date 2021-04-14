package Hashing;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetCollectionObject {

	public static void main(String[] args) {

		HashSet<ArrayList> set = new HashSet<>();

		ArrayList<Integer> list1 = new ArrayList<>();

		ArrayList<Integer> list2 = new ArrayList<>();

		list1.add(1);
		list1.add(2);
		list1.add(3);
		list2.add(1);
		list2.add(2);
		list2.add(3);
		// list1.add(2);

		set.add(list1);
		set.add(list2);

		System.out.println(set.size());

		// Reason: Before storing an Object, HashSet checks whether there is an existing
		// entry
		// using hashCode() and equals() methods.
		// In the above example, two lists are considered equal
		// if they have the same elements in the same order.
		// When you invoke the hashCode() method on the two lists, they both would give
		// the
		// same hash since they are equal.

	}

}
