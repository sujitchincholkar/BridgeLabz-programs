package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class Binary {

	public static void main(String[] args) {
		int decNumber=Integer.parseInt(args[0]);
		String binaryString=Utility.toBinary(decNumber);
		String swappedNibbles=Utility.swappedNibbles(binaryString);
		System.out.println(binaryString);
		System.out.println("After swapping nibbles");
		System.out.println(swappedNibbles);
		int binaryNum=Utility.binaryToDecimal(swappedNibbles);
		System.out.println("Number into Decimal"+binaryNum);
		if(Utility.isPowerOfTwo(binaryNum)){
			System.out.println("Number is power of 2");
		} else {
			System.out.println("Number is not power of two");
		}
		
	}

}
