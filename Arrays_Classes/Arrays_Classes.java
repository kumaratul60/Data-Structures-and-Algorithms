package Arrays_Classes;

import java.util.Arrays;

public class Arrays_Classes {

	public static void main(String[] args) {
		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		// 1. static <T> List<T> asList(T… a): This method returns a fixed-size list
		// backed by the specified Arrays
		
		// To convert the elements as List
		System.out.println("Integer Array as List: " + Arrays.asList(intArr));
		
		
	
	}

}
