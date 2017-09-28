package zpd.jdk8.lambda.forDemo;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Ada on 2017-9-27.
 */
public class Demo1 {

  public static void main(String[] args) {

    List<Integer> integerList = Arrays.asList(1,2,3,4,5);
    integerList.forEach(integer -> {
      if(integer.equals(3)){
        return;
      }
      System.out.println(integer);
    });


  }

}
