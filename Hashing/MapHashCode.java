package Hashing;

import java.util.HashMap;
import java.util.Map;

public class MapHashCode {

	public static void main(String[] args) {
		// Initializing a Map of type HashMap
		Map<String, String> map = new HashMap<>();
		map.put("1", "One");
		map.put("3", "Three");
		map.put("5", "Five");
		map.put("7", "Seven");
		map.put("9", "Ninde");
		System.out.println(map);

		int hash = map.hashCode();

		System.out.println(hash);

		Map<Integer, String> map1 = new HashMap<>();
		map1.put(1, "One");
		map1.put(3, "Three");
		map1.put(5, "Five");
		map1.put(7, "Seven");
		map1.put(9, "Ninde");
		System.out.println(map1);

		int hash1 = map.hashCode();

		System.out.println(hash1);

	}

}
