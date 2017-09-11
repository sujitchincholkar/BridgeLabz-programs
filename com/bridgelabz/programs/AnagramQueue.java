package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class AnagramQueue {

	public static void main(String[] args) {
		Queue<String> anagramQ=new Queue<String>();
		String primeArray[][]=Utility.primeAnagramInRange();
		for(int i=0;i<primeArray.length;i++){
			for(int j=0;j<primeArray.length;j++){
				if(primeArray[i][j]!=null)
				anagramQ.enqueue(primeArray[i][j]);
			}
		}
		while(anagramQ.size()!=0){
			System.out.println(anagramQ.dequeue());
			
		}
	}

}
