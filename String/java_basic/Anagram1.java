package String.java_basic;

public class Anagram1 {
	public static void main(String[] args) {
		String a = "silent";
		String b = "listen";
		
		 boolean isAnagram = true;
	
	  /*  	 
     	 int a1[] = new int[256];
		 int b1[] = new int[256];
		 
		 for(char c:a.toCharArray())
		 {
			 int index = (int)c;
			 a1[index]++;
		 }
		 for(char c:b.toCharArray())
		 {
			 int index = (int)c;
			 b1[index]++;
		 }
		 for(int i=0;i<256;i++)
		 {
			 if(a1[i]!=b1[i])
		 */
	
		 int a1[] = new int[256];
		 for(char c:a.toCharArray())
		 {
			 int index = (int)c;
			 a1[index]++;
		 }
		 for(char c:b.toCharArray())
		 {
			 int index = (int)c;
			 a1[index]--;
		 }
		 for(int i=0;i<256;i++)
		 {
			 if(a1[i]!=0)	 
			 {
				 isAnagram = false;
				 break;
			 }
		 }
		 if(isAnagram)
			 System.out.println("Anagram");
		 else
			 System.out.println("not anagram");
			 }
		 }
		 
