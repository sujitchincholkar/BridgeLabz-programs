package com.bridgelabz.programs;

import com.bridgelabz.utility.Utility;

public class AnagramStack {

	public static void main(String[] args) {
		Stack<String> anagram=new Stack<String>();
		String primeArray[][]=Utility.primeAnagramInRange();
		for(int i=0;i<primeArray.length;i++){
			for(int j=0;j<primeArray[i].length;j++){
				if(primeArray[i][j]!=null)
				anagram.push(primeArray[i][j]);
			}
		}
		while(anagram.size()!=0){
			System.out.println(anagram.pop());
		}
	}

}
