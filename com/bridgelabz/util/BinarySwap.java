/***************************************************************************
* Perpose : Find the binary number for given number as command line argument
*
*@author : Sujit
*@version : 1.0
*@since : 11-08-2017
****************************************************************************/



class BinarySwap {

   public static void  main(String args[]) {
       
      //takes the command line argument from user
      int number = Integer.parseInt(args[0]);
      int rem,index=0,power=0,newNo=0;
      String bin[]={"0","1"};
      String lowerNibble,upperNibble,newNum,binary="";
      //Converting into binary
      while(number>0||binary.length()%8!=0) {
        rem=number%2;
        binary=bin[rem]+binary;
        number=number/2;
      }
      //swapping upper and lower nibble
      lowerNibble=binary.substring(0,4);
      upperNibble=binary.substring(4,8);
      newNum=upperNibble+lowerNibble;
      index=newNum.length()-1;
      while(index>=0) {
       newNo=newNo+(int)(Integer.parseInt(Character.toString(newNum.charAt(index)))*Math.pow(2,power));
       power++;
       index--;
      }
      System.out.println("Binary Conversion=      "+binary);
      System.out.println("After swapping Nibbles= "+newNum);
      System.out.println("Newly generated Number= "+newNo);
   
  }
}
