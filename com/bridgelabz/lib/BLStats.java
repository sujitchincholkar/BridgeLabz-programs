/***************************************************************************
* Purpose : Library of statistical functions that takes array of real numbers from standard input,
*           and computes the minimum, mean, maximum and standard deviation. 
*
* @author   Sujit
* @version  1.0
* @since    18-08-2017
****************************************************************************/
public class BLStats {

    public static double max(double[] a) {
        double maximum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > maximum) {
                maximum = a[i];
            }
        }
        return maximum;
    }

    public static double min(double[] a) {
        double minimum = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < minimum) {
                minimum = a[i];
            }
        }
        return minimum;
    }

    public static double mean(double[] a) {
        double mean = 0;
        for (int i = 0; i < a.length; i++) {
            mean += a[i];
        }
        mean = mean / a.length;
        return mean;
    }

    public static double median(double[] a) {
        double temp;
        double median;
        int mIndex;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        mIndex = a.length / 2;
        median = a[mIndex - 1];
        return median;

    }

    public static double var(double[] a) {
        double mean = mean(a);
        double sum = 0;
        int i;
        for (i = 0; i < a.length; i++) { 
            sum += Math.pow((a[i] - mean), 2);
        }
        sum = sum / a.length;
        return sum;
    }
   public static double stddev(double[] a){
		double variance = Math.sqrt(var(a));
		return variance;
	}
}
