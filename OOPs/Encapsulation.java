package OOPs;

public class Encapsulation {

	public static void main(String[] args) {
		Laptop l = new Laptop();
		l.setPrice(30);
		System.out.println(l.getPrice());

	}
}

class Laptop {
	int ram;
	private int price;

	public void setPrice(int price) {
		// is the user is an Admin
		boolean isAdmin = true;
		if (!isAdmin) {
			System.out.println("you can not set price");
		} else {
			this.price = price;
		}
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getPrice() {
		return price;
	}

}
