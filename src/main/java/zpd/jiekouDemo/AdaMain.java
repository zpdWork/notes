package zpd.jiekouDemo;

/**
 * Created by Ad on 2016-09-28.
 */
public class AdaMain {

    private static Ada2 ada2;

    public static void main(String[] args) {

        Ada4 ada4 = new Ada4();
        ada4.ada2M1();

        /**
         *  下面的这个方式，应该才是最棒的；左边是接口、右边是具体实现.
         *
         *  Map m = new HashMap();
         *  List l = new ArrayList();
         */
        Ada2 ada2 = new Ada4();
        ada2.ada2M1();

    }

}
