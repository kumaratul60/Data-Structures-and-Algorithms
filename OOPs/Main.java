package OOPs;

public class Main {
	public static void main(String[] args) {
		// System.out.println("hello");

		Person p1 = new Person();
		p1.name = "Atul";
		p1.age = 23;

		Person p2 = new Person(25,"KLM");
		p2.name = "fghi";
		p2.age = 21;

//		System.out.println(p1.age + " " + p1.name); // property
//		System.out.println(p2.age + " " + p2.name);

		// method == function
//		p1.walk(); // behaviour
//		p2.sleep();
//		p1.walk(250);

		// constructors
		System.out.println(Person.count);
		Person p3 = new Person(25, "KLM");
		p3.walk(); // behaviour
		p3.walk(250);

	}

}

class Person {
	String name;
	int age;

	static int count;

	public Person() {
		count++;
		System.out.println("creating new object");
	}

//	public Person(int newAge, String newName) {
//		this();  // current class constructor/object/method/ call 1 constructor to another constructor
//		name = newName;
//		age = newAge;
//	}
	
	public Person(int age, String name) {
		this();  // current class constructor/object/method/ call 1 constructor to another constructor
		this.name = name;
		this.age = age;
	}

	void walk() {
		System.out.println(name + " is walking");
	}

	void sleep() {
		System.out.println(name + " is sleeping");
	}

	void walk(int steps) {
		System.out.println(name + " walked " + steps + " steps");
	}

}
