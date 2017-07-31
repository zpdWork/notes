package zpd.xunhuan;

/**
 * 多重循环，采用 标签 直接全部跳出.
 *
 * Created by Ada on 2017-7-31.
 */
public class TagDemo {

  private static void forTest() {
    int ada = 100;
    int ada1 = 3;

    breakTag:
    for (int i = 0; i < ada; i++) {
      System.out.println("-----------" + i + "-----------");
      for (int i1 = 0; i1 < ada1; i1++) {
        if (i == 9) {
          break breakTag;
        }
        System.out.println(i1);
      }

    }

  }

  public static void main(String[] args) {
    forTest();
  }

}
