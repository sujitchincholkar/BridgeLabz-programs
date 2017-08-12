/***************************************************************************
* Perpose : Find the binary number for given number as command line argument
*
*@author : Sujit
*@version : 1.0
*@since : 11-08-2017
****************************************************************************/



class Binary {

   public static void  main(String args[]) {
       
      //takes the command line argument from user
      int number = Integer.parseInt(args[0]);
      int rem;
      String bin[]={"0","1"};
      String binary="";
      while(number>0) {
        rem=number%2;
        binary=bin[rem]+binary;
        number=number/2;
   }
   System.out.println(binary);
  }
}