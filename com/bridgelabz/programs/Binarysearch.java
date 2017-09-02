package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Binarysearch {

	public static void main(String[] args) {
		Integer arr[] = { 3, 4, 6, 11, 15, 38 };
		String strArray[] = { "abcd", "high", "new", "xyz" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to search");
		int num = sc.nextInt();
		long start=System.currentTimeMillis();
		if (Utility.binarySearch(arr, num)) {
			System.out.println("Number is present");
		} else {
			System.out.println("Number is not present");
		}
		System.out.println("Time ="+Utility.elapsedTime(start));
		System.out.println("Enter String to search");
		String str = sc.next();
		start=System.currentTimeMillis();
		if (Utility.binarySearch(strArray, str)) {
			System.out.println("String  is present");
		} else {
			System.out.println("String is not present");
		}
		System.out.println("Time ="+Utility.elapsedTime(start));
	}

}
