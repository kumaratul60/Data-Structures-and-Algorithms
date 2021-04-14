package Hashing;

import java.util.HashMap;

public class HashMap_ValuesSet {

	public static void main(String[] args) {
		HashMap<Integer, String> hash_map = new HashMap<Integer, String>();

		// Mapping string values to int keys
		hash_map.put(10, "Geeks");
		hash_map.put(15, "4");
		hash_map.put(20, "Geeks");
		hash_map.put(25, "Welcomes");
		hash_map.put(30, "You");

		// Displaying the HashMap
		System.out.println("Initial Mappings are: " + hash_map);

		// Using values() to get the set view of values
		System.out.println("The collection is: " + hash_map.values());

		HashMap<String, Integer> hash_map1 = new HashMap<String, Integer>();

		// Mapping int values to string keys
		hash_map1.put("Geeks", 10);
		hash_map1.put("4", 15);
		hash_map1.put("Geeks", 20);
		hash_map1.put("Welcomes", 25);
		hash_map1.put("You", 30);

		// Displaying the HashMap
		System.out.println("Initial Mappings are: " + hash_map1);

		// Using values() to get the set view of values
		System.out.println("The collection is: " + hash_map1.values());
	}

}
