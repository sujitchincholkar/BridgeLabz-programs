/**************************
* Purpose : This program takes p r n as input
*
* @author  Sujit
* @version 1.0
* @since   7/08/2017
***************************/
public class CarLoan {
 public static void main(String args[]) {
   //Take values from command line arguments 
   double p=Double.parseDouble(args[0]);
   float y=Float.parseFloat(args[1]);
   float r= Float.parseFloat(args[2]);
   double payment;

   float R=r/12/100;
   float n= y*12;
   //Apply formula
   payment=(p*R)/(1-Math.pow(1+R,-n));
   System.out.println(payment);
  }
}