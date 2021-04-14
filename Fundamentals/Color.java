package Fundamentals;

//A Java program to demonstrate that we can have 
//main() inside enum class. 
enum Color {
	RED, GREEN, BLUE;

	// Driver method
	public static void main(String[] args) {
		Color c1 = Color.RED;
		System.out.println(c1);
	}

}
