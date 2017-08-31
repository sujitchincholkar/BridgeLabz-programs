package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String strArr[]=new String[5];
		for(int i=0;i<5;i++){
			strArr[i]=sc.next();
		}
		strArr=Utility.mergeSort(strArr);
		for(String str:strArr){
			System.out.println(str);
		}
	}

}
