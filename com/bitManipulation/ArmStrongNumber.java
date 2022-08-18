package com.bitManipulation;

import java.util.Scanner;

public class ArmStrongNumber {

	private static boolean isArmStrong(int number) 
	{ 
		int result = 0; 
		int original = number; 
		while(number != 0)
		{
			int remainder = number%10; //3
			result = result + remainder*remainder*remainder; //27
			number = number/10; //15
			} 
		//If number is Armstrong return true 
		if(original == result)
			{
				return true; 
			} 
		 return false; 
		}

	public static void main(String[] args) {

		System.out.println("Please enter a 3 digit number to find its an Armstrong number or not :"); 
		int number = new Scanner(System.in).nextInt(); 
		
		//printing result 
		if(isArmStrong(number))
			{
				System.out.println("Number : " + number + " is an Armstrong number"); 
			}
		else
			{
				System.out.println("Number : " + number + " is not an Armstrong number"); 
			}
	}

}
