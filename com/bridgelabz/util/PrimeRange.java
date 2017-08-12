/***************************************************************************
* Purpose : To find prime nnumbers in given range
*
*@author : Sujit
*@version : 1.0
*@since : 08-08-2017
****************************************************************************/





public class PrimeRange {

       //funtion to check prime no
      public static int checkPrime(int n) {
     

      //condition to check if no less than two
      if (n < 2) { return 0;
      }
      
      //for loop to for checkin prime no
      for (int factor = 2; factor*factor <= n; factor++) {
         // if factor divides evenly into n, n is not prime, so break out of loop
         if (n % factor == 0) {
             return 0;
            
         }
      } // End of for loop
      return n;
   }

     public static void main(String args[]) {
       
        // taking minimum and maximum range of no in integer format 
        int minRange=Integer.parseInt(args[0]);
        int maxRange=Integer.parseInt(args[1]);

        //loop to initialize numbers in range
        for(int i=minRange;i<=maxRange;i++) {
            
            int prime=checkPrime(i);
            if(prime!=0) {
            System.out.println(prime);
            }
       } // End of for loop
}    }
