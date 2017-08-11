/**************************
* Purpose : This program takes t and v and prints windchill
*           
* @author  Sujit
* @version 1.0
* @since   7/08/2017
***************************/

class WindChill {
  public static void main(String args[]) {
    double temprature = Integer.parseInt(args[0]);
    double windspeed =  Integer.parseInt(args[1]);
    double windChill;
    windChill=35.74+0.6215*temprature+(0.4275*temprature-35.75)*Math.pow(windspeed,0.16);
    System.out.println(windChill);

  }
}