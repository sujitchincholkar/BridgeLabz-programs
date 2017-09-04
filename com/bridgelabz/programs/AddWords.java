package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class AddWords {

	public static void main(String[] args) {
		String filePath="/home/bridgeit/Documents/myfile";
		String words[]=Utility.readFile(filePath);
		UnorderedList<String> linklist=new UnorderedList<>();
		for(int i=0;i<words.length;i++){
			linklist.add(words[i]);
		}
		linklist.printList();
		System.out.println("");
		Scanner sc=new Scanner(System.in);
		String search=sc.next();
		
		
		if(linklist.search(search)){
			System.out.println("Word is already present in linked list");
		}else {
			Utility.appendFile(search,filePath);
			System.out.println("Word Added");
		}
		
		
	}

}
