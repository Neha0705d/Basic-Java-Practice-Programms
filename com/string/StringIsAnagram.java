package com.string;

import java.util.Scanner;

public class StringIsAnagram {

	public  boolean stringIsAnagramOrNot(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			return false;
		}
		
		char[] chars=str1.toCharArray();
		for(char c: chars)
		{
			int index = str2.indexOf(c);
			if(index != -1)
			{
				str2 = str2.substring(0,index)+ str2.substring(index +1, str2.length()) ;
			}
			else
			{
				return false;
			}
		}
		return str2.isEmpty();
	}


	public static void main(String[] args) {
		
		StringIsAnagram ana = new StringIsAnagram();
		//System.out.println(ana.stringIsAnagramOrNot("secure", "rescue"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the string1 : ");
		String input1 = sc.nextLine();
		
		System.out.println(" Enter the string2 : ");
		String input2 = sc.nextLine();
		
		System.out.println(ana.stringIsAnagramOrNot(input1, input2));
		
	}
}