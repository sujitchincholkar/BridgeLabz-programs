package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class VendingMachine {


	public static void main(String[] args) {
		
		int change=Integer.parseInt(args[0]);
		int notes[]={1000,500,100,50,10,2,1};
		
		Utility.returnNotes(change,0);
		int noteCount[]=Utility.noteCounts;
		for(int i=0;i<notes.length;i++){
			if(noteCount[i]!=0)
			System.out.println(notes[i]+" "+noteCount[i]);
		}

	}

}
