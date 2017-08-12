/**************************
* Purpose : This program takes input tempurature in fahrenheit
*           and convert it into celcius
*
* @author  Sujit
* @version 1.0
* @since   9/08/2017
***************************/
class TemperatureConversion {
  public static void main(String args[]) {
    //Accept tempurature in farenhite input from Command line
    double fahrenhite =Double.parseDouble(args[0]);
    //converting into celcius
    double celsius=(fahrenhite-32)*5/9;
    System.out.println(celsius+" C");
  }
}