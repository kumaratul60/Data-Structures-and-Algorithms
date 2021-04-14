package Arrays;

public class MaxSumArray {
      public static void main(String[] args) {
    	  
    	  int a[] = {-1,-3,4,5,7,-7};
    	  int n = a.length;
    	  
    	  int sum[] = new int[n];
    	  sum[0] = a[0];
    	  for(int i=1;i<n;i++)
    		  sum[i] = sum[i-1] + a[i];
    	  
    	  int max = Integer.MIN_VALUE;
           // int min = Integer.MAX_VALUE;
    	  for(int i=0;i<n;i++)
    	  {
    		  for(int j=i;j<n;j++)
    		  {
    			  
//    			  int cursum = 0;
//    			  for(int k=i;k<=j;k++)
//    				  cursum +=a[k];
    			  
    			  int cursum = sum[j] - sum[i] + a[i];
    			  if(cursum>max)
    				  max = cursum;
    		  }
    	  }
    	 // System.out.println(min);
    	  System.out.println(max);
    	 
    	  
//*******************************************************************************
    	  
   //  ********************** Kaden's Algo*************************
    	  
    /*	  int b[] = {-1,-3,4,5,7,-7};
    	  int x = b.length;
    	  
    	  int maxSum = Integer.MIN_VALUE;
    	  int curSum = 0;

    	  for(int i=0;i<x;i++)
    	  curSum += b[i];
    	  if(curSum>maxSum) 
    		  maxSum =curSum;
    	  if(curSum<0) 
    		  curSum = 0;
    	  System.out.println(maxSum);

		*/
	}
}
