package OOPs;

public class Inheritance {

	public static void main(String[] args) {

		Student s1 = new Student(23, "Atul");

		Dev d1 = new Dev(23, "pop");
		d1.walk();
		
		Student s = new Student(24,"nn");
		s.walk();
		

	}

}

class Dev extends Student {

	public Dev(int age, String name) {
		super(age, name);

	}

}

 class Student {
	String name;
	int age;

	public  Student(int age, String name) {
		// current class constructor/object/method/ call 1 constructor to another
		// constructor
		this.name = name;
		this.age = age;
	}

	void walk() {
		System.out.println("Dev " + name + " is walking");
	}

	void sleep() {
		System.out.println(name + " is sleeping");
	}

	void doWork() {
		System.out.println("Student is working ");
	}
}
