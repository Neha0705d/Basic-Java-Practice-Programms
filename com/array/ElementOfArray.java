package com.array;

import java.util.Arrays;

public class ElementOfArray {

	public static void largestAndSmallestElement(int[] numbers) 
	{
		int largest = Integer.MIN_VALUE; 
		int smallest = Integer.MAX_VALUE; 
		for (int number : numbers) 
		{ 
			if (number > largest) 
			{
				largest = number; 
			} 
			else 
				if (number < smallest) 
				{
					smallest = number; 
				} 
		} 
		System.out.println("Given integer array : " + Arrays.toString(numbers)); 
		System.out.println("Largest number in array is : " + largest); 
		System.out.println("Smallest number in array is : " + smallest); 
		
	}
	
		public static void main(String[] args) {

			ElementOfArray elements = new ElementOfArray();
			
			elements.largestAndSmallestElement(new int[]{-2, 3, 11, -8, 9, 7}); 
					
	}


}
