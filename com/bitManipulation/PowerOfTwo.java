package com.bitManipulation;

public class PowerOfTwo {

	private static boolean powerOfTwo(int number){
		/*
		 * int power = 1; 
		 * while(number >= power)
		 * {
		 *  if(number == power)
			 *  { 
			 *  return true; 
			 *  }
			* power = power*2; 
			 * } 
		 * return false;
		 */
		  if(number <0){
	            throw new IllegalArgumentException("number: " + number);
	        }
	        if ((number & -number) == number) {
	            return true;
	        }
	        return false;
    }
	public static void main(String[] args) {

		 int[] numbers = {0,1,2,6,8};
	      
	        for(int num: numbers)
	        {
	            System.out.println( " Is " + num + " power of two ? : " 
	              + powerOfTwo(num));
	        }
	}

}
