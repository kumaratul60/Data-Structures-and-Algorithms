package Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMap_demostration {

//public class HashMap<K,V> extends AbstractMap<K,V> implements Map<K,V>, Cloneable, Serializable

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();

		map.put("vis", 10);
		map.put("kis", 20);
		map.put("tis", 30);
		map.put("tis", 40);
		map.put("os", 40);

		System.out.println("Size " + map.size());
		System.out.println();

		System.out.println(map);
		System.out.println();

		map.remove("os");
		System.out.println("Size " + map.size());
		System.out.println();

		System.out.println(map);
		System.out.println();

		System.out.println(map.containsKey("vis"));
		System.out.println(map.containsValue(10));
		System.out.println();

		System.out.println(map.containsKey(10));
		System.out.println(map.containsValue("vis"));
		System.out.println();

		if (map.containsKey("kis")) {
			Integer a = map.get("kis");
			System.out.println("value of key " + "\"kis\" is " + a);
			System.out.println();

		}

		System.out.println("-----------demostration of 2 hashMap-------------" + "\n");

		// HashMap<K, V> hm = new HashMap<K, V>();

		// No need to mention the
		// Generic type twice
		HashMap<Integer, String> hm1 = new HashMap<>();

		// Initialization of a HashMap
		// using Generics
		HashMap<Integer, String> hm2 = new HashMap<Integer, String>();

		// Add Elements using put method
		hm1.put(1, "one");
		hm1.put(2, "two");
		hm1.put(3, "three");

		hm2.put(4, "four");
		hm2.put(5, "five");
		hm2.put(6, "six");

		System.out.println("Mappings of HashMap hm1 are : " + hm1 + " size " + hm1.size());
		System.out.println("Mapping of HashMap hm2 are : " + hm2);
		System.out.println();

		System.out.println("----------HashMap with int initialCapacity-------------" + "\n");

		// HashMap<K, V> hm = new HashMap<K, V>(int initialCapacity);

		// HashMap<Integer, String> hm11 = new HashMap<>(10);

		// Initialization of a HashMap
		// using Generics
		// HashMap<Integer, String> hm22 = new HashMap<Integer, String>(2);

		// Add Elements using put method

//		hm11.put(1, "one");
//		hm11.put(2, "two");
//		hm11.put(3, "three");
//
//		hm22.put(4, "four");
//		hm22.put(5, "five");
//		hm22.put(6, "six");
//		hm22.put(7, "six");
//
//		System.out.println("Mappings of HashMap hm1 are : " + hm11);
//		System.out.println("Mapping of HashMap hm2 are : " + hm22);
		System.out.println();

		// ----------------------------------------------------------------------------------------//
		System.out.println("-----------HashMap(int initialCapacity, float loadFactor)---------" + "\n");
		// HashMap<K, V> hm = new HashMap<K, V>(int initialCapacity, int loadFactor);

		// HashMap<Integer, String> hm11 = new HashMap<>(5, 0.75f);

		// Initialization of a HashMap
		// using Generics

		// HashMap<Integer, String> hm22 = new HashMap<Integer, String>(3, 0.5f);

//		hm11.put(1, "one");
//		hm11.put(2, "two");
//		hm11.put(3, "three");
//
//		hm22.put(4, "four");
//		hm22.put(5, "five");
//		hm22.put(6, "six");
//		hm22.put(7, "six");

//		System.out.println("Mappings of HashMap hm1 are : " + hm11);
//		System.out.println("Mapping of HashMap hm2 are : " + hm22);
		System.out.println();
////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("-------------HashMap(Map map)--------------" + "\n");
		// HashMap<K, V> hm = new HashMap<K, V>(Map map);

		Map<Integer, String> hm11 = new HashMap<>();

		// Add Elements using put method
		hm11.put(1, "one");
		hm11.put(2, "two");
		hm11.put(3, "three");

		// Initialization of a HashMap
		// using Generics
		HashMap<Integer, String> hm22 = new HashMap<Integer, String>(hm11);

		System.out.println("Mappings of HashMap hm1 are : " + hm11);

		System.out.println("Mapping of HashMap hm2 are : " + hm22);
		System.out.println();

		System.out.println("------------Changing elements-----" + "\n");

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		// Change Value using put method
		hm.put(1, "Geeks");
		hm.put(2, "Geeks");
		hm.put(3, "Geeks");

		System.out.println("Initial Map " + hm);

		hm.put(2, "For");

		System.out.println("Updated Map " + hm);

		// Iterate the map using
		// for-each loop
		for (Entry<Integer, String> e : hm.entrySet())
			System.out.println("Key: " + e.getKey() + " Value: " + e.getValue());
		System.out.println();

		/////////////////////////////////////////////////////////////////////////////
		System.out.println("--------------Creating empty hashMap-------" + "\n");
		HashMap<String, Integer> hash_map1 = new HashMap<String, Integer>();

		// Displaying the HashMap
		System.out.println("The Mappings are: " + hash_map1);

		// Checking for the emptiness of Map
		System.out.println("Is the map empty? " + hash_map1.isEmpty());

	}

}
