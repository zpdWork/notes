package zpd.abstractDemo.demo2;

/**
 * Created by Ad on 2017-02-15.
 */
public class Ada {

	public static void main(String[] args) {

		SuperC sc = new Sub();
		sc.testM();
		sc.getName();

		SuperC sc2 = new Sub2();
		sc2.testM();
		sc2.getName();

	}

}
