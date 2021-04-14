package OOPs;

public class Interfaces_Car implements Car12, Person12 {

	public static void main(String[] args) {

		Interfaces_Car bum = new Interfaces_Car();
	
		bum.run();

	}

	@Override
	public void run() {
		System.out.println("my car is starting");
	}

	@Override
	public void walk() {
		System.out.println("my car person  is starting");
	}

}

interface Car12 {
	void run();

}

interface Person12 {
	void walk();
}
