/**************************
* Purpose :This program takes input and find its square
*          root using Newton's Method
*
* @author  Sujit
* @version 1.0
* @since   7/08/2017
***************************/

class Sqrt {
  public static void main(String args[]) {
     double c=Double.parseDouble(args[0]);
      
     double epslion=1e-15;
     double t=c;
     
       while(Math.abs(t- c/t)> epslion*t) {
         t=(c/t+t)/2;
       }
       
      System.out.println(t);
   }
}