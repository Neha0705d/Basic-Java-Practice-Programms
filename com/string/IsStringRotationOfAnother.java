package com.string;

import java.util.Scanner;

public class IsStringRotationOfAnother {

	public static void main(String[] args) throws Exception {

		 Scanner scnr = new Scanner(System.in);
		    System.out.println("Please enter original String");
		    String input = scnr.nextLine();

		    System.out.println("Please enter rotation of String");
		    String rotation = scnr.nextLine();

		    if ( checkRotatation(input, rotation)) {
		      System.out.println(input + " and " + rotation
		          + " are rotation of each other");
		    } 
		    else {
		      System.out.println("The given Strings are not rotation of another");
		    }

		    scnr.close();
		  }

		  public static boolean checkRotatation(String original, String rotation) {
		    if (original.length() != rotation.length()) {
		      return false;
		    }

		    String concatenated = original + original; // need to understand

		    if (concatenated.indexOf(rotation) != -1) {
		      return true;
		    }

		    return false;
		  }
}
