/***************************************************************************
* Purpose : Find the repeated Number
*
* @author : Sujit
* @version : 1.0
* @since : 10-08-2017
****************************************************************************/

public class Repeated {

    public static void main(String args[]) {

        //Array that Store the integer number
        int[] array = {1,25,64,23,84,15,32,51,45,35,25};

        //Find the Duplicate Number
        for(int i = 0; i < array.length; i++) {

            for(int j = i+1; j < array.length; j++) {

                if(array[i] == array[j]) {

                    System.out.println("Repeted Number is " + array[i]);
                } 
            }
        }
    }
}
