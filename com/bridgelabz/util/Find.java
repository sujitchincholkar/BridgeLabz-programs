/*****************************************************************************************
* Perpose : Find the 2nd last greater number and 2nd smaller number from unsorted array
*
*@author : Sujit
*@version : 1.0
*@since : 10-08-2017
******************************************************************************************/


class Find {

   public static void main(String args[]) {

      //Array that Store the elements thatb we need to Compare to find 2nd last greater and 2nd smaller
      int[] a = {12,45,65,48,75,10,35,41,98,11};
      
      int mMax1 = a[0], mMin1 = a[0];

      int mMax2 = 0, mMin2 = mMin1;

      //Find the 2nd last greater number from unsorted array
      for(int i = 0; i < a.length; i++) {

	if(mMax1 < a[i]) {
            mMax2 = mMax1;
	    mMax1 = a[i];
        }
      }

      //display the 2nd last greater number
      System.out.println("Second Last Max Number is "+mMax2);

      //Find the 2nd smaller number from unsorted array
      for(int i = 0; i < a.length; i++) {

	if(mMin1 > a[i]) {
            mMin2 = mMin1;
	    mMin1 = a[i];
        }
      }

      //display the 2nd smaller number
      System.out.println("Second Last Min Number is "+mMin2);
   }
}
