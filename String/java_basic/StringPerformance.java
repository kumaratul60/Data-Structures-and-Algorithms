package String.java_basic;

public class StringPerformance {
public static void main(String[] args) {
	long stratTime = System.currentTimeMillis();
	for(int i=0;i<100000;i++)
	{
		String s = "Atul";
		//String s1 = "Atul";

	}
	long endTime = System.currentTimeMillis();
	System.out.println("Time taking by Literal = "+(endTime-stratTime)+"ms");
	long startTime = System.currentTimeMillis();
	for(int i=0;i<100000;i++)
	{
		String str = new String("Atul");
	//	String str1 = new String("Atul");

	}
	long endTime1 = System.currentTimeMillis();
	System.out.println("Time taking by Object = "+(endTime1-stratTime)+"ms");
	}
}

