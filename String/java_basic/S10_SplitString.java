package String.java_basic;

public class S10_SplitString {
public static void main(String[] args) {
	String s = "Atul-Kumar,Awasthi";
	String name1[] = s.split("-");

	//String name[] = s.split(",");
//	System.out.println(name[1]);
	
//	for(String str : name1)
//		System.out.println(str);
	for(String str : name1)
		System.out.println(str);
	
}

}
