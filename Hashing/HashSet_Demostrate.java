package Hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet_Demostrate {

	public static void main(String[] args) {

		HashSet<Integer> hs = new HashSet<>();
		
		hs.add(2);
		hs.add(1);

		hs.add(3);
		hs.add(4);
		hs.add(5);
		hs.add(6);
		hs.add(7);

		hs.add(7);
		hs.add(7);

		// Removing elements using remove() method
		hs.remove(7);

		System.out.println(hs);

		hs.add(9);
		System.out.println(hs);
		System.out.println();

		// Check for 8 in the hs
		System.out.println(hs.contains(8));
		System.out.println();

		// Displaying the size of the HashSet
		System.out.println("size of hashSet " + hs.size());
		System.out.println();

		// Creating an iterator
		Iterator<Integer> i = hs.iterator();

		// Displaying the values after iterating through the set
		while (i.hasNext())
			System.out.println(i.next());
		System.out.println();

		// OR

		Iterator itr = hs.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		System.out.println();

		// using Enhanced for loop

		for (Integer ie : hs)
			System.out.println(ie);
		System.out.println();

		// Using toString() method
		System.out.println(hs.toString());
		System.out.println();

		// Getting the hashcode value for the hs
		System.out.println(hs.hashCode());
		System.out.println();

////////HashSet clone() Method in Java

		// Displaying the HashSet
		System.out.println("HashSet: " + hs);

		// Creating a new cloned set
		HashSet cloned_set = new HashSet();

		// Cloning the set using clone() method
		cloned_set = (HashSet) hs.clone();

		// Displaying the new Set after Cloning;
		System.out.println("The new set: " + cloned_set);

		// Displaying the HashSet
		System.out.println("HashSet: " + hs);

		// Check for the empty set
		System.out.println("Is the set empty: " + hs.isEmpty());

		// Clearing the set using clear() method
		hs.clear();

		// Again Checking for the empty set
		System.out.println("Is the set empty: " + hs.isEmpty());
		System.out.println();
		
		System.out.println(hs);

//		HashSet<String> hss = new HashSet<>();
//
//		hss.add("A");
//		hss.add("B");
//		hss.add("C");
//		hss.add("D");
//		hss.add("F");
//		hss.add("E");
//		hss.add("G");
//		hss.add("H");
//
//		hss.add("H");
//		hss.add("H");
//
//		System.out.println(hss);
//		System.out.println(hss.contains("F"));
//
//		hss.remove("A");
//		System.out.println(hss);
//		System.out.println(hss.size());
//
//		HashSet<Character> hc = new HashSet<>();
//
//		hc.add('a');
//		hc.add('b');
//		hc.add('c');
//		hc.add('d');
//		hc.add('e');
//		hc.add('f');
//		hc.add('g');
//
//		hc.add('g');
//		hc.add('g');
//
//		System.out.println(hc);
//		System.out.println(hc.contains('A'));
//
//		hc.remove('z');
//
//		System.out.println(hc);
//		System.out.println(hc.size());

	}

}
