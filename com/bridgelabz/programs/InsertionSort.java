package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		Integer arr[]=new Integer[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array of 5 numbers");
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		Utility.insertionSort(arr);
        for(int e:arr){
        	System.out.println(e);
        }
		String strArr[]=new String[5];
		System.out.println("Enter array of 5 words");
		for(int i=0;i<5;i++){
			strArr[i]=sc.next();
			
		}
		Utility.insertionSort(strArr);
        for(String e:strArr){
        	System.out.println(e);
        }
	}

}
