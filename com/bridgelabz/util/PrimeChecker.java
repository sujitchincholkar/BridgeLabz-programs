/*
 * JAVA STYLE GUIDE - SOURCE FILE HEADER STYLE
 * NOTE - A SINGLE BLANK LINE SEPARATES THE TWO BLOCKS i.e. BETWEEN HEADER, PACKAGE, 
 *        IMPORT STATEMENTS, CLASS DECLARATION, etc
 */

/******************************************************************************
 *  Compilation:  javac -d bin PrimeChecker.java
 *  Execution:    java -cp bin com.bridgelabz.util.PrimeChecker n
 *  
 *  Purpose: Determines whether or not n is prime.
 *
 *  @author  BridgeLabz
 *  @version 1.0
 *  @since   06-08-2017
 *
 ******************************************************************************/

/*
 * JAVA STYLE GUIDE - PACKAGE NAMING STYLE
 */

package com.bridgelabz.util;

/*
 * JAVA STYLE GUIDE - IMPORT STATEMENtS
 * NOTE : NO WILDCARD IMPORTS i.e. import java.lang.*; 
 *        NO LINE WRAPING - APPEARS IN ONE LINE
 */
import java.lang.Long;
import java.lang.NumberFormatException;

/*
 * JAVA STYLE GUIDE - CLASS DECLARATION STYLE
 * NOTE - ORDER OF DECLARATION - STATIC VARIABLE, CLASS VARIABLES, DEFAULT CONSTRUCTOR,
 *        PARAMETRIZED CONSTRUCTOR, FUNCTIONS, TO STRING FUNCTION, STATIC FUNCTIONS AND 
 *        FINALLY MAIN FUNCTION.
 *      - EACH TIME A NEW BLOCK OR BLOCK­LIKE CONSTRUCT IS OPENED, THE INDENT INCREASES BY THREE 
 *        SPACES.
 *      - COLUMN LIMIT 100 CHARACTERS
 *      - ONE STATEMENT PER LINE
 */
public class PrimeChecker {

   /*
    * JAVA STYLE GUIDE - CLASS STATIC VARIABLE DECLARATION STYLE
    * NOTES - ALL STATIC VARIABLE SHOULD BE DECLARED IN THE TOP.
    *         FOR EVERY STATIC VARIABLE THERE NEEDS TO COMMENT
    *       - STATIC VARIABLE ARE DECLARED AS ALL CAPS SEPERATED BY _ IF MULTIPPLE WORD
    */
   
   /*
    * Static Variable is declared to Print Prime Number Message 
    */
   public static String PRIME_NUMBER_MESSAGE = " is a prime number";

   /*
    * Static Variable is declared to Print message if the number is not Prime Number
    */
   public static String NOT_PRIME_NUMBER_MESSAGE = " is not a prime number";

   /*
    * JAVA STYLE GUIDE - CLASS INSTANCE VARIABLE DECLARATION STYLE
    * NOTES - ALL CLASS VARIABLE SHOULD BE DECLARED IN THE TOP AFTER STATIC DICLARATION IF ANY.
    *       - CLASS MEMBER VARIABLE NAME STARTS WITH 'm' TO INDICATE CLASS VARIABLE. FOLLOWWED 
    *         BY THE VARIABLE NAME IN CAMLE CASE
    *       - FOR EVERY CLASS VARIABLE THERE NEEDS TO BE A COMMENT DESRIBING THE NEED FOR THE VARIABLE
    */
   
   /*
    * mInputNumber variable stores the number entered by the user as the input
    */
   private long mInputNumber;

   /*
    * mIsPrime variable stores if the number is prime or not
    */
   private boolean mIsPrime;

   /*
    * JAVA STYLE GUIDE - DEFAULT CONSTRUCTOR DECLARATION STYLE
    * NOTES - DEFAULT CONSTRUCTOR IS IMMEDIATELY AFTER CLASS VARIABLES AND BEFOR ANY OTHER 
    *         CONSTRUCTOR OR FUNCTION DECLARATION
    *       - FOR EVERY CONSTRUCTOR THERE NEEDS TO BE A COMMENT DESRIBING THE NEED
    */

   /**
    * Default Constructor to initialize mInputNumber variable to 0. 
    */
   public PrimeChecker() {
      mInputNumber = 0; 
      this.checkPrime();
   }

   /**
    * Constructor to take the input number
    *
    * @param number the number to check for prime
    */
   public PrimeChecker(long number) {
      mInputNumber = number; 
      this.checkPrime();
   }

   /*
    * JAVA STYLE GUIDE - CLASS FUNCTION DECLARATION STYLE
    * NOTES - CLASS FUNCTION IS DECLARED IMMEDIATELY AFTER CONSTRUCTOR
    *       - FOR EVERY FUNCTION THERE NEEDS TO BE A COMMENT DESRIBING THE PURPOSE
    *       - FUNCTION DECLARATION STARTS WITH A SMALL CASE AND THEN CAMEL CASE FOR EVERY WORD IN
    *         THE FUNCTION
    */
   
   /**
    * Function to check for prime
    *
    * @param number the number to check for prime
    */
   public void checkPrime() {
      mIsPrime = checkPrime(mInputNumber);
   }

   /**
    * return a string message describing the number is prime or not. This function overrides 
    * the toString function declared in the Object Class
    *
    * @return String message for prime and non prime numbers
    */
   public String toString() {
      String message = "";
      // retrun string based on the mInputNumber is prime or not
      if (mIsPrime) message = mInputNumber + PRIME_NUMBER_MESSAGE;
      else message = mInputNumber + NOT_PRIME_NUMBER_MESSAGE;
      return message;
   }

   /**
    * Static Function to check for prime. This function is declared static because no initialization
    * of clase PrimeChecker is needed if the number is to be checked for prime. 
    *
    * @param number the number to check for prime
    * @return true if the number is a prime else false
    */
   public static boolean checkPrime(long n) {
      boolean isPrime = true;

      /*
       * JAVA STYLE GUIDE - EVERY BLOCK NEEDS TO HAVE THE COMMENT
       * NOTES - LEAVE SINGLE BLANK LINE AFTER EVERY LOOP
       *       - NO NEED FOR CURLY BRACES {} IF THE CONDITION HAS ONLY ONE STATEMENT
       */
      // Any number less then 2 ia a prime
      if (n < 2) isPrime = false;

      // try all possible factors of n
      // if n has a factor, then it has one less than or equal to sqrt(n),
      // so for efficiency we only need to check factor <= sqrt(n) or
      // equivalently factor*factor <= n
      for (long factor = 2; factor*factor <= n; factor++) {
         // if factor divides evenly into n, n is not prime, so break out of loop
         if (n % factor == 0) {
             isPrime = false;
             break;
         }
      } // End of for loop
      return isPrime;
   }

   /*
    * The main function is written to test PrimeChecker class
    */
   public static void main(String[] args) { 
      long n = 0;

      // Only taking valid integer input. If Exception is thrown than not procssing further.
      try {
        n = Long.parseLong(args[0]);
      } catch (NumberFormatException ex) {
        System.out.println("PLEASE ENTER VALID INPUT: "+ex.getMessage());
        return;
      }

      // Method 1 - using static function of Prime Checker
      // print out whether n is prime
      boolean isPrime = PrimeChecker.checkPrime(n);
      System.out.println("PRINTING RESULT USING PrimeChecker STATIC FUNCTION");
      if (isPrime) System.out.println(n + PrimeChecker.PRIME_NUMBER_MESSAGE);
      else System.out.println(n + PrimeChecker.NOT_PRIME_NUMBER_MESSAGE);

      // Method 2 - using instance function of Prime Checker
      PrimeChecker primeChecker = new PrimeChecker(n);
      System.out.println("PRINTING RESULT USING PrimeChecker INSTANCE FUNCTION");
      System.out.println(primeChecker.toString());
   }
}
