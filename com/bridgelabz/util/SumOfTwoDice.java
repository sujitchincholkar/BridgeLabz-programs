/**************************
* Purpose :  Generate 2 random integers between 1 and 6, and print their sum.
*
* @author  Sujit
* @version 1.0
* @since   7/08/2017
***************************/

public class SumOfTwoDice { 
    public static void main(String[] args) {
        //Genrating random numbers
        int a = 1 + (int) (Math.random() * 6);
        int b = 1 + (int) (Math.random() * 6);
        //Adding generated random number
        int sum = a + b;
        System.out.println(sum);
    }
}
