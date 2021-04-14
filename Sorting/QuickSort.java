package Sorting;

public class QuickSort {
	public static void main(String[] args) {
		
		int a[] = {48,36,13,52,19,94,24};
		int length = a.length;
		
//		QuickSort qs = new QuickSort();
//		qs.quickRec(a,0,length-1);
//		qs.printArr(a);
		
		quickRec(a,0,length-1);
		printArr(a);
		
	}
	
	static int partition(int a[],int low,int high)
	{
		int pivot = a[low+(high-low)/2];
		
		while (low<=high) 
		{
			while(a[low]<pivot)
				low++;
			while(a[high]>pivot)
				high--;
			
			if(low<high)
			{
				int temp = a[low];
				a[low] = a[high];
				a[high] = temp;
				
				low++;
				high--;
			}
		}
		return low;
	}
	static void quickRec(int a[],int low,int high)
	{
		// Base case or terminating case
	    if (low >= high) {
	        return;
	    }
	    // Returns pivotIndex
		int pi = partition(a,low,high);
		
        // Recursively call quick sort with left part of the partitioned array
		if(low<pi-1)
			quickRec(a,low,pi-1);
		
        // Recursively call quick sort with right part of the partitioned array
		if(pi<high)
			quickRec(a,pi,high);
	}
	static void printArr(int a[])
	{
		for(int i:a)
			System.out.print(i+",");
	}
	
}
