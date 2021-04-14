package Fundamentals;

public class DiskAllocation {
	public static void main(String[] args) {
		
		 Runtime rt = Runtime.getRuntime(); 
	        long memory1, memory2; 
	        Integer integer[] = new Integer[1000]; 
	  
	        // checking the total memeory 
	        System.out.println("Total memory is: "
	                           + rt.totalMemory()); 
	  
	        // checking free memory 
	        memory1 = rt.freeMemory(); 
	        System.out.println("Initial free memory: "
	                                      + memory1); 
	  
	        // calling the garbage collector on demand 
	        rt.gc(); 
	  
	        memory1 = rt.freeMemory(); 
	  
	        System.out.println("Free memory after garbage "
	                           + "collection: " + memory1); 
	  
	        // allocating integers 
	        for (int i = 0; i < 1000; i++) 
	            integer[i] = new Integer(i); 
	  
	        memory2 = rt.freeMemory(); 
	        System.out.println("Free memory after allocation: "
	                           + memory2); 
	  
	        System.out.println("Memeory used by allocation: " + 
	                                    (memory1 - memory2)); 
	  
	        // discard integers 
	        for (int i = 0; i < 1000; i++) 
	            integer[i] = null; 
	  
	        rt.gc(); 
	  
	        memory2 = rt.freeMemory(); 
	        System.out.println("Free memeory after  "
	            + "collecting discarded Integers: " + memory2); 
	}

}
