package zpd.abstractDemo.absAndinter;

import zpd.abstractDemo.absAndinter.inter.InterfaceDemo;
import zpd.abstractDemo.absAndinter.service.impl.DemoServiceImpl;

/**
 * Created by Ada on 2017-10-30.
 */
public class MainDemo {

    public static void main(String[] args) {

        InterfaceDemo interfaceDemo = new DemoServiceImpl();
        interfaceDemo.A();
        interfaceDemo.B();
        interfaceDemo.C();

    }

}
