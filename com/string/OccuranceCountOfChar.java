package com.string;

import java.util.Scanner;

public class OccuranceCountOfChar {

	public static void main(String[] args) {

		System.out.println("Enter the String :");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		//String str = "My Name Is Neha";
		
		int count =0;
		for(char ch: str.toCharArray())
		{
			if(ch=='a')
			{
				count++;
			}
		}
		System.out.println("Occurance of 'a' in " + str +" is : " + count);
	}

}
