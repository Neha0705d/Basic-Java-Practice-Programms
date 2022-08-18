package com.string;

import java.util.Scanner;

public class Palindrome {

	public static boolean isStringPalindrom(String text)
	{ 
		String reverse = reverse(text); 
		if(text.equals(reverse))
		{ 
			return true; 
		} 
		return false; 
	}

	public static String reverse(String input)
	{
		if(input == null || input.isEmpty())
		{
			return input; 
		} 
		return input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1)); 
		
	}


	
	public static void main(String[] args) {

		Palindrome pl = new Palindrome();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the string : ");
		String input = sc.nextLine();
		
		System.out.println(pl.isStringPalindrom(input));
	}

}
