package zpd.fanxingDemo;

/**
 * Created by Ad on 2016-09-29.
 */
public class Ada2 {

    public static <T extends Comparable<T>> T maxT(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0) {
            max = y;
        }
        if (z.compareTo(max) > 0) {
            max = z;
        }

        return max;
    }

    public static void main(String[] args) {

        System.out.println("3,4,5最大的是：" + maxT(3, 4, 5));

        System.out.println("a,b,c最大的是：" + maxT(3.4, 4.5, 2.6));

    }

}
