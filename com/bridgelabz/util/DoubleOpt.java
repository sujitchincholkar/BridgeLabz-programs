/**************************
* Purpose : To perform basic arithmatic operation on a,b and c.
*
* @author  Sujit
* @version 1.0
* @since   7/08/2017
***************************/


public class DoubleOpt { 

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        double sum  = a + b * c;
        double prod = a * b + c;
        double quot = c +a / b;
        double rem  = a % b + c;

        System.out.println(a + " + " + b + " * "+c+" = "+ sum);
        System.out.println(a + " * " + b +" + "+c+" = "+ prod);
        System.out.println(c+" + "+a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " + "+c+" = "+ rem);
        
    }
}