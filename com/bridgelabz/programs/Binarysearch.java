package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Binarysearch {

	public static void main(String[] args) {
	  int arr[]={3,4,6,11,15,38};
	  String strArray[]={"Abcd","high","new","xyz"};
	  Scanner sc=new Scanner(System.in);
	  
	  int num=sc.nextInt();
	  String str=sc.next();
	  if(Utility.binarySearch(arr, num)){
		System.out.println("Number is present");  
	  } else {
		  System.out.println("Number is not present");
	  }
	  if(Utility.binarySearch(strArray, str)){
			System.out.println("String  is present");  
		  } else {
			  System.out.println("String is not present");
		  }
	  
      
	}

}
