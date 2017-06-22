package zpd.yunsuan;

/**
 * 关系运算符.
 * <p/>
 * Created by Ada on 2016-06-13.
 */
public class B {

    public static void main(String args[]) {

        int a = 10;
        int b = 20;
        System.out.println("a == b = " + (a == b));
        System.out.println("a != b = " + (a != b));
        System.out.println("a > b = " + (a > b));
        System.out.println("a < b = " + (a < b));
        System.out.println("b >= a = " + (b >= a)); // 大于等于，满足一个都为true
        System.out.println("b <= a = " + (b <= a));
    }
}
