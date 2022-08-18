package com.array;

import java.util.Scanner;

public class AddAndSubstractTwoMatrices {

	public static int[][] read(Scanner s, int rows, int columns) 
	{ 
		int[][] result = new int[rows][columns];
		for (int i = 0; i < rows; i++) 
		{ 
			for (int j = 0; j < columns; j++) 
			{
				System.out.println("Enter value of [" + (i+1) + "][" + (j+1) +"]"); 
				result[i][j] = s.nextInt(); 
			} 
		} 
		return result; 
	 } 
	public static int[][] add(int[][] a, int[][] b) 
	{ 
		int rows = a.length; 
		int columns = a[0].length; 
		int[][] result = new int[rows][columns]; 
		
		for (int i = 0; i < rows; i++) 
		{ 
			for (int j = 0; j < columns; j++) 
			{
				result[i][j] = a[i][j] + b[i][j]; 
			} 
		} 
		return result; 
	}
	public static int[][] subtract(int[][] a, int[][] b) 
	{ 
		int rows = a.length; 
		int columns = a[0].length; 
		int[][] result = new int[rows][columns]; 
		
		for (int i = 0; i < rows; i++) 
		{ 
			for (int j = 0; j < columns; j++) 
			{ 
				result[i][j] = a[i][j] - b[i][j]; 
			} 
		} 
		return result; 
		}
	public  void printMatrix(int[][] matrix) 
	{ 
		int rows = matrix.length; 
		int columns = matrix[0].length; 
		
		for (int i = 0; i < rows; i++) 
		{ 
			for (int j = 0; j < columns; j++)
			{
				System.out.print(matrix[i][j] + " ");
			} 
			System.out.println(); 
		} 
	 }

	
	public static void main(String[] args) {

		AddAndSubstractTwoMatrices addnsub = new AddAndSubstractTwoMatrices();
		Scanner sc = new Scanner(System.in); 
		
		System.out.print("Please Enter number of rows: "); 
		int rows = sc.nextInt(); 
		
		System.out.print("Please Enter number of columns: "); 
		int columns = sc.nextInt(); System.out.println();
		
		System.out.println("Please Enter first matrix"); 
		int[][] a = read(sc, rows, columns); 
		System.out.println("Matrix A - from given Input is :");
		addnsub.printMatrix(a);
		
		System.out.println(); 
		
		System.out.println("Please Enter second matrix"); 
		int[][] b = read(sc, rows, columns); 
		System.out.println("Matrix B - from given Input is :");
		addnsub.printMatrix(b);
		
		
		int[][] sum = add(a, b); 
		int[][] difference1 = subtract(a, b); 
		
		System.out.println("The sum of two matrices is: ");
		addnsub.printMatrix(sum); 
		
		System.out.println("The differnece of two matrices is: "); 
		addnsub.printMatrix(difference1); 

		
		}

}
