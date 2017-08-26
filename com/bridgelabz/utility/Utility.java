package com.bridgelabz.utility;

import java.util.Arrays;

public class Utility {
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
		int num = 0;
		for (num = 0; num <= 1000; num++) {
			if (isPrime(num)) {
				System.out.println(num);
			}
		}
	}

	public static void printPrimePalindrome() {
		int temp;
		for (int num = 2; num < 1000; num++) {
			if (isPrime(num)) {
				if (isPalindrome(Integer.toString(num))) {
					System.out.println(num);
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
			if (arr[mid].compareTo(str) == 0) {
				isPresent = true;
				break;
			} else if (arr[mid].compareToIgnoreCase(str) < 0) {
				high = mid - 1;
				mid = (low + high) / 2;
			} else if (arr[mid].compareToIgnoreCase(str) > 0) {
				low = mid + 1;
				mid = (low + high) / 2;
			}
		}
		return isPresent;
	}

	public static void insertionSort(int arr[]) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			int key=arr[i];
			int j=i-1;
			while(j>=0&&arr[j]>key){
			  arr[j+1]=arr[j];
			  j--;
			}
			arr[j+1]=key;
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

	public static void printName(String name) {
		if (name.length() > 3) {
			System.out.println("Hello " + name + ",How are you?");
		} else {
			System.out.println("Inavalid Name");
		}
	}

	public static void flipCoin(int times) {
		int countHead = 0, countTail = 0;
		float percentH, percentT;
		for (int i = 0; i < times; i++) {
			if (Math.random() < 0.5) {
				System.out.println("Head");
				countHead++;
			} else {
				System.out.println("Tails");
				countTail++;
			}
		}
		// Calculating percentage
		percentH = (countHead * 100) / times;
		percentT = (countTail * 100) / times;
		System.out.println("Percentage of Tail=" + percentT
				+ "\nPercentage of Heads=" + percentH);
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

	public static void printPowerOfTwo(int num) {
		double ans;
		for (int power = 0; power <= num; power++) {
			ans = Math.pow(2, power);
			System.out.println(power + " " + ans);
		}
	}

	public static double getHarmonicNumber(int n) {
		double hNumber = 0.0;
		for (float i = 1; i <= n; i++) {
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
		System.out.println(wins + " wins of " + trials);
		System.out.println("Percent of games won = " + 100.0 * wins / trials);
		System.out.println("Avg # bets           = " + 1.0 * bets / trials);
	}

	public static void generateCoupon(int nRandoms) {
		int randomCount = 1, randomNo, flag = 0, index = 1;
		int a[] = new int[nRandoms];
		a[0] = (int) (nRandoms * Math.random());
		for (int i = 0; index < nRandoms; i++) {
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

	public static void printPrimeFactors(int num) {
		for (int factor = 2; factor * factor <= num; factor++) {
			// if factor is a factor of n, repeatedly divide it out
			while (num % factor == 0) {
				System.out.print(factor + " ");
				num = num / factor;
			}
		}
		// if biggest factor occurs only once, n > 1
		if (num > 1)
			System.out.println(num);
		else
			System.out.println();
	}

	public static double getDistance(int x, int y) {
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		return distance;
	}

	public static void printQuadriaticRoots(int a, int b, int c) {
		double delta = b * b - 4 * a * c;
		if (delta > 0) {
			double sqroot = Math.sqrt(delta);
			double root1 = (-b + sqroot) / (2.0 * a);
			double root2 = (-b - sqroot) / (2.0 * a);

			System.out.println(root1);
			System.out.println(root2);
		} else {
			System.out.println("Roots are imaginary");
		}
	}
	
	public static double getWindChill(double temprature,double windspeed){
		double windChill;
	    windChill=35.74+0.6215*temprature+(0.4275*temprature-35.75)*Math.pow(windspeed,0.16);
	    return windChill;
	}

}
