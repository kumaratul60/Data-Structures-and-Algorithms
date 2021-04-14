package Hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Set_dmonstration {

	public static void main(String[] args) {

		Set<String> set = new HashSet<>();

		set.add("up");
		set.add("never");
		set.add("ever");
		set.add("give");
		set.add("B");

		System.out.println(set);
		System.out.println();

		System.out.println(set.contains("F"));
		System.out.println();

		String check = "D";

		// Check if the above string exists in
		// the SortedSet or not
		System.out.println("Contains " + check + " " + set.contains(check));
		System.out.println();

		// Removing the element b
		set.remove("B");

		System.out.println("After removing element " + set);
		System.out.println();

		// Iterating though the Set
		for (String value : set)
			System.out.print(value + ", ");
		System.out.println();
		System.out.println();

		// or
		// Iterating over hash set items
		System.out.println("Iterating over set:");
		Iterator<String> i = set.iterator();
		while (i.hasNext())
			System.out.print(i.next() + ", ");
		System.out.println("\n");

		System.out.println("size " + set.size());
		System.out.println();

		// Using toString() method
		System.out.println(set.toString());
		System.out.println();

		// Getting the hashcode value for the hs
		System.out.println(set.hashCode());
		System.out.println();
		
		System.out.println("---------------------------------------");

		Set<Integer> a = new HashSet<Integer>();
		a.addAll(Arrays.asList(new Integer[] { 1, 3, 2, 4, 8, 9, 0 }));
		Set<Integer> b = new HashSet<Integer>();
		b.addAll(Arrays.asList(new Integer[] { 1, 3, 7, 5, 4, 0, 7, 5 }));

		// To find union
		Set<Integer> union = new HashSet<Integer>(a);
		union.addAll(b);
		System.out.print("Union of the two Set");
		System.out.println(union);
		System.out.println();

		// To find intersection
		Set<Integer> intersection = new HashSet<Integer>(a);
		intersection.retainAll(b);
		System.out.print("Intersection of the two Set");
		System.out.println(intersection);
		System.out.println();

		// To find the symmetric difference
		Set<Integer> difference = new HashSet<Integer>(a);
		difference.removeAll(b);
		System.out.print("Difference of the two Set");
		System.out.println(difference);
		System.out.println();

	}

}
