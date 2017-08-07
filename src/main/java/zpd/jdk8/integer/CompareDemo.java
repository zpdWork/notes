package zpd.jdk8.integer;

/**
 * Created by Ada on 2017-8-7.
 */
public class CompareDemo {

  public static void main(String[] args) {

    compareInt();

    compareInteger();

  }

  private static void compareInt() {
    int a1 = 5;
    int a2 = 5;
    System.out.println(a1 == a2); // true
    int aa1 = 127;
    int aa2 = 127;
    System.out.println(aa1 == aa2); // true
    int aaa1 = 200;
    int aaa2 = 200;
    System.out.println(aaa1 == aaa2); // true
  }

  private static void compareInteger() {
    Integer a1 = 5;
    Integer a2 = 5;
    System.out.println(a1 == a2); // true
    Integer aa1 = 127;
    Integer aa2 = 127;
    System.out.println(aa1 == aa2); // true
    Integer aaa1 = 128;
    Integer aaa2 = 128;
    System.out.println(aaa1 == aaa2); // false integer缓存池，大于127就不能使用==
    System.out.println(Integer.compare(aaa1, aaa2)); // aaa1 = aaa2 0;aaa1 < aaa2 负数;aaa1 > aaa3 正数；
    System.out.println(Integer.compare(aaa1, aaa2) ==0 ); // aaa1 = aaa2 0;aaa1 < aaa2 负数;aaa1 > aaa3 正数；
    System.out.println(aaa1.equals(aaa2)); // true
  }

}
