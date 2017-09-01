package com.bridgelabz.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FileSearch {
	public static void main(String args[]) {
		String words[]={},search;
		Scanner sc;
		words =Utility.readFile("/home/bridgeit/Documents/myfile");
		System.out.println("Enter word to search");
		sc=new Scanner(System.in);
		search=sc.next().trim();
		Utility.bubbleSort(words);
		if(Utility.binarySearch(words, search)){
			System.out.println("The Word is present");
		}else {
			System.out.println("The Word is not present");
		}
		sc.close();
	}
}
