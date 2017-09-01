/***********************************************
 * purpose : To store all logic of the programs
 *           
 * @author  Sujit Chincholkar
 * @version 1.0
 * @since   24/08/2017          
 ***********************************************/
package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Utility {
	static Scanner sc = new Scanner(System.in);
	static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out),true);
	
	public static boolean isAnagram(String str1, String str2) {
		boolean isAnagram = true;
		char arr1[] = str1.toLowerCase().toCharArray();
		char arr2[] = str2.toLowerCase().toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if (arr1.length != arr2.length) {
			return false;
		} else {
			for (int i = 0; i < arr1.length; i++) {
				if (arr1[i] == arr2[i]) {
					isAnagram = true;
				} else {
					isAnagram = false;
					break;
				}

			}
		}
		return isAnagram;
	}

	public static boolean isPalindrome(String str) {
		char arr[] = str.toLowerCase().toCharArray();
		boolean isPalindrome = true;
		int j = arr.length - 1;
		for (int i = 0; i < arr.length; i++, j--) {
			if (arr[i] == arr[j]) {
				isPalindrome = true;
			} else {
				isPalindrome = false;
				return isPalindrome;
			}
		}
		return isPalindrome;

	}

	public static boolean isPrime(int number) {

		// condition to check if no less than two
		if (number < 2) {
			return false;
		}

		// for loop to for checking prime no
		for (int factor = 2; factor * factor <= number; factor++) {
			// if factor divides evenly into n, n is not prime, so break out of
			// loop
			if (number % factor == 0) {
				return false;

			}
		} // End of for loop
		return true;
	}

	public static void printPrimes() {
		int number = 0;
		for (number = 0; number <= 1000; number++) {
			if (isPrime(number)) {
				System.out.println(number);
			}
		}
	}

	public static void printPrimePalindrome() {
		for (int number = 2; number < 1000; number++) {
			if (isPrime(number)) {
				if (isPalindrome(Integer.toString(number))) {
					System.out.println(number);
				}
			}
		}
	}

	public static boolean binarySearch(int arr[], int num) {
		
		int low = 0;
		boolean isPresent = false;
		int high = arr.length - 1;
		int mid = high / 2;
		while (high >= low) {
			if (arr[mid] == num) {
				isPresent = true;
				break;
			} else if (arr[mid] > num) {
				high = mid - 1;
				mid = (low + high) / 2;
			} else if (arr[mid] < num) {
				low = mid + 1;
				mid = (low + high) / 2;
			}
		}
		return isPresent;
	}

	public static boolean binarySearch(String arr[], String str) {
		int low = 0;
		boolean isPresent = false;
		int high = arr.length - 1;
		int mid = high / 2;
		while (high >= low) {
			if (arr[mid].equalsIgnoreCase(str) ) {
				isPresent = true;
				break;
			} else if (arr[mid].compareToIgnoreCase(str) < 0) {
				low = mid + 1;
				mid = (low + high) / 2;
			} else if (arr[mid].compareToIgnoreCase(str) > 0) {
				high = mid - 1;
				mid = (low + high) / 2;
			}
		}	
		return isPresent;
	}

	public static void insertionSort(int arr[]) {
		
		for (int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		
	}
	
	public static void insertionSort(String arr[]) {
		
		for (int i = 1; i < arr.length; i++) {
			String key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j].compareToIgnoreCase(key)>0) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
		
	}

	public static void bubbleSort(int arr[]) {
		
		int temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public static void bubbleSort(String arr[]) {
		String temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static void printName(String name) {
		if (name.length() > 3) {
			System.out.println("Hello " + name + ",How are you?");
		} else {
			System.out.println("Inavalid Name");
		}
	}

	public static void flipCoin(int noOftimes) {
		int countHead = 0, countTail = 0;
		float percentH, percentT;
		for (int i = 0; i < noOftimes; i++) {
			if (Math.random() < 0.5) {
				System.out.println("Head");
				countHead++;
			} else {
				System.out.println("Tail");
				countTail++;
			}
		}
		// Calculating percentage
		percentH = (countHead * 100) / noOftimes;
		percentT = (countTail * 100) / noOftimes;
		System.out.println("Percentage of Tail=" + percentT
				+ "\nPercentage of Head=" + percentH);
	}

	public static boolean isLeapYear(int year) {
		boolean isLeapYear;
		// divisible by 4
		isLeapYear = (year % 4 == 0);
		// divisible by 4 and not by 100
		isLeapYear = isLeapYear && (year % 100) != 0;
		// divisible by 4 and 400
		isLeapYear = isLeapYear || (year % 400) == 0;
		return isLeapYear;

	}

	public static void printPowerOfTwo(int number) {
		double ans;
		for (int power = 0; power <= number; power++) {
			ans = Math.pow(2, power);
			System.out.println(power + " " + ans);
		}
	}

	public static double getHarmonicNumber(int number) {
		double hNumber = 0.0;
		for (float i = 1; i <= number; i++) {
			hNumber += (1 / i);
		}
		return hNumber;
	}

	public static void gamblerSimulator(int stake, int goal, int trials) {
		int bets = 0;
		int wins = 0;

		for (int t = 0; t < trials; t++) {
			int cash = stake;
			while (cash > 0 && cash < goal) {
				bets++;
				if (Math.random() < 0.5)
					cash++;
				else
					cash--;
			}
			if (cash == goal)
				wins++;
		}
		// print results
		System.out.println(wins + " wins out of " + bets);
		System.out.println("Percent of games won = " + 100.0 * wins / trials);

	}

	public static void generateCoupon(int nRandoms) {
		int randomCount = 1, randomNo, flag = 0, index = 1;
		int a[] = new int[nRandoms];
		a[0] = (int) (nRandoms * Math.random());
		while (index < nRandoms) {
			randomNo = (int) (Math.random() * nRandoms);
			randomCount++;
			for (int j = 0; j < index; j++) {
				if (a[j] == randomNo) {
					flag = 1;
				}
			}
			if (flag == 0) {
				a[index] = randomNo;
				index++;
			}
			flag = 0;
		}
		System.out.println(randomCount);
		for (int i : a) {
			System.out.println(i);
		}

	}

	public static void printPrimeFactors(int number) {
		for (int factor = 2; factor * factor <= number; factor++) {
			// if factor is a factor of n, repeatedly divide it out
			while (number % factor == 0) {
				System.out.print(factor + " ");
				number = number / factor;
			}
		}
		// if biggest factor occurs only once, n > 1
		if (number > 1)
			System.out.println(number);
		else
			System.out.println();
	}

	public static double getDistance(int xPoint, int yPoint) {
		double distance = Math.sqrt(Math.pow(xPoint, 2) + Math.pow(yPoint, 2));
		return distance;
	}

	public static void printQuadriaticRoots(int aValue, int bValue, int cValue) {
		double delta = bValue * bValue - 4 * aValue * cValue;
		if (delta > 0) {
			double sqroot = Math.sqrt(delta);
			double root1 = (-bValue + sqroot) / (2.0 * aValue);
			double root2 = (-bValue - sqroot) / (2.0 * aValue);

			System.out.println(root1);
			System.out.println(root2);
		} else {
			System.out.println("Roots are imaginary");
		}
	}

	public static double getWindChill(double temprature, double windspeed) {
		double windChill;
		windChill = 35.74 + 0.6215 * temprature + (0.4275 * temprature - 35.75)
				* Math.pow(windspeed, 0.16);
		return windChill;
	}

	public static void getArray(int arr[][], int rows, int cols) {
		System.out.println("Enter Array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		printArray(arr, rows, cols);

	}

	public static void getArray(double arr[][], int rows, int cols) {
		System.out.println("Enter Array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextDouble();
			}
		}
		printArray(arr, rows, cols);

	}

	public static void getArray(boolean arr[][], int rows, int cols) {
		System.out.println("Enter Array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				arr[i][j] = sc.nextBoolean();
			}
		}
		printArray(arr, rows, cols);

	}

	public static void printArray(int arr[][], int rows, int cols) {
		System.out.println("==Array==");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				out.print(arr[i][j]+" ");
			}
			out.println();
		}

	}

	public static void printArray(double arr[][], int rows, int cols) {

		if (arr.length > 0) {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					out.print(arr[i][j]+" ");
				}
				out.println();
			}
		}
	}

	public static void printArray(boolean arr[][], int rows, int cols) {

		if (arr.length > 0) {
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < cols; j++) {
					out.print(arr[i][j]+" ");
				}
				out.println();
			}
		}
	}

	public static void findDistinctTriplets(int array[]) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				for (int k = j + 1; k < array.length; k++) {
					if ((array[i] + array[j] + array[k]) == 0) {
						System.out.println(array[i] + " " + array[j] + " "
								+ array[k]);
						count++;
					}
				}
			}
		}
		System.out.println("The no. of such distinct tripletpairs are = "
				+ count);
	}
	
	public static void stopwatchSimulator(){
		long startTime=System.currentTimeMillis();
		for(int i=0;i<1000;i++){
			
		}
		long stopTime=System.currentTimeMillis();
		long Time=stopTime-startTime;
		System.out.println("Total time required"+Time);
	}
	
	public static String ticTacToe(){
		boolean userTurn=false;
		int gameArray[][]=new int[3][3];
		int row,cols;
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				gameArray[i][j]=-1;
			}
		}
		for(int k=0;k<9;k++){
			
			if(userTurn){
				userTurn(gameArray);  
				userTurn=false;
				printGameArray(gameArray);
				if(checkWin(gameArray,0)){
					return "You Won";
				}
					
				}else {
					System.out.println("Computer's Turn");
					 computerTurn(gameArray);
					 userTurn=true;
					 printGameArray(gameArray);
					 if(checkWin(gameArray,1)){
							return "Computer Won";
						}
					 
				}
				
				
			}
		
		return "Match Draw";
	}

	private static void printGameArray(int[][] gameArray) {
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(gameArray[i][j]==0){
					System.out.print("| X |");
				}else if(gameArray[i][j]==1){
					System.out.print("| O |");
				}else{
					System.out.print("|   |");
				}
			}
			System.out.println();
			System.out.println("===============");
		}
		
	}

	private static void computerTurn(int[][] gameArray) {
		
		Random random=new Random();
		int row= random.nextInt(3);
		int cols= random.nextInt(3);
		if(isValidTurn(gameArray,row,cols)){
			gameArray[row][cols]=1;
		} 
		else {
			computerTurn(gameArray);
		}
		
	}

	private static boolean checkWin(int[][] gameArray,int i) {
		for (int j = 0; j < 3; j++) {
			if (gameArray[j][0] == i && gameArray[j][1] == i && gameArray[j][2] == i) {
				return true;
			}
			if (gameArray[0][j] == i && gameArray[1][j] == i && gameArray[2][j] == i) {
				return true;
			}
		}
		if(gameArray[0][0] == i && gameArray[1][1] == i && gameArray[2][2] == i){
			return true;
		}
		if(gameArray[0][2] == i && gameArray[1][1] == i && gameArray[2][0] == i){
			return true;
		}
		return false;
	}

	private static void userTurn(int[][] gameArray) {
		System.out.println("Your Turn....");
		System.out.println("Enter Position");
		System.out.print("Row=");
		int row=sc.nextInt()-1;
		System.out.print("Column=");
		int cols= sc.nextInt()-1;
		if(isValidTurn(gameArray,row,cols)){
			gameArray[row][cols]=0;
		} 
		else {
			userTurn(gameArray);
		}
		
	}

	private static boolean isValidTurn(int[][] gameArray, int row, int cols) {
		if(gameArray[row][cols]==-1){
			return true;
		}
		return false;
	}

	public static int dayOfWeek(int day,int month,int year){
		 int m0,y0,d0,x;
		    
		    y0=year-(14-month)/month;
		    x=y0+y0/4-y0/100+y0/400;
		    m0=month+12*((14-month)/12)-2;
		    d0=(day+x+(31*m0)/12)%7;
		    return d0;
	}
	
	public static float convertTemperature(float temperature,char currentUnit){
		float conversion=0.0f;
		if(currentUnit=='f'||currentUnit=='F'){
			conversion=(temperature-32)*((float)5/9);
		}else if(currentUnit=='c'||currentUnit=='C'){
			conversion=(temperature*((float)9/5))+32;
		}
		return conversion;
	}
	
	public static float monthlyPayment(float payment,float rate,float year){
		float monthlyPay=0.0f;
		int months =(int)(12*year);
		float r=rate*((float)rate/12*100);
		monthlyPay=(float) ((payment*r)/(1-Math.pow(1+r,-months)));
		return monthlyPay;
	}
	
	public static double sqrt(int number){
		 double epslion=1e-15;
	     double t=number;
	     
	       while(Math.abs(t- number/t)> epslion*t) {
	         t=(number/t+t)/2;
	       }
	       return t;
	}
	
	public static String toBinary(int number) {
        int rem;
        String bin[] = {"0", "1"};
        String binary = "";
        int padding=0;
        while (number > 0 ||padding%8!=0) {
            rem = number % 2;
            binary = bin[rem] + binary;
            number = number / 2;
            padding++;
            if(padding%4==0&&number!=0){
            	binary=" "+binary;
            	
            }
        }
        return binary;
    }
	
	public static String swappedNibbles(String binary){
		binary=binary.replaceAll(" ","");
		String lowerNibble = binary.substring(0, 4);
		String upperNibble = binary.substring(4, 8);
		String swappedBinary=upperNibble+lowerNibble;
		return swappedBinary;
	}
	
	public static boolean isPowerOfTwo(int number){
		int power=0;
		int division=number;
		while(division>1){
			division=division/2;
			power++;
		}
		return number==(int)Math.pow(2, power);
	}
	
	public static int binaryToDecimal(String binary){
		int decimal=0,power=0;
		binary =binary.replaceAll(" ","");
		int index = binary.length()-1;	
		while(index>=0){
			decimal=(int) (Integer.parseInt(binary.charAt(index)+"")*Math.pow(2, power));
			power++;
			index--;
		}
		return decimal;
 
	}
	
	public static void primeAnagram(){
		ArrayList<String> primes=new ArrayList<>();
		for(int i=0;i<1000;i++){
			if(isPrime(i)){
				primes.add(String.valueOf(i));
			}
		}
		for(int i=0;i<primes.size();i++){
			for(int j=i+1;j<primes.size();j++){
				if(isAnagram(primes.get(i),primes.get(j))){
					System.out.println(primes.get(i)+" "+primes.get(j)+" are anagram");
				}
			}
		}
		
	}
	
	public static long elapsedTime(long start){
		long end=System.currentTimeMillis();
		return end-start;
	}

	public static void findNumber(int first,int last) {
		int middle=(first+last)/2;
		if(first<last){
			System.out.println("Is your number between "+first+" and " +middle+ " [y/n]:");
			char choice =sc.next().charAt(0);
			if(choice=='y' || choice=='Y'){
				findNumber(first,middle);
			
			}else{
				findNumber(middle+1,last);
			}
		} else if(first==last){
			System.out.println("Number is "+last);
		}
	}
	
	public static String[] mergeSort(String arr[]){
		String firstArray[]=new String[arr.length/2];
		String secondArray[]=new String[arr.length-(arr.length/2)];
		
		int j=0;
		if(arr.length==1){
			return arr;
		}
		for(int i=0;i<firstArray.length;i++){
			firstArray[i]=arr[i];
		}
		
		for(int i=firstArray.length;i<arr.length;i++){
			secondArray[j]=arr[i];
			j++;
		}
		
		firstArray = mergeSort(firstArray);
		secondArray = mergeSort(secondArray);
		
		
		
		
		String[] returnArray = new String[arr.length];
		int firstIndex = 0, secondIndex= 0;
		for(int i = 0; i < returnArray.length; i++){
			if(secondIndex == secondArray.length){
				returnArray[i] = firstArray[firstIndex];
				firstIndex++;
			}
			else if(firstIndex == firstArray.length){
				returnArray[i] = secondArray[secondIndex];
				secondIndex++;
			}
			else if(firstArray[firstIndex].compareTo(secondArray[secondIndex]) > 0){
				returnArray[i] = secondArray[secondIndex];
				secondIndex++;
			}
			else{
				returnArray[i] = firstArray[firstIndex];
				firstIndex++;
			}
		}

		return returnArray;
		
	
	}
	
	public static String[] readFile(String filePath){
		String words[]={};
		String line;
		BufferedReader bufferedReader;
		FileReader file;
		try {
			file = new FileReader(filePath);
			bufferedReader = new BufferedReader(file);
			while((line=bufferedReader.readLine())!=null){
				words=line.split(",|\\s");
			}	
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return words;
	}
	public static void writeFile(String word,String filePath) {
		
		try {
			FileWriter writer=new FileWriter(filePath,true);
			out =new PrintWriter(writer);
			out.println(word);
			out.close();
			writer.close();
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void returnNotes(int noteCounts[],int change,int pos){
		int notes[]={1000,500,100,50,10,2,1};
		if(pos<notes.length){
		if(change<notes[pos]){
			returnNotes(noteCounts,change,++pos);
		}
		else{
			change=change-notes[pos];
			noteCounts[pos]++;
			returnNotes(noteCounts,change,pos);
		}
		}
			
		
	}
	

		
	}

