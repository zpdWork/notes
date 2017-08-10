package zpd.jdk8.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Ada on 2017-8-10.
 */
public class Demo4 {

  public static void main(String[] args) {

    Stream stream = Stream.generate(Math::random).limit(100); // 生成100个随机数
    System.out.println(stream.count());
//    System.out.println(stream.skip(10).count()); // java.lang.IllegalStateException: stream has already been operated upon or closed

    List<String> list = new ArrayList<>();
    list.add("ada");
    list.add("ada");
    list.add("ada");
    list.add("zpd");
    System.out.println(list.stream().distinct().count()); // 2
    Stream<String> stringstream = list.stream().sorted(Comparator.comparing(String::length).reversed()); // 最长的一个单词出现在第一个位置。

    list.stream().forEach(System.out::println);

  }

}
