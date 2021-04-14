package Sorting;

public class StringSort_Selection {
	public static void main(String[] args) {
		String s[] = {"Maria","Mole","jeff","picha","Bezos","A"};
		//int s[]= {5,6,2,8,9,3,5,2,0,1,7};
		for(int i=0;i<s.length;i++)
		{
			int min = i;
			for(int j=i+1;j<s.length;j++)
			{
				if(s[j].compareTo(s[min])<0)
				//if(s[j]<s[min])
					min=j;
			}
					String temp = s[i];
					s[i]=s[min];
					s[min]=temp;
		}
		for(String a : s)
			System.out.print(a+".");
			
		//******Bubble String sort**************
		
		System.out.println("\n************");
		
		for(int i=0;i<s.length;i++)
		{
			for(int j=0;j<s.length-1;j++)
			{
				if(s[j].compareTo(s[j+1])>0)
				{
					String temp = s[j+1];
					s[j+1] = s[j];
					s[j] = temp;
					
				}
					
			}
		}
		for(String S : s ) System.out.print(S+",");
	}

}
