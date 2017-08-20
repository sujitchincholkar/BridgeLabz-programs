/***************************************************************************
* Purpose : To create standard 	input functions
*
* @author   Sujit
* @version  1.0
* @since    18-08-2017
****************************************************************************/
import java.util.InputMismatchException;
import java.util.Scanner;


public class BLStdIn {

    static Scanner scanner;

    static {
        scanner = new Scanner(System.in);
    }

    public static boolean isEmpty() {
        return !scanner.hasNext();
    }

    public static int readInt() {
        String token = scanner.next();
        try {
            return Integer.parseInt(token);
        } catch (Exception e) {
            throw e;
        }
    }

    public static double readDouble() {
        String token = scanner.next();
        try {
            return Double.parseDouble(token);
        } catch (Exception e) {
            throw e;
        }
    }

    public static String readString() {
        return scanner.next();
    }

    public static boolean readBoolean() {
        String token = scanner.next();
        if ("true".equalsIgnoreCase(token)) {
            return true;
        } else if ("false".equalsIgnoreCase(token)) {
            return false;
        } else if ("1".equals(token)) {
            return true;
        } else if ("0".equals(token)) {
            return false;
        } else {
            throw new InputMismatchException("Inalid Input");
        }

    }

    public static boolean hasNextChar() {
        return scanner.hasNext();
    }

    public static char readChar() {
        return scanner.next().charAt(0);
    }

    public static boolean hasNextLine() {
        return scanner.hasNextLine();
    }

    public static String readLine() {
        String token = scanner.nextLine();
        return token;
    }

    public static String[] readAllString() {
        if (!scanner.hasNextLine()) {
            return null;
        }
        String token = readAll();
        String tokens[] = token.split(" ");
        return tokens;

    }

    public static int[] readAllInt() {
        String tokens[] = readAllString();
        int arr[] = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Integer.parseInt(tokens[i]);
        }
        return arr;
    }

    public static double[] readAllDouble() {
        String tokens[] = readAllString();
        double arr[] = new double[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Double.parseDouble(tokens[i]);
        }
        return arr;
    }

    public static boolean[] readAllBooleans() {
        String tokens[] = readAllString();
        boolean arr[] = new boolean[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            arr[i] = Boolean.parseBoolean(tokens[i]);
        }
        return arr;
    }

    public static String readAll() {
        return scanner.nextLine();

    }

}
