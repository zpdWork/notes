package zpd.duotaiDemo.demo2;

/**
 * Created by Ad on 2016-09-28.
 */
public class AdaMain {

    public static void main(String[] args) {

        Ada4 ada4 = new Ada4();
        ada4.test(new Ada2());

        ada4.test(new Ada3());

        // 抽象类不能实例化、方法使用的是子类（因被重写）.
        Ada1 ada1 = new Ada2();
        ada1.sout();
    }

}
