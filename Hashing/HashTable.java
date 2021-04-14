package Hashing;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {

	public static void main(String[] args) {
		 Hashtable<Integer, String> ht1 = new Hashtable<>(); 
		  
	        // Initialization of a Hashtable 
	        // using Generics 
	        Hashtable<Integer, String> ht2 
	            = new Hashtable<Integer, String>(); 
	  
	        // Inserting the Elements 
	        // using put() method 
	        ht1.put(1, "one"); 
	        ht1.put(2, "two"); 
	        ht1.put(3, "three"); 
	  
	        ht2.put(4, "four"); 
	        ht2.put(5, "five"); 
	        ht2.put(6, "six"); 
	  
	        // Print mappings to the console 
	        System.out.println("Mappings of ht1 : " + ht1); 
	        System.out.println("Mappings of ht2 : " + ht2); 
	        
	        /////////////////////////////////////////////////////////////////////
	        
	        Map<Integer, String> hm = new HashMap<>(); 
	        
	        // Inserting the Elements 
	        // using put() method 
	        hm.put(1, "one"); 
	        hm.put(2, "two"); 
	        hm.put(3, "three"); 
	  
	        // Initialization of a Hashtable 
	        // using Generics 
	        Hashtable<Integer, String> ht3 
	            = new Hashtable<Integer, String>(hm); 
	  
	        // Print mappings to the console 
	  
	        System.out.println("Mappings of ht2 : " + ht3);
	  
	}

}
