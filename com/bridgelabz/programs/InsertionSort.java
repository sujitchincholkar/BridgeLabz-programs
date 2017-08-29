package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array of 5 numbers");
		for(int i=0;i<5;i++){
			arr[i]=sc.nextInt();
		}
		Utility.insertionSort(arr);
        for(int e:arr){
        	System.out.println(e);
        }
		String strArr[]={"xyz","abc","pqr"};
		Utility.insertionSort(strArr);
        for(String e:strArr){
        	System.out.println(e);
        }
	}

}
