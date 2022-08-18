package com.array;

import java.util.Scanner;

public class TransposeTheMatrix {

	class Matrix 
	{ 
		private int rows; 
		private int columns; 
		private int[][] data; 
		
		public Matrix(int row, int column) 
		{ 
			this.rows = row; 
			this.columns = column; 
			data = new int[rows][columns]; 
		} 
		public Matrix(int[][] data) 
		{ 
			this.data = data; 
			this.rows = data.length; 
			this.columns = data[0].length; 
			} 
		public int getRows()
		{ 
			return rows; 
		} 
		public int getColumns() 
		{ 
			return columns;
		}
		 public void read(Scanner s) 
		 {
			 for (int i = 0; i < rows; i++) 
			 {
				 for (int j = 0; j < columns; j++) 
				 { 
					 data[i][j] = s.nextInt(); 
				 } 
			  } 
		  }
		 public void transpose() 
		 {
			 int[][] temp = new int[columns][rows]; 
			 for (int i = 0; i < rows; i++) 
			 {
				 for (int j = 0; j < columns; j++) 
				 {
					 temp[j][i] = data[i][j]; 
				 } 
			  } 
			 data = temp; 
			 }
		 public void print() 
		 { 
			 for (int i = 0; i < rows; i++) 
			 {
				 for (int j = 0; j < columns; j++) 
				 {
					 System.out.print(data[i][j] + " "); 
				 }
				 System.out.println(); 
			 }
		  }
	}

	public static void main(String[] args) {

		TransposeTheMatrix transpose = new TransposeTheMatrix();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter matrix details"); 
		System.out.print("Please Enter number of rows : "); 
		int row1 = sc.nextInt(); 
		System.out.print("Please Enter number of columns : "); 
		int column1 = sc.nextInt(); 
		System.out.println(); 
		System.out.println("Enter first matrix elements"); 
		
		Matrix matrix = transpose.new Matrix(row1, column1);
		
		matrix.read(sc); 
		System.out.println("original matrix: "); 
		matrix.print();
		matrix.transpose(); 
		
		System.out.println("transpose of the matrix is "); 
		matrix.print(); 
		sc.close();

	}

}
