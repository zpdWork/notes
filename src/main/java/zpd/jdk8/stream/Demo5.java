package zpd.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Ada on 2017-8-11.
 */
public class Demo5 {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("ada");
    list.add("Ada");
    Stream<String> stream = list.stream(); // 延迟操作
    list.add("zpd");
    System.out.println(stream.count()); // 遇到终止操作，才会执行

    // 干扰了。
    // Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
//    stream.forEach(s -> {
//      if(s.equals("ada")){
//        list.remove(s);
//      }
//    } );


  }

}
