/***************************************************************************
* Perpose : Find cosx in tylor sereies
*
* @author : Sujit
* @version : 1.0
* @since : 11-08-2017
****************************************************************************/

class Cos {
   //Acepting input from command line
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
    int power=0,count=0,alt=0;
    double cosx=0,fact=1;
    while(count<5) {
      if(alt==0){
       fact=findFactorial(power);
       cosx=cosx+(Math.pow(angle,power)/fact);
       power=power+2;
       alt=1;
      } else {
           fact=findFactorial(power);
           cosx=cosx-(Math.pow(angle,power)/fact);
           power=power+2;
           alt=0;
        }
     count++;
    }
    System.out.println("Cosx ="+cosx);
  }
}
