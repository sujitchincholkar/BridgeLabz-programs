/***************************************************************************
* Purpose : 
*
* @author : Sujit
* @version : 1.0
* @since : 11-08-2017
****************************************************************************/
public class MathFunction {
    //Function to find Harmonic value
    public static double getHarmonicNumber(int n) {
        double hNumber = 0.0;
        for (float i = 1; i <= n; i++) {
            hNumber += (1 / i);
        }
        return hNumber;
    }
    
    public static double findFactorial(int num) {
        double fact = 1;
        for (double i = num; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }
    
    //Method to find Sin value of angle
    public static double getSin(double angle) {
        angle = angle % (2 * Math.PI);
        int power = 1, count = 0, alt = 0;
        double sinx = 0, fact = 1;
        while (count < 5) {
            //Checking Alternative sins 
            if (alt == 0) {
                fact = findFactorial(power);
                sinx = sinx + (Math.pow(angle, power) / fact);
                power = power + 2;
                alt = 1;
            } else {
                fact = findFactorial(power);
                sinx = sinx - (Math.pow(angle, power) / fact);
                power = power + 2;
                alt = 0;
            }
            count++;
        }
        return sinx;
    }

    //Method to find Cos value of angle
    public static double getCos(double angle) {
        angle = angle % (2 * Math.PI);
        int power = 0, count = 0, alt = 0;
        double cosx = 0, fact = 1;
        while (count < 5) {
            if (alt == 0) {
                fact = findFactorial(power);
                cosx = cosx + (Math.pow(angle, power) / fact);
                power = power + 2;
                alt = 1;
            } else {
                fact = findFactorial(power);
                cosx = cosx - (Math.pow(angle, power) / fact);
                power = power + 2;
                alt = 0;
            }
            count++;
        }
        return cosx;
    }
    
    //Method to convert decimal into binary
    public static String toBinary(int number) {
        int rem;
        String bin[] = {"0", "1"};
        String binary = "";
        while (number > 0) {
            rem = number % 2;
            binary = bin[rem] + binary;
            number = number / 2;
        }
        return binary;
    }

    //Method to find square root
    public static double sqrt(double number) {
        double epslion = 1e-15;
        double t = number;

        while (Math.abs(t - number / t) > epslion * t) {
            t = (number / t + t) / 2;
        }
        return t;

    }

    //Method to find square root 
    public static double sqrt(double number, double epslion) {

        double t = number;

        while (Math.abs(t - number / t) > epslion * t) {
            t = (number / t + t) / 2;
        }
        return t;

    }

    //Method to find given number is prime or not
    public static boolean isPrime(int number) {

        //condition to check if no less than two
        if (number < 2) {
            return false;
        }

        //for loop to for checkin prime no
        for (int factor = 2; factor * factor <= number; factor++) {
            // if factor divides evenly into n, n is not prime, so break out of loop
            if (number % factor == 0) {
                return false;

            }
        } // End of for loop
        return true;
    }

    //Method to find factorial
    public static long factorial(int num) {
        long fact = 1;
        for (int i = num; i >= 1; i--) {
            fact = fact * i;
        }
        return fact;
    }

   //Method to find future amount for given capital,rate and time period 
    public static double getFutureValue(double capital, double rate, double period) {
        double futureValue;
        futureValue = capital * Math.pow(1 + rate, period);
        return futureValue;
    }
     
    //Method to find current amount for given capital,rate and time period 
    public static double getPresentValue(double capital, double rate, double period) {
        double futureValue;
        futureValue = capital / Math.pow(1 + rate, period);
        return futureValue;
    }

    //Method that returns minimum value from given array
    public static int minValue(int arr[]) {
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];
            }
        }
        return minVal;
    }

    //Method that returns miximum value from given array
    public static int maxValue(int arr[]) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

     public static String minValue(String arr[]) {
        String minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minVal.compareTo(arr[i]) > 0) {
                minVal = arr[i];
            }
        }
        return minVal;
    }

    public static String maxValue(String arr[]) {
        String maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxVal.compareTo(arr[i]) < 0) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
     /*
    public static int minValue(String arr[]) {
        int minVal = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (minVal > Integer.parseInt(arr[i])) {
                minVal = Integer.parseInt(arr[i]);
            }
        }
        return minVal;
    }

    public static int maxValue(String arr[]) {
        int maxVal = Integer.parseInt(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (maxVal > Integer.parseInt(arr[i])) {
                maxVal = Integer.parseInt(arr[i]);
            }
        }
        return maxVal;
    }
    */
    public static boolean checkCollinearUsingSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB, slopeBC, slopeAC;
        slopeAB = (double)(y2 - y1) / (double)(x2 - x1);
        slopeBC = (double)(y3 - y2) / (double)(x3 - x2);
        slopeAC = (double)(y3 - y1) / (double)(x3 - x1);
        return slopeAB == slopeBC && slopeAB == slopeAC;
    }

    public static boolean checkCollinearUsingTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        int determinant =((x1-x2)*(y2-y3))-((x2-x3)*(y1-y2));
        double collinear=(1.0/2.0)*(float)determinant;
        return collinear==0.0;
    }

}
