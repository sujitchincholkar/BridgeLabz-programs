package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {
		int day=Integer.parseInt(args[0]);
		int month=Integer.parseInt(args[1]);
		int year=Integer.parseInt(args[2]);
		System.out.println(Utility.dayOfWeek(day, month, year));
	}

}
