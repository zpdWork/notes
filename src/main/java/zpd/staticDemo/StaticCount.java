package zpd.staticDemo;

/**
 * Created by Ada on 2016-06-13.
 */
public class StaticCount {

    private static Integer static_i = 0;
    private Integer static_i1 = 0;

    static void addCount() {
        static_i++;
        //static_i1++; // 静态方法不能使用类的非静态变量
        System.out.println("addCount");
    }

    static Integer getCount() {
        System.out.println("getCount");
        return static_i;
    }

    StaticCount() {
        StaticCount.addCount();
    }

    public static void main(String[] args) {
        System.out.println("S - " + StaticCount.getCount());

        for (int i = 0; i < 500; i++) {
            new StaticCount(); // new StaticCount，会调用这个类的构造方法
        }

        System.out.println("E - " + StaticCount.getCount());

    }

}
