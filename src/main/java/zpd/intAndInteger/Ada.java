package zpd.intAndInteger;

/**
 * Created by Ad on 2017-02-20.
 */
public class Ada {

	public static void main(String[] args) {
		test1();
		test2();
	}

	private static void test1() {
		int i1 = 126;
		Integer i2 = 128;
		Integer i3 = 126;
		Integer i4 = 128;
		Integer i5 = 126;
		System.out.println("test1   i1 == i2:" + (i1 == i2)); // false
		System.out.println("test1   i1 == i3:" + (i1 == i3)); // true
		System.out.println("test1   i2 == i3:" + (i2 == i3)); // false
		System.out.println("test1   i2 == i4:" + (i2 == i4)); // false // true 大于127是new Integer；小于等于127从缓存中取
		System.out.println("test1   i3 == i4:" + (i3 == i4)); // false
		System.out.println("test1   i3 == i5:" + (i3 == i5)); // true

	}

	private static void test2() {
		Integer i1 = 123;
		Integer i2 = 123;
		System.out.println("test2   i1 == i2:" + (i1 == i2));
	}

}
