package zpd.jdk8.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ada on 2017-8-7.
 */
public class Demo1 {

  private static void old(List<String> list) {
    int count = 0;
    for (String s : list) {
      if (Integer.compare(s.length(), 3) > 0) {
        count++;
      }
    }
    System.out.println(count);
  }

  /**
   * stream方法将list生成一个stream
   * filter方法会返回另一个满足条件的stream(条件：str.length() > 3)
   * count方法将strean简化为一个结果
   *
   * @param list
   */
  private static void newMethod(List<String> list) {
//    list.stream().filter(str -> str.length()>3).count()
    System.out.println(list.stream().filter(str -> str.length() > 3).count());
  }

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("aa");
    list.add("aaa");
    list.add("aaaa");
    list.add("aaaaa");
    list.add("a");
    list.add("b");
    list.add("bb");
    list.add("bbb");

    old(list);

    newMethod(list);
  }
}
