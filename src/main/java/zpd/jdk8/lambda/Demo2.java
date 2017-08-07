package zpd.jdk8.lambda;

/**
 * Created by Ada on 2017-8-7.
 */
public class Demo2 {

  private void doWork() {
    Runnable runnable = () -> {
      System.out.println(this.toString()); // 调用的Demo2方法
    };
    new Thread(runnable).start();
  }

  @Override
  public String toString() {
    return "Demo2{}";
  }

  public static void main(String[] args) {
    Demo2 demo2 = new Demo2();
    demo2.doWork();
  }
}
