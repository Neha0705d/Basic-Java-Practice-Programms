package com.bitManipulation;


import java.util.Scanner;

public class LargestPrimeFactor {


	 public static int primeFactors(long number) {
		 int i;
	        long copyOfInput = number;

	        for (i = 2; i<= copyOfInput; i++) {
	            if (copyOfInput % i == 0) {
	                copyOfInput /= i;
	                i--;
	            }
	        }
	        return i;
	    }
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number : ");
		int num = sc.nextInt();
		
		System.out.println("Prime Factors Of %d are "+ primeFactors(num) );
	}

}
