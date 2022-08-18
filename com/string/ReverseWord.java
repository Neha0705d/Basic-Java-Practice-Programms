package com.string;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWord {

		public static String reverseWords(String sentence) 
		{
			List< String> words = Arrays.asList(sentence.split("\\s")); 
			Collections.reverse(words);
			StringBuilder sb = new StringBuilder(sentence.length());
			for (int i = words.size() - 1; i >= 0; i--) 
			{
				sb.append(words.get(i)); sb.append(' '); 
				
			}
			return sb.toString().trim(); 
			
		}
		public static String reverseString(String line)
		{
			if (line.trim().isEmpty()) 
			{
				return line; 
		
			}
			StringBuilder reverse = new StringBuilder();
			String[] sa = line.trim().split("\\s"); 
			for (int i = sa.length - 1; i >= 0; i--) 
			{
				reverse.append(sa[i]); 
				reverse.append(' ');
				
			}
			return reverse.toString().trim();
		}

		public static void main(String[] args) 
		{
			ReverseWord rw=new ReverseWord();
			
			System.out.println(rw.reverseString("What is your Name ?"));
			
			System.out.println(rw.reverseWords("Neha")); //issue
		
		}	

		
}
