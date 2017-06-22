package zpd.abstractDemo.demo1;

import java.util.Date;
import java.util.UUID;

/**
 * Created by Ad on 2016-09-28.
 */
public class AdaMain {

    public static void main(String[] args) {

        Ada2 ada2 = new Ada2();
        ada2.setId(UUID.randomUUID().toString().replace("-", ""));
        ada2.setDate(new Date());
        ada2.setNumber(1);

        System.out.println(ada2);

    }

}
