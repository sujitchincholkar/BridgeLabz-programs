/**************************
* Purpose : This program takes a command-line argument n and prints a table of
*           the powers of 2 that are less than or equal to 2^n.
*
* @author  Sujit
* @version 1.0
* @since   7/08/2017
***************************/
class PowerOf2 {
  public static void main(String args[]) {
     int n= Integer.parseInt(args[0]);
   double ans;
     for(int i=0;i<=n;i++) {
       ans=Math.pow(2,i);
       System.out.println(i+" "+ans);
     }
  }
}