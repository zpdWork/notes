package zpd.xunhuan;

/**
 * Created by Ad on 2016-11-09.
 */
public class Ada {

	/**
	 * break 直接强行退出当前的循环.
	 */
	private static void breakFor() {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			}
			System.out.println("breakFor:" + i);
		}
	}

	/**
	 * continue 结束当前循环，并进入下一次循环.
	 */
	private static void continueFor() {
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println("continueFor:" + i);
		}
	}

	public static void sumNumber(Integer ii) {
		int sum = 0;
		for (Integer i = 1; i <= ii; i++) {
			sum += i;
		}
		System.out.println("sumNumber:" + sum);
	}

	public static void main(String[] args) {
		breakFor();
		continueFor();
		sumNumber(100);
	}

}
