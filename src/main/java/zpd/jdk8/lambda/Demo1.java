package zpd.jdk8.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ada on 2017-8-7.
 */
public class Demo1 {

  public static void main(String[] args) {
//    Comparator<String> stringComparator = (String str1, String str2) -> Integer
//        .compare(str1.length(), str2.length());

//    int[]::new;

//    (str1,str2)-> Comparator.comparing(String::length);

//    repeatMessage("ada");

    demo1();
//    foreach();
  }

  /**
   * lambda表达式会可以捕获闭包合作域中的变量值。
   * 被引用的变量的值，是不可以更改的；因为更改lambda表达式中的变量不是线程安全的。
   *
   * @param text 自由变量的值
   */
  private static void repeatMessage(String text) {
    Runnable runnable = () -> {
      for (int i = 0; i < 5; i++) {
        System.out.println(text);
        Thread.yield();
      }
    };

    new Thread(runnable).start();
  }

  /**
   * ()-{} 替代匿名类
   */
  static void demo1() {
    // 老版
    new Thread(new Runnable() {
      @Override
      public void run() {
        System.out.println("ada-demo1：老版");
      }
    });
    // 简写
    new Thread(() -> System.out.println("ada-demo1：新版"));
  }

  /**
   * 循环处理.
   */
  static void foreach() {
    List list1 = Arrays.asList("a", "b", "c", "d", "e");
    for (Object o : list1) {
      System.out.print("老版："+o);
    }

    list1.forEach(s -> System.out.print("新版："+s));
    list1.forEach(System.out::print);
  }

}
