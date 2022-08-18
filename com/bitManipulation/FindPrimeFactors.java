package com.bitManipulation;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindPrimeFactors {

	 public static Set<Integer> primeFactors(long number) {
	        Set<Integer> primefactors = new HashSet<>();
	        long copyOfInput = number;

	        for (int i = 2; i <= copyOfInput; i++) {
	            if (copyOfInput % i == 0) {
	                primefactors.add(i); // prime factor
	                copyOfInput /= i;
	                i--;
	            }
	        }
	        return primefactors;
	    }
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number : ");
		int num = sc.nextInt();
		
		System.out.println("Prime Factors are "+ primeFactors(num) );
	}

}
