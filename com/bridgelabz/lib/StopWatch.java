/***************************************************************************
* Purpose : To create stopwatch to count time of program
*
* @author   Sujit
* @version  1.0
* @since    18-08-2017
****************************************************************************/
public class StopWatch {

    private static long start;

    public StopWatch() {
        start = System.currentTimeMillis();
    }

    public static long elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start);
    }
}
