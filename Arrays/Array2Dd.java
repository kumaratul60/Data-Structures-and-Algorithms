package Arrays;

public class Array2Dd {
	public static void main(String[] args) {
		int[][] a = {
			                {5,6,8,},
			                {8,9,4},
			                {7,2,3}
		                   };
		//  for(int i=0;i<a.length;i++)
			  for(int i=0;i<3;i++)

		  {
			  for(int j=0;j<a.length;j++)
				  System.out.print(a[i][j] + " ");
		  System.out.println();
		}
	}
}

