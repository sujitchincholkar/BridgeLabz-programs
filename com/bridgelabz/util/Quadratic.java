/**************************
* Purpose :
*
* @author  Sujit
* @version 1.0
* @since   7/08/2017
***************************/

 public class Quadratic { 

    public static void main(String[] args) { 
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        double delta = b*b - 4*a*c;
        if(delta>0){
         double sqroot =  Math.sqrt(delta);
         double root1 = (-b + sqroot) / (2.0*a);
         double root2 = (-b - sqroot) / (2.0*a);

         System.out.println(root1);
         System.out.println(root2);
        } else{
           System.out.println("Roots are imaginary");
          }
    }
}