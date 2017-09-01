package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class UnorderList {

	public static void main(String[] args) {
		String filePath="/home/bridgeit/Documents/myfile";
		String words[]=Utility.readFile(filePath);
		LinkedList<String> linklist=new LinkedList<>();
		for(int i=0;i<words.length;i++){
			linklist.add(words[i]);
		}
		linklist.link();
		
		Scanner sc=new Scanner(System.in);
		String search=sc.next();
		
		if(linklist.search(search)){
			System.out.println("Word is already present in linked list");
		}else {
			Utility.writeFile(search,filePath);
			System.out.println("Word Added");
		}
		
		
	}

}
