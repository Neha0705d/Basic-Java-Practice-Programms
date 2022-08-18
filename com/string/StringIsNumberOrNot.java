package com.string;
import java.util.regex.Pattern;


public class StringIsNumberOrNot {
	 
	    public static void main(String args[]) {
	     
	       
	       Pattern pattern = Pattern.compile(".*[^0-9].*");// Need to ask
	     
	       String [] inputs = {"267", "-534" , "545.46", "abcd889"};
	     
	       for(String input: inputs)
		       {
		           System.out.println( input + " is number : "+ !pattern.matcher(input).matches());
		       }
	     
		   Pattern digitPattern = Pattern.compile("\\d{6}");       
	        
	       for(String number: inputs)
		       {
		           System.out.println(  number + " is 6 digit number :" + digitPattern.matcher(number).matches());
		       }
	    }
	 
	}

