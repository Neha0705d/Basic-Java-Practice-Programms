package com.bitManipulation;

import java.util.Scanner;

public class LeapYear {

	 public static boolean doesLeapYear(int year)
	   {
	       return (year%400 == 0) || ((year%100) != 0 && (year%4 == 0));
	   }

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the Year : ");
		int year = sc.nextInt();
		
		System.out.println(year + " Is leap year :" + doesLeapYear(year));
	}

}
