package zpd.staticDemo;

/**
 * .
 *
 * @author zhangPengdong.
 * @date 2018-06-08 10:32.
 */
public class Tmp {

    {
        b = 3;
        a = 2;
        System.out.println("{}");
    }

    static {
        a = 3;
        b = 2;
        System.out.println("static");
    }

    public Tmp() {
        System.out.println("pub");
    }

    static int a = 1;
    static int b = 1;

    public static void main(String[] args) {
        System.out.println(Tmp.a);
        System.out.println(Tmp.b);
        System.out.println("------------");
        Tmp tmp = new Tmp();

    }
}
