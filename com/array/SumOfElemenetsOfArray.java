package com.array;

import java.util.Arrays;

public class SumOfElemenetsOfArray {

	 public static void findPairs(int[] array, int sum) {

	        for (int i = 0; i < array.length; i++) {
	            int first = array[i];
	            for (int j = i + 1; j < array.length; j++) {
	                int second = array[j];

	                if ((first + second) == sum) {
	                    System.out.printf("(%d, %d) %n", first, second);
	                }
	            }

	        }
	    }
	
	public static void main(String[] args) {

		SumOfElemenetsOfArray sumOfElements = new SumOfElemenetsOfArray();
		 int[] numbers = { 2, 4, 3, 5, 7, 8, 9 };
	  	 System.out.println("Given Array Is : " + Arrays.toString(numbers)); 
         System.out.println("Pairs having sum are :");
         sumOfElements.findPairs(numbers, 9);
	  	 
		
	}

}
