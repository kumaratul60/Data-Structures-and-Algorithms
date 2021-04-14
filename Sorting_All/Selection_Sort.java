package Sorting_All;

import java.util.Arrays;

//Worst case Complexity : O(n^2)
//Best case Complexity: O(n^2)
//Average Case Complexity: O(n^2)
//Worst case space Complexity: O(1)

public class Selection_Sort {

	public static void main(String[] args) {
		
	}
	public void selectionSort(int[] inputArray){
        System.out.println("Input array " + Arrays.toString(inputArray));
        for(int i = 0; i < inputArray.length - 1; i++){
            int min = i;
            for(int j = i + 1; j < inputArray.length; j++){
                if(inputArray[j] < inputArray[min]){
                    min = j;
                }
                int temp = inputArray[min];
                inputArray[min] = inputArray[i];
                inputArray[i] = temp;
            }
        }
        System.out.println("Sorted array " + Arrays.toString(inputArray));
	}

}
