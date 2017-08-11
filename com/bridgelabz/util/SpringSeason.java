/**************************
* Purpose : To perform basic arithmatic operation on a,b and c.
*
* @author  Sujit
* @version 1.0
* @since   7/08/2017
***************************/

public class SpringSeason { 
    public static void main(String[] args) { 
        
        int day   = Integer.parseInt(args[0]);
        int month = Integer.parseInt(args[1]);
        boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
                         || (month == 4 && day >=  1 && day <= 30)
                         || (month == 5 && day >=  1 && day <= 31)
                         || (month == 6 && day >=  1 && day <= 20);

        System.out.println(isSpring);
    }
}