package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class TwoDArray {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter what type of array you want \n1.Integer \n2.Double \n3.Boolean");
		int choice =sc.nextInt();
		System.out.println("Enter number of rows and columns");
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		switch(choice){
			case 1:
			int array[][]=new int[rows][cols];
			Utility.getArray(array, rows, cols);
			break;
			case 2:
			double arrayDouble[][]=new double[rows][cols];
			Utility.getArray(arrayDouble, rows, cols);
			break;
			case 3:
			boolean arrayBool[][]=new boolean[rows][cols];
			Utility.getArray(arrayBool, rows, cols);
			break;
			default:
			System.out.println("Invalid Choice");
			break; 
		}
		
		
	}

}
