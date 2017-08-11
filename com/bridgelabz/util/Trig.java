/**************************
* Purpose :This program illustrate Trignometric functions
*          in Math librarysuc as Math.sin(),Math.cos() ect.
*
* @author  Sujit
* @version 1.0
* @since   7/08/2017
***************************/
public class Trig {
  public static void main(String args[]) {
    double degrees=Double.parseDouble(args[0]);
    
    double radians= Math.toRadians(degrees);
     
    double s=Math.sin(radians);
    System.out.println("sin("+degrees+")="+s);
    
    double c=Math.cos(radians);
    System.out.println("cos("+degrees+")="+c); 
    
    double t=Math.tan(radians);
    System.out.println("tan("+degrees+")="+t); 
     
    double r=s*s + c*c;
    System.out.println(s*s +" + "+c*c+" = "+r);
  
  }
}  
    

 