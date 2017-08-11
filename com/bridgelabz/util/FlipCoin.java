/****************************
* Purpose :This program Flips a coin n times and counts percentage
*          of Head and Tails
*
* @author  Sujit
* @version 1.0
* @since   7/08/2017
*****************************/
public class FlipCoin  {
   public static void main(String args[]) {
       int n =Integer.parseInt(args[0]);
       int countHead=0,countTail=0;
       float percentH,percentT;
       for(int i=0;i<n;i++) {
         if(Math.random()<0.5) { 
          System.out.println("Head");
          countHead++;
         } else {                   
           System.out.println("Tails");
           countTail++; 
           }
       }
       percentH=(countHead*100)/n;
       percentT=(countTail*100)/n;
       System.out.println("Percentage of Tail="+percentT+"\nPercentage of Heads="+percentH);
   
   }
}