package JavaTrickyQues;

public class Q2 {

	public static void main(String[] args) {
		B b = new B();

		System.out.println(b.i);
	}

}

class m {
	static int i = 1111;

	static {
		i = i-- - --i;
	}

	{
		i = i++ + ++i;
	}
}

class B extends m {
	static {
		i = --i - i--;
	}

	{
		i = ++i + i++;
	}
}
