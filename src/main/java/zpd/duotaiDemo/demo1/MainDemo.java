package zpd.duotaiDemo.demo1;

/**
 * Created by Ad on 2016-09-27.
 */
public class MainDemo {

    public static void main(String[] args) {

        Salary s = new Salary("员工 A", "北京", 3, 3600.00);
        Employee e = new Salary("员工 B", "上海", 2, 2400.00);
        System.out.println("使用 Salary 的引用调用 mailCheck -- ");
        s.mailCheck();
        System.out.println("\n使用 Employee 的引用调用 mailCheck--");
        e.mailCheck(); // 调用的是子类的方法，因为父类方法有可能被子类重写。

    }

}
