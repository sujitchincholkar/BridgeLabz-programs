package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]=new int[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter array of 10 elements");
        for(int i=0;i<10;i++){
        	arr[i]=sc.nextInt();
        }
        Utility.bubbleSort(arr);
        System.out.println("Sorted Array");
        for(int i:arr){
        	System.out.println(i);
        }
	}

}
