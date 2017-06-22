package zpd.xiancheng.thread;

/**
 * Created by Ad on 2016-11-23.
 */
public class ThreadAlive extends Thread{

	public void run() {
		for (int i = 0; i < 10; i++) {
			printThreadAlive();
		}
	}

	public void printThreadAlive() {
		// ThreadAlive threadAlive = new ThreadAlive();
		// threadAlive.setName("thread-ada");
		// threadAlive.run();
		Thread thread = Thread.currentThread();
		System.out.println("当前线程name：" + thread.getName());
	}

}
