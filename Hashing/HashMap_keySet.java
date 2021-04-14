package Hashing;

import java.util.HashMap;

public class HashMap_keySet {

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

		// Using keySet() to get the set view of keys
		System.out.println("The set is: " + hash_map.keySet());
	}

}
