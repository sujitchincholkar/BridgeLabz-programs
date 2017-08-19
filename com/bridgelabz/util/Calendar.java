/***************************************************************************
* Purpose : To print calendar of given month and year
*
* @author   Sujit
* @version  1.0
* @since    18-08-2017
****************************************************************************/
public class Calendar {
   
    static int getDayOfWeek(int day, int month, int year) {
        int m0, y0, d0, x;

        //Apply formula
        y0 = year - (14 - month) / month;
        x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        m0 = month + 12 * ((14 - month) / 12) - 2;
        d0 = (day + x + (31 * m0) / 12) % 7;
        return d0;
    }

    static void printMonth(int month, int year) {

        String months[] = {"January", "February", "March",
                           "April", "May", "June",
                           "July", "August", "September",
                          "October", "November", "December"};
        System.out.println(months[month - 1] + " " + year);
        int daysInMonth[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.println("S  M  T  W  Th F  S");
        boolean isLeapYear = year % 4 == 0 && year % 100 != 0;
        isLeapYear = isLeapYear || year % 400 == 0;
        if (isLeapYear) {
            daysInMonth[1] = 29;
        }
        int dayofweek = getDayOfWeek(1, month, year);
        for (int i = 0; i < dayofweek; i++) {
            System.out.print("   ");
        }
        dayofweek++;
        for (int day = 1; day <= daysInMonth[month - 1]; day++) {
            if (day < 10) {
                System.out.print(day + "  ");
            } else {
                System.out.print(day + " ");
            }
            if (dayofweek % 7 == 0) {
                System.out.println();
                dayofweek = 0;
            }
            dayofweek++;
        }
    }
  
  public static void main(String args[]){
    int month=Integer.parseInt(args[0]);
    int year=Integer.parseInt(args[1]);
    printMonth(month,year);
  }
}