package com.string;

import java.util.HashMap;


public class FirstNonRepeatedCharacter {

	public static char nonRepeatedChar(String str) {
	HashMap<Character,Integer> charcount = new HashMap<>(str.length());
	for(int i=0; i<str.length();i++)
		{
			char c = str.charAt(i);
				 if(charcount.containsKey(c))
				 {
					 charcount.put(c, charcount.get(c)+1);
				 }
				 else
				 {
					 charcount.put(c, 1);
				 }
		}
	for(int i=0; i<str.length();i++)
		{
			char c = str.charAt(i);
				if(charcount.get(c)==1)
					return c;
		}
	
		throw new RuntimeException("Undefined behaviour");
	}
	
	public static void main(String[] args)
	{
		FirstNonRepeatedCharacter nrch = new FirstNonRepeatedCharacter();
		System.out.println(nrch.nonRepeatedChar("aabbcdd"));
		System.out.println(nrch.nonRepeatedChar("aabbccddef"));
		
	}
	
}	

