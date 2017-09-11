package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Calender {

	public static void main(String[] args) {
		int month=Integer.parseInt(args[0]);
		int year=Integer.parseInt(args[1]);
		String days[][]=new String[7][7];
		Utility.fillArray(days,month,year);
		Utility.printCalender(days,month,year);
	}
	
}
