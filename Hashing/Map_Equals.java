package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Map_Equals {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap<Integer, String>();
		Map<Integer, String> map2 = new HashMap<Integer, String>();

		// Mapping string values to int keys
		map1.put(10, "Geeks");
		map1.put(15, "4");
		map1.put(20, "Geeks");
		map1.put(25, "Welcomes");
		map1.put(30, "You");
		

		// Mapping string values to int keys
		map2.put(10, "Geeks");
		map2.put(15, "4");
		map2.put(20, "Geeks");
		map2.put(25, "Welcomes");
		map2.put(30, "You");
	        
//	        map2.put(10, "Geeks"); 
//	        map2.put(15, "4"); 
//	        map2.put(20, "Geek"); 
//	        map2.put(25, "Welcomes"); 
//	        map2.put(30, "You"); 

		// Displaying the Map1
		System.out.println("First Map: " + map1);

		// Displaying the Map2
		System.out.println("Second Map: " + map2);

		// Checking the equality
		System.out.println("Equality: " + map1.equals(map2));
		
	}

}
