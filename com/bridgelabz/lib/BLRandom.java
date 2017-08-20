/***************************************************************************
* Purpose : To create class for rando number genration
*
* @author   Sujit
* @version  1.0
* @since    18-08-2017
****************************************************************************/

import java.util.Random;

public class BLRandom {

    static Random random;
    static long seed;

    //static initialization
    static {
        random = new Random();
    }

    //Sets the seed of the pseudorandom number generator.
    public static void setSeed(long sed) {
        seed = sed;
        random = new Random(seed);
    }

    //Returns a random integer between 0 and num
    public static int uniform(int num) {
        return random.nextInt(num);
    }

    //Returns a random double value between low and high
    public static double uniform(double low, double high) {
        return low + (random.nextDouble() * (high - low));
    }

    //Returns a random boolean value with probability
    public static boolean bernoulli(double probability) {
        return random.nextDouble() < probability;
    }
    // Returns a random real number from a standard Gaussian distribution.

    public static double guassian() {
        return random.nextGaussian();
    }

    // Returns a random real number from a standard Gaussian distribution.
    //with given Mean mu and standard deviation sigma
    public static double guassian(double mu, double sigma) {
        return mu + sigma * random.nextGaussian();
    }

    //Shuffles given array.
    public static void shuffle(double arr[]) {
        if (arr.length > 0) {
            double temp;
            int randomIndex;
            for (int i = 0; i < arr.length; i++) {
                randomIndex = i + random.nextInt(arr.length - i);
                temp = arr[i];
                arr[i] = arr[randomIndex];
                arr[randomIndex] = temp;
            }
        }
    }
}
