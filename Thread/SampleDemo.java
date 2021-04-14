package Thread;

public class SampleDemo implements Runnable {
	private Thread t;
	private String thredName;

	SampleDemo(String threadName) {
		this.thredName = threadName;

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true)
			System.out.println((thredName));
	}

	public void start() {
		if (t == null) {
			t = new Thread(this, thredName);
			t.start();
		}

	}

}
