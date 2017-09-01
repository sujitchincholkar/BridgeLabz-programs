package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		
		int arr[] = new int[10];
		String str[] = { "xyz", "abc", "high", "low" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array of 10 elements");
		for (int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
		}
		long start=System.currentTimeMillis();
		Utility.bubbleSort(str);
		Utility.bubbleSort(arr);
		System.out.println("Time ="+Utility.elapsedTime(start));
		System.out.println("Sorted Array");
		for (int i : arr) {
			System.out.println(i);
		}
		for (String i : str) {
			System.out.println(i);
		}
		sc.close();
	}

}
