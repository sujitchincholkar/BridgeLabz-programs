package com.bridgelabz.programs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FileSearch {
	public static void main(String args[]) {
		String words[]={},search;
		Scanner sc;
		try {
			sc=new Scanner(new File("/home/bridgeit/Documents/myfile"));
			while(sc.hasNextLine()){
				words=sc.nextLine().split(",|\\s");
			}
			for(String s:words){
				System.out.println(s);
			}
				
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("Enter word to search");
		sc=new Scanner(System.in);
		search=sc.next().trim();
		Utility.bubbleSort(words);
		if(Utility.binarySearch(words, search)){
			System.out.println("Word is present");
		}else {
			System.out.println("Word is not present present");
		}
		sc.close();
	}
}
