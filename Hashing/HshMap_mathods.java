package Hashing;

import java.util.HashMap;

public class HshMap_mathods {

	public static void main(String[] args) {
		HashMap<String, Integer> hash_map = new HashMap<String, Integer>();

		// Mapping int values to string keys
		hash_map.put("Geeks", 10);
		hash_map.put("4", 15);
		hash_map.put("Geeks", 20);
		hash_map.put("Welcomes", 25);
		hash_map.put("You", 30);

		// Displaying the HashMap size
		System.out.println("Size " + hash_map.size());

		// Displaying the HashMap
		System.out.println("Initial Mappings are: " + hash_map);

		// Using keySet() to get the set view of keys
		System.out.println("The set is: " + hash_map.keySet());

		// Using values() to get the set view of values
		System.out.println("The collection is: " + hash_map.values());

		// Getting the hashcode value for the map
		System.out.println("The hashcode value of the map: " + hash_map.hashCode());

		// contains key
		System.out.println(hash_map.containsKey("vis"));

		// contains value
		System.out.println(hash_map.containsValue(30));

		// Getting Value using get()
		// Getting the value of "Welcomes"
		System.out.println("The Value is: " + hash_map.get("Welcomes"));

		// Getting the value of 10
		System.out.println("The Value is: " + hash_map.get(10));

		// Checking for the emptiness of Map
		System.out.println("Is the map empty? " + hash_map.isEmpty());

		if (hash_map.containsKey("You")) {
			Integer a = hash_map.get("kis");
			System.out.println("value of key " + "\"kis\" is " + a);
			System.out.println();
		}

		if (hash_map.containsKey("You")) {
			Integer a = hash_map.get("You");
			System.out.println("value of key " + "\"You\" is " + a);
			System.out.println();
		}
		System.out.println();

		// Displaying the cloned HashMap using clone()
		System.out.println("The cloned map look like this: " + hash_map.clone());

		// Using entrySet() to get the set view
		// Mapping Integer Values to String Keys
		System.out.println("The set is: " + hash_map.entrySet());

		// Clearing the hash map using clear()
		hash_map.clear();

		// Displaying the final HashMap
		System.out.println("Finally the maps look like this: " + hash_map + "\n");

	}

}
