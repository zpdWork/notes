package zpd.jdk8.lambda;

/**
 * Created by Ada on 2017-8-7.
 */
public class Demo1 {

  public static void main(String[] args) {
//    Comparator<String> stringComparator = (String str1, String str2) -> Integer
//        .compare(str1.length(), str2.length());

//    int[]::new;

//    (str1,str2)-> Comparator.comparing(String::length);

    repeatMessage("ada", 5);

  }

  /**
   * lambda表达式会可以捕获闭包合作域中的变量值。
   * 被引用的变量的值，是不可以更改的；因为更改lambda表达式中的变量不是线程安全的。
   *
   * @param text 自由变量的值
   * @param count 自由变量的值
   */
  public static void repeatMessage(String text, int count) {
    Runnable runnable = () -> {
      for (int i = 0; i < count; i++) {
        System.out.println(text);
        Thread.yield();
      }
    };

    new Thread(runnable).start();
  }

}
