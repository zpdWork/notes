package zpd.method;

/**
 * 方法多个参数.
 * <p/>
 * Created by Ad on 2016-07-07.
 */
public class Params {

    public static void test(int... i) {
        System.out.println(i.length);
        System.out.println("-----");
        for (int i1 : i) {
            System.out.println(i1);
        }
    }

    public static void test(String... str) {
        System.out.println(str.length);
        System.out.println("-----");
        for (String s : str) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        //test(1,2,3,4);
        test("a", "b", "c", "d", "e");
    }

}
