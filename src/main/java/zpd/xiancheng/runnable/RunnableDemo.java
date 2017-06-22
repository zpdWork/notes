package zpd.xiancheng.runnable;

/**
 * Created by Ad on 2016-11-07.
 */
public class RunnableDemo implements Runnable {

	private String threadName = "";

	public RunnableDemo(String threadName) {
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

class RunMain {
	public static void main(String[] args) {

        RunnableDemo rd1 = new RunnableDemo("rd1");
        //rd1.run();
        Thread t1 = new Thread(rd1);
        t1.start();
		RunnableDemo rd2 = new RunnableDemo("rd2");
		//rd2.run();
        Thread t2 = new Thread(rd2);
        t2.start();
	}
}
