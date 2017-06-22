package zpd.xunhuan;

/**
 * Created by Ad on 2017-02-20.
 */
public class ForDemo {

	public static void main(String[] args) {
		test2();
	}

	public static void test1() {
		for (;;) {
			System.out.println("1");
		}
	}

	public static void test2() {
		int i = 5;
		int f = 0;
		for (;;) {
			if (i == f) {
				return;
			}
			System.out.println(f);
			f++;

		}
	}

}
