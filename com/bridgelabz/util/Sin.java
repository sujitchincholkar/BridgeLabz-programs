/***************************************************************************
* Perpose : Find sinx in tylor sereies
*
* @author : Sujit
* @version : 1.0
* @since : 11-08-2017
****************************************************************************/

class Sin {
  static double findFactorial(int num) {
   double fact=1;
   for(double i=num;i>=1;i--) {
      fact=fact*i;
  } 
  return fact;
  }
  public static void main(String args[]) {
    double angle=Double.parseDouble(args[0]);
    angle=angle%(2*Math.PI);
    int power=1,count=0,alt=0;
    double sinx=0,fact=1;
    while(count<5) {
      if(alt==0){
      fact=findFactorial(power);
      sinx=sinx+(Math.pow(angle,power)/fact);
      power=power+2;
      alt=1;
      } else {
           fact=findFactorial(power);
           sinx=sinx-(Math.pow(angle,power)/fact);
           power=power+2;
           alt=0;
        }
     count++;
    }
    System.out.println("Sinx ="+sinx);
  }
}
