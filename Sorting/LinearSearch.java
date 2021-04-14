package Sorting;

public class LinearSearch {
	public static void main(String[] args) {
		 int a[] = {5,3,6,1,5,8,2,0};
		int item = 5;
		int temp = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==item)
			{
				System.out.println("congreats element position : "+i);
				temp = temp+1;
			}
		}
		if(temp==0)
			System.out.println("item not found");
			
		
//****************String Sort****************************
		
	String s[] = {"Atul","Deepesh","Ashu","Jacky"};
	String s1 = "Jacky";
	int tump = 0;
	for(int i=0;i<s.length;i++)
	{
		if(s[i].equals(s1))
		{
			System.out.println("congreats String position : "+i);
			tump++;
			
		}
	}
	if(tump==0)
		System.out.println("String not found");
		
	} 

}
