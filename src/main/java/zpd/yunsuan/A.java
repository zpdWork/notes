package zpd.yunsuan;

/**
 * 算术运算符.
 * <p/>
 * Created by Ada on 2016-06-13.
 */
public class A {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("b / a = " + (b / a));
        System.out.println("b % a = " + (b % a));
        System.out.println("c % a = " + (c % a));
        System.out.println("a++   = " + (a++)); // a++ 先把a打印，再++
        System.out.println("a--   = " + (a--)); // a-- 先把a打印，再--
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " + (d++));
        System.out.println("++d   = " + (++d));

        System.out.println((1+3)+(3+2)*2);

    }

}
