package Arrays_Classes;

import java.util.Arrays;
import java.util.Comparator;

// static <T> void sort(T[] a, int fromIndex, int toIndex, Comparator< super T> c): This method sorts the specified range of the specified array of objects according to the order induced by the specified comparator.

class Student {
	int rollno;
	String name, address;

	// Constructor
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	// Used to print student details in main()
	public String toString() {
		return this.rollno + " " + this.name + " " + this.address;
	}
}

class Sortbyroll implements Comparator<Student> {
	// Used for sorting in ascending order of
	// roll number
	public int compare(Student a, Student b) {
		return a.rollno - b.rollno;
	}
}

// Driver class 
class StaticVoid_Sort {
	public static void main(String[] args) {
		Student[] arr = { new Student(111, "bbbb", "london"), new Student(131, "aaaa", "nyc"),
				new Student(121, "cccc", "jaipur") };

		System.out.println("Unsorted");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

		Arrays.sort(arr, 1, 2, new Sortbyroll());

		System.out.println("\nSorted by rollno");
		for (int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);

	}

}
