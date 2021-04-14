package OOPs;

public class Abstraction {

	public static void main(String[] args) {

		// car is a concept so there is no benefit to create car class object so we
		// declare car class as abstract

		BMW b1 = new BMW();
		b1.run();

		Audi a1 = new Audi();
		a1.run();

	}
}

class BMW extends Car {

	@Override
	void run() {
		System.out.println("BMW is running ");
	}

}

class Audi extends Car {

	@Override
	void run() {
		System.out.println("Audi is running ");
	}

}

abstract class Car {
	String roof;
	int price;

	abstract void run();

	void breaks() {
		System.out.println("Car is breaking  ");
	}
}
