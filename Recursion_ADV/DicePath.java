package Recursion_ADV;

public class DicePath {

	public static void main(String[] args) throws InterruptedException {

		dicePath(4, 0, "");
		System.out.println("Total path = " + count);
		
		  long start = System.currentTimeMillis();;
		   // new MyApplication();
		  Thread.sleep(1);
		    long end = System.currentTimeMillis();;

		    System.out.println((end - start) + " ms");

//		long startTimeNanoSecond = System.nanoTime();
//		long startTimeMilliSecond = System.currentTimeMillis();
//
//		Thread.sleep(1);
//
//		long endTimeNanoSecond = System.nanoTime();
//		long endTimeMilliSecond = System.currentTimeMillis();
//
//		System.out.println("Executed In: " + (endTimeNanoSecond - startTimeNanoSecond) + " ns");
//		System.out.println("Executed In: " + (endTimeMilliSecond - startTimeMilliSecond) + " ms");
	}

	static int count = 0;

	static void dicePath(int n, int i, String s) {

		if (i >= n)
			return;
		if (i == n - 1) {
			count += 1;
			System.out.println(s);
			return;
		}
		for (int j = 1; j <= 6; j++) {
			dicePath(n, i + j, s + j + "->");
		}
	}

}
