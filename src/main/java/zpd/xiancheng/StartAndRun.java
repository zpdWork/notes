package zpd.xiancheng;

/**
 * start() : 它的作用是启动一个新线程，新线程会执行相应的run()方法。start()不能被重复调用。 run() :
 * .start()会启动一个新线程，并在新线程中运行run()方法。
 * run()就和普通的成员方法一样，可以被重复调用。单独调用run()的话，会在当前线程中执行run()，而并不会启动新线程！
 * .run()则会直接在当前线程中运行run()方法，并不会启动一个新线程来运行run()。
 * 
 * Created by Ad on 2017-02-26.
 */
public class StartAndRun implements Runnable {

	private String str;

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	StartAndRun(String str) {
		this.str = str;
	}

	@Override
	public void run() {
		System.out.println(str);
	}
}

class TestMain {
	public static void main(String[] args) {
        StartAndRun sar = new StartAndRun("start");
        sar.run();
	}
}
