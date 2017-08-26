package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class Anagram {

	public static void main(String[] args) {
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		str1=sc.next();
		str2=sc.next();
		if (Utility.isAnagram(str1, str2)) {
			System.out.println(str1 + " " + str2 + " are anagram");
		} else {
			System.out.println(str1 + " " + str2 + " are not an anagram");
		}

	}

}
