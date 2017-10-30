package zpd.staticDemo;

/**
 * Created by Ada on 2017-10-25.
 */
public class StaticM {

    static {
        System.out.println("StaticM {}");
    }

    {
        System.out.println("{}"); // 只有初始化的时候才会被调用
    }

    StaticM() {
        System.out.println("StaticM {}"); // 只有初始化的时候才会被调用
    }

    private static void changeStr(String str) {
        System.out.println("changeStr S str=" + str);
        str = "welcome";
        System.out.println("changeStr E str=" + str);
    }


    public static void main(String[] args) throws InterruptedException {
        String str = "1234";
        System.out.println(str);
        StaticM.changeStr(str);
        System.out.println(str);
    }

}
