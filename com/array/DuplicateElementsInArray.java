package com.array;

import java.util.Arrays;
import java.util.logging.Logger;

public class DuplicateElementsInArray {

	// Need to ask
  //  private static final Logger logger = LoggerFactory.getLogger(DuplicateElementsInArray.class);
	
    public static int[] removeDuplicateElements(int[] numbersarray) {
     
        Arrays.sort(numbersarray);     
      
        int[] result = new int[numbersarray.length]; // need to ask
        int previous = numbersarray[0];
        result[0] = previous;

        for (int i = 1; i < numbersarray.length; i++) {
            int ch = numbersarray[i];

            if (previous != ch) 
            {
                result[i] = ch;
            }
            previous = ch;
        }
        return result;

    }
    
    public static void main(String[] args) {

    	DuplicateElementsInArray de= new DuplicateElementsInArray();
    	int[][] test = new int[][]
    		{
	            {1, 1, 2, 2, 3, 4, 5},
	            {1, 1, 3, 6, 4, 3, 7},
            };
            
            for (int[] input : test) 
            {
                System.out.println("Original Array  : " + Arrays.toString(input));
                System.out.println("Array after removing duplicate elements  : " + Arrays.toString(removeDuplicateElements(input)));
            }

    }
}
