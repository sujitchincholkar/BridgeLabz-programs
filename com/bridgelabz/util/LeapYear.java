/**************************
* Purpose : To check whether given year is leap year or not
*
* @author  Sujit
* @version 1.0
* @since   7/08/2017
***************************/
  
public class LeapYear {
  public static void main(String args[]) {

    int year=Integer.parseInt(args[0]);
    boolean isLeapYear;
    
    if(year>=1582) {
    //divisible by 4
    isLeapYear = (year%4==0);
   
    //divisible by 4 and not by 100
    isLeapYear=isLeapYear&&(year%100)!=0;
   
    //divisible by 4 and 400
    isLeapYear=isLeapYear||(year%400)==0;
    System.out.println(isLeapYear);
    } else {
       System.out.println("Please Enter valid Year");
      }
  }
}
