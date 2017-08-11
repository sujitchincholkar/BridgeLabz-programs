/**************************
* Purpose :Prints the nth harmonic number: 1/1 + 1/2 + ... + 1/n.
*
* @author  Sujit
* @version 1.0
* @since   7/08/2017
***************************/
class HarmonicNumber {
  public static void main(String args[]) {
    int n=Integer.parseInt(args[0]);
    double hNumber=0.0;
    for(float i=1;i<=n;i++) {
      hNumber+=(1/i);
      
    }
    System.out.println(hNumber);
  }
}