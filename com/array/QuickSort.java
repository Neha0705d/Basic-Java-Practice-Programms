package com.array;
// Program for sorting an array elements using QuickSort
import java.util.Arrays;

public class QuickSort {
	
	private int input[];
	private int length;
	public void sort(int[] numbers)
	{
	
		if(numbers == null || numbers.length==0)
		{
			return;
		}
		this.input =numbers;
		length = numbers.length;
		quicksort(0, length - 1);
		
	}

	private void quicksort(int low, int high) {

		int i=low;
		int j=high;
		
		int pivot= input[low + (high - low)/2];
		
		while(i <= j)
		{
			while( input[i]< pivot )
			{
				i++;
			}
			while( input[j]> pivot )
			{
				j--;
			}
			
			if(i <= j)
			{
				swap(i,j);
				i++;
				j--;
				
			}
		}
		if(low < j)
		{
			quicksort(low, j);
		}
		if(i < high)
		{
			quicksort(i, high);
		}
	}

	private void swap(int i, int j) {

		int temp = input[i];
		input[i] = input[j];
		input[j] = temp;
	}

	public static void main(String[] args) {

		int[] unsorted = {5, 2, 8, 4, 9, 7, 1, 3};
		
        System.out.println("Unsorted array :" + Arrays.toString(unsorted));

        QuickSort algorithm = new QuickSort();
        algorithm.sort(unsorted);
        
        System.out.println("Sorted array :" + Arrays.toString(unsorted));

	}

}
