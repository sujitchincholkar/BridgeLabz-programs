/**************************
* Purpose : To find distance between x and y
*
* @author  Sujit
* @version 1.0
* @since   7/08/2017
***************************/

public class Distance {
  public static void main(String args[]) {
    int x=Integer.parseInt(args[0]);
    int y=Integer.parseInt(args[1]);
    double distance=Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
    System.out.println("Distance From "+x+" and "+y+" is "+distance);

  }
}