package com.bitManipulation;

import java.util.Scanner;

import com.string.Palindrome;

public class NumberIsPalindrome {

	private static boolean isPalindrome(int number) {
        if(number == reverse(number)){
            return true;
        }
        return false;
    }
 
     
    private static int reverse(int number){
        int reverse = 0;
     
        while(number != 0){
          reverse = reverse*10 + number%10;
          number = number/10;
        }
             
        return reverse;
    }
	public static void main(String[] args) {

		NumberIsPalindrome pl = new NumberIsPalindrome();
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the number : ");
		int number = sc.nextInt();
		
		System.out.println(number + " is Palindrome "+pl.isPalindrome(number));
	}

}
