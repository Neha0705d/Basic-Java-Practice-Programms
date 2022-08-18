package com.string;

import java.util.Scanner;

public class CountVowelsInString {

	public static void main(String[] args) {

		System.out.println(" Enter the string : ");
		Scanner sc1= new Scanner(System.in);
		
		String input= sc1.nextLine();
		char[] string = input.toCharArray();
		
		int count=0;
		
		for(char c : string)
		{
			switch(c)
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				count++;
		break;
		default:
			}
			
		}
		
		System.out.println("Number of Vowels in "+ input + " is : " + count);
	}

}
