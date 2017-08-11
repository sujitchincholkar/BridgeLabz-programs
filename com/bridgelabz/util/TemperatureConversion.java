/**************************
* Purpose : This program takes input tempurature in fahrenheit
*           and convert it into celcius
*
* @author  Sujit
* @version 1.0
* @since   7/08/2017
***************************/
class TemperatureConversion {
  public static void main(String args[]) {
    double fahrenhite =Double.parseDouble(args[0]);
    double celsius=(fahrenhite-32)*5/9;
    System.out.println(celsius+" C");
  }
}