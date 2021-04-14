package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMap_Traversal {

	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<>();

		// Add elements using put method
		map.put("vishal", 10);
		map.put("sachin", 30);
		map.put("vaibhav", 20);

		// Iterate the map using
		// for-each loop
		for (Map.Entry<String, Integer> e : map.entrySet())
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
	//System.out.println(e.getValue());
	}

}
