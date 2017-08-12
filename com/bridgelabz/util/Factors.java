/***************************************************************************
* Purpose : This program prints prime factors of given number n
*
* @author : Sujit
* @version : 1.0
* @since : 10-08-2017
****************************************************************************/

public class Factors {

    public static void main(String[] args) { 

        // command-line argument
        int n = Integer.parseInt(args[0]);

        System.out.print("The prime factorization of " + n + " is: ");

        // for each potential factor
        for (int factor = 2; factor*factor <= n; factor++) {

            // if factor is a factor of n, repeatedly divide it out
            while (n % factor == 0) {
                System.out.print(factor + " "); 
                n = n / factor;
            }
        }

        // if biggest factor occurs only once, n > 1
        if (n > 1) System.out.println(n);
        else       System.out.println();
    }
}