package zpd.jdk8.lambda;

/**
 * Created by Ada on 2017-8-7.
 */
public class Demo3 implements Interface3, Interface31 {

  @Override
  public String getId() {
    return null;
  }

  @Override
  public String getName() {
    return Interface3.super.getName(); // 接口中有相同的默认方法，需要手工指定
  }
}

interface Interface3 {

  default String getName() {
    return "Interface3";
  }

}

interface Interface31 {

  String getId();

  default String getName() {
    return "Interface31";
  }
}
