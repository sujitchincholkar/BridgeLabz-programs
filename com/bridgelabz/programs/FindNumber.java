package com.bridgelabz.programs;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class FindNumber {
	
	public static void main(String[] args) {
	int N=Integer.parseInt(args[0]);
	System.out.println("Think  number between 0 to "+(N-1));
	Utility.findNumber(0, N-1);
	}
	
}
