package zpd.xiancheng.thread;

/**
 * Created by Ad on 2016-11-07.
 */
public class ThreadDemo extends Thread {

	private String threadName = "";

	public ThreadDemo(String threadName) {
		this.threadName = threadName;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(threadName + "执行线程" + i + "次");
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("执行完毕");
	}
}

class ThreadMain {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadDemo("rd1"), "rd1");
		t1.start();
		Thread t2 = new Thread(new ThreadDemo("rd2"), "rd2");
		t2.start();
	}

}
