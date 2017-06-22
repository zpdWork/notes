package zpd.dateDemo;

import java.util.Date;

/**
 * 测量时间间隔.
 *
 * Created by Ad on 2016-06-30.
 */
public class Test1 {

    public static void main(String[] args) {
        try {
            long start = System.currentTimeMillis();
            Thread.sleep(5000);
            long end = System.currentTimeMillis();
            System.out.println("开始：" + new Date(start) + "\n结束：" + new Date(end));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
