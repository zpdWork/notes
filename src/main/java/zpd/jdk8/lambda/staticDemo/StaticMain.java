package zpd.jdk8.lambda.staticDemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ada on 2017-9-27.
 */
public class StaticMain {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("z");
    list.add("p");
    list.add("d");

    list.forEach(StaticTest::print);
    list.forEach(System.out::println);
  }

}
