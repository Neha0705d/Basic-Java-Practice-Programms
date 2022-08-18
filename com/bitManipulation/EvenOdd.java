package com.bitManipulation;

public class EvenOdd {

	    public static void main(String args[]) {
	     
	        System.out.println("Checking if a number is even or odd using division and bitwise operator");
	        for(int i= -1; i<2; i++){
	            isEvenOrOdd(i); //for division operator method
	            isOddOrEven(i); //for Bitwise AND operator
	        }       
	       
	    }   
	       
	    /*
	     * checking even and odd number using division operator.
	     */
	    public static void isEvenOrOdd(int number){
	        int quotient = number/2;
	       
	        if(quotient*2== number)
	             {
	               System.out.println("Using division operator: "  + number + " is Even number");
	             }
	        else
		        {
		            System.out.println("Using division operator: "  + number  + " is Odd number");
		        }
	    }
	   
	    // using bitwise AND (&) operator to check if a number is even or odd in Java
	     
	    public static void isOddOrEven(int number){
	        if((number & 1) == 0){
	            System.out.println("Using bitwise operator: "  + number  + " is Even number");
	        }else{
	            System.out.println("Using bitwise operator: "  + number  + " is Odd number");
	        }
	    }  
	  
}
