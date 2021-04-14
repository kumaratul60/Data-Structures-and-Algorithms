package Sorting;

public class MergeSort {
	
	int[] array;
	int tempMergeArr[];
	int length;
	
	public static void main(String[] args) {
	
		int[] inputArr = {48,36,13,52,19,94,24};
		
		MergeSort ms = new MergeSort();
		ms.sort(inputArr);
		
		for(int i : inputArr)
			System.out.print(i+",");
	}
	
		public void sort(int inputArr[])
		{
			this.array = inputArr;
			this.length = inputArr.length;
			this.tempMergeArr = new int[length];
			
			 divideArr(0,length-1);
		}
		public void divideArr(int lowerIndex,int higherIndex)
		{
			if(lowerIndex<higherIndex)
			{
				int middle = lowerIndex+(higherIndex-lowerIndex)/2;
				
				divideArr(lowerIndex,middle);   // Left array;
				divideArr(middle+1,higherIndex); // Right array;
				
				MergeArr(lowerIndex,middle,higherIndex);
			}
		}
		public void MergeArr(int lowerIndex,int middle, int higherIndex)
		{
			for(int i=lowerIndex;i<=higherIndex;i++)
				tempMergeArr[i] = array[i];
			
			int i =lowerIndex;
			int j = middle+1;
			int k =lowerIndex;
			
			while(i<=middle && j<=higherIndex)
			{
				if(tempMergeArr[i]<=tempMergeArr[j])
				{
					array[k] = tempMergeArr[i];
					i++;
				}
				else
				{
					array[k] = tempMergeArr[j];
					j++;
				}
				k++;
			}
			while(i<=middle)
			{
				array[k]=tempMergeArr[i];
				k++;
				i++;
			}
		}
}
					

