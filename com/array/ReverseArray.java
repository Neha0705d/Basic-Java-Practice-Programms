package com.array;

import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;


public class ReverseArray {

	public static void main(String[] args) {

		int iArray[]= {10, 20, 30, 40, 50};
		String sArray[]= {"ten", "twenty", "thirty", "fourty", "fifty"};
		
		System.out.println("Int Array to be Reverse :" + Arrays.toString(iArray));
		ArrayUtils.reverse(iArray);
		System.out.println("Reversed Array :" + Arrays.toString(iArray));
		
		System.out.println("String Array to be Reverse :" + Arrays.toString(sArray));
		ArrayUtils.reverse(iArray);
		System.out.println("Reversed Array :" + Arrays.toString(sArray));
		
		
	}

}
