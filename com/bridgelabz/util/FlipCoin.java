/****************************
* Purpose :This program Flips a coin n times and counts percentage
*          of Head and Tails
*
* @author  Sujit
* @version 1.0
* @since   10/08/2017
*****************************/
public class FlipCoin  {
   public static void main(String args[]) {
       //takes input from Command line
       int n =Integer.parseInt(args[0]);
       int countHead=0,countTail=0;
       float percentH,percentT;
       // loop for generatinh head and tail randomly
       for(int i=0;i<n;i++) {
         if(Math.random()<0.5) { 
          System.out.println("Head");
          countHead++;
         } else {                   
           System.out.println("Tails");
           countTail++; 
           }
       }
       // Calculating percentage
       percentH=(countHead*100)/n;
       percentT=(countTail*100)/n;
       System.out.println("Percentage of Tail="+percentT+"\nPercentage of Heads="+percentH);
   
   }
}