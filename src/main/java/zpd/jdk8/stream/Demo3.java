package zpd.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Ada on 2017-8-10.
 */
public class Demo3 {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("zpd");
    list.add("ZYT");
    list.add("aDA");

    Stream stream = list.stream().filter(s -> s.length() > 1);
    Stream stream1 = list.stream().map(String::toLowerCase);
    Stream stream2 = list.stream().map(s -> s.charAt(0));

  }

}
