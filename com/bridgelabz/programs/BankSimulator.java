package com.bridgelabz.programs;

import java.util.Scanner;

public class BankSimulator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		int cash=0;
		while(choice!=3 && cash>=0){
			System.out.println("Enter your choice \n1.Deposite \n2.Withdraw \n3.Quit");
			choice=sc.nextInt();
			switch(choice){
			case 1:
				deposite(cash);
				break;
			case 2:
				withdraw(cash);
				break;
			case 3:
				continue;
			}
		}
		
	}
	private static void withdraw(int cash) {
		
		
	}
	private static void deposite(int cash){
		
	}

}
