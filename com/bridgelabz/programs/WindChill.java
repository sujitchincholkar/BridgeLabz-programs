package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class WindChill {

	public static void main(String[] args) {
		double temprature = Double.parseDouble(args[0]);
		double windspeed = Double.parseDouble(args[1]);
		System.out.println(Utility.getWindChill(temprature, windspeed));
	}

}
