package zpd.staticDemo;

/**
 * this、static.
 */
public class StaticDemo {

    private int intValue; // 实例变量，不初始化，默认值

    private void soutInt() {
        //int intValue; 局部变量必须初始化
        int intValue = 69;
        System.out.println(intValue); // 调用的是当前方法中的局部变量
        System.out.println(this.intValue); // this代表当前这个类，所以调用的是这个类的静态变量
    }

    public static void main(String[] args) {
        new StaticDemo().soutInt();
    }

}
