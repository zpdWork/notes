package zpd.abstractDemo.absAndinter.abs;

import zpd.abstractDemo.absAndinter.inter.InterfaceDemo;

/**
 * Created by Ada on 2017-10-30.
 */
public abstract class AbsDemo implements InterfaceDemo {

    @Override
    public void A() {
        System.out.println("抽象类实现接口方法A");
    }

    @Override
    public void B() {
        System.out.println("抽象类实现接口方法B");
    }
}
