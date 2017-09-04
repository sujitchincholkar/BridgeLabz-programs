package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Compare<Integer> arr[]=new Compare[5];
		Compare<String> arrStr[]=new Compare[5];
	
		for(int i=0;i<5;i++){
			arr[i]=new Compare();
			arr[i].value=sc.nextInt();
		}
		System.out.println("Enter String Array");
		for(int i=0;i<5;i++){
			arrStr[i]=new Compare();
			arrStr[i].value=sc.next();
		}
		arr=Utility.mergeSort(arr);
		arrStr=Utility.mergeSort(arrStr);
		for(int i=0;i<5;i++){
			System.out.println(arr[i].value);
		}
		for(int i=0;i<5;i++){
			System.out.println(arrStr[i].value);
		}
	}

}
