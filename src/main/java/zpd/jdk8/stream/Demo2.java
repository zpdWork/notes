package zpd.jdk8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Ada on 2017-8-10.
 */
public class Demo2 {


  public static void main(String[] args) {

    List list = new ArrayList<>();
    list.add("1");
    list.add("2");
    list.add("3");
    list.forEach(o -> System.out.println(o));

    System.out.println("----------------");

    String[] str = new String[3];
    str[0] = "1";
    str[1] = "2";
    str[2] = "3";
    Stream.of(str).forEach(s -> System.out.println(s)); // of可以构造一个含有任意个参数的stream
    Arrays.stream(str,0,2); // 将数组的一部分转换为stream，数组、开始、结束
    Stream.empty(); // 创建一个不含任何元素的stream

  }

}
