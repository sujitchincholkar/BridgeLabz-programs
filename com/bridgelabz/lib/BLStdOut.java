/***************************************************************************
* Purpose : To create standard output functions
*
* @author   Sujit
* @version  1.0
* @since    18-08-2017
****************************************************************************/
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class BLStdOut {
    static PrintWriter out;
    static{
        try{
        out=new PrintWriter(new OutputStreamWriter(System.out,"UTF-8"),true);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public static void print(String s){
        out.print(s);
    }
    public static void println(String s){
        out.println(s);
    }
    public static void println(){
        out.println();
    }

    /**
     *
     * @param format
     * @param args
     */
    public static void printf(String format,Object... args){
        out.printf(format, args);
    }
}
