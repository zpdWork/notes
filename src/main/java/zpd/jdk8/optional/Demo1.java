package zpd.jdk8.optional;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * Created by Ada on 2017-8-10.
 */
public class Demo1 {


  private static List<String> getList() {
    List<String> list = new ArrayList<>();
    list.add("zhangPengdong");
    list.add("zhaoYuTing");
    list.add("Ada");
    list.add("aYu");

    return list;
  }

  public static void main(String[] args) {
    max();
    findFirst();
    findAny();
    collect();
  }

  private static void max() {
    List<String> list = getList();
    Optional optional = list.stream().max(String::compareToIgnoreCase);
    if (optional.isPresent()) {
      System.out.println(optional.get());
    }
    System.out.println("-----------------");
  }

  private static void findFirst() {
    List<String> list = getList();
    Optional optional1 = list.stream().filter(s -> s.startsWith("z")).findFirst();
    if (optional1.isPresent()) {
      System.out.println(optional1.get());
    }
    System.out.println("-----------------");
  }

  private static void findAny() {
    List<String> list = getList();
    Optional optional1 = list.stream().filter(s -> s.startsWith("z")).findAny();
    if (optional1.isPresent()) {
      System.out.println(optional1.get());
    }
    System.out.println("-----------------");
  }

  private static void ofNullable() {
    List<String> list = getList();
    Optional optional = list.stream().findFirst();
//    Optional.of()
//    Optional.empty()
    Optional.ofNullable(optional); // optional不是null返回Optional.of()，是null返回Optional.empty()。
    System.out.println("-----------------");
  }

  private static void collect() {
    List<String> list = getList();
    List<String> ada1 = list.stream().collect(Collectors.toList());
    System.out.println(ada1);

    String ada2 = list.stream().collect(Collectors.joining()); // 拼接字符串
    System.out.println(ada2);
    String ada3 = list.stream().collect(Collectors.joining(",")); // 拼接字符串，并且有分隔符
    System.out.println(ada3);
    System.out.println("-----------------");

//    summarizing // 总和、平均值、最大值、最小值
    IntSummaryStatistics intSummaryStatistics = list.stream().collect(Collectors.summarizingInt(String::length));
    System.out.println(intSummaryStatistics);
    System.out.println(intSummaryStatistics.getAverage());
    System.out.println(intSummaryStatistics.getMax());



  }

}
