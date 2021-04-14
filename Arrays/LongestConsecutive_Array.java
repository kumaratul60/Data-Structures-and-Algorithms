package Arrays;

import java.util.HashSet;

public class LongestConsecutive_Array {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		int a[] = {3,1,10,4,9,2,1,20};

		for(int i=0;i<a.length;i++)
	
			hs.add(a[i]);
	
			int long_length=0;
			for(int i=0;i<a.length;i++)
			{
				if(!hs.contains(a[i]-1))
				{
					int no = a[i];
					while(hs.contains(no))
						no++;
						if(long_length<no-a[i])
							long_length = no-a[i];
					}
				}
				System.out.print(long_length+",");
	}

}
