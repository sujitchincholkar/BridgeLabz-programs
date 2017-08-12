/**************************
* Purpose : To perform basic arithmatic operation on integer a,band c.
*
* @author  Sujit
* @version 1.0
* @since   7/08/2017
***************************/


public class IntOpt { 

    public static void main(String[] args) {
        //takes input from Command line
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        //Basic Arithmatic operations
        int sum  = a + b * c;
        int prod = a * b + c;
        int quot = c +a / b;
        int rem  = a % b + c;

        System.out.println(a + " + " + b + " * "+c+" = "+ sum);
        System.out.println(a + " * " + b +" + "+c+" = "+ prod);
        System.out.println(c+" + "+a + " / " + b + " = " + quot);
        System.out.println(a + " % " + b + " + "+c+" = "+ rem);
        
    }
}