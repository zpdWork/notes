package zpd.dateDemo;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Created by Ad on 2016-06-30.
 */
public class CalendarDemo {

    public static void main(String[] args) {

        Calendar c1 = Calendar.getInstance();// 获取当前时间的对象，是对象

        System.out.println(c1.getTime()); // 当前时间

        c1.set(2015, 06, 30); // 设置成指定时间
        System.out.println(c1.getTime());

        c1.set(Calendar.DATE, 10); // 将日期设置成10号
        System.out.println(c1.getTime());

        c1.set(Calendar.YEAR, 1992); // 将年份设置成1992
        System.out.println(c1.getTime());

        c1.add(Calendar.DATE, 10); // 在当前日期上加10天；减去10天，把参数换位-10
        System.out.println(c1.getTime());

        System.out.println("获得年份：" + c1.get(Calendar.YEAR));

        System.out.println("获得月份：" + (c1.get(Calendar.MONTH) + 1));

        System.out.println("获得日期：" + c1.get(Calendar.DATE));

        System.out.println("获得小时：" + c1.get(Calendar.HOUR_OF_DAY));

        System.out.println("获得分钟：" + c1.get(Calendar.MINUTE));

        System.out.println("获得秒：" + c1.get(Calendar.SECOND));
        // 获得星期几（注意（这个与Date类是不同的）：1代表星期日、2代表星期1、3代表星期二。。。。）
        System.out.println("获得星期几：" + c1.get(Calendar.DAY_OF_WEEK));

        GregorianCalendar gc = new GregorianCalendar();
        System.out.println(gc.get(Calendar.YEAR) + "-" + (gc.get(Calendar.MONTH) + 1) + "-" + gc.get(Calendar.DATE));
        System.out.println(gc.isLeapYear(gc.get(Calendar.YEAR)) == true ? "今年是闰年" : "今年不是闰年");
    }

}
