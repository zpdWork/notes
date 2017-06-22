package zpd.xiancheng;

import zpd.xiancheng.thread.ThreadAlive;

/**
 * Created by Ad on 2016-11-23.
 */
public class Ada {

	public static void threadAlive() {
		ThreadAlive ta = new ThreadAlive();
		ta.setName("thread-ada");
		System.out.println("线程运行前：" + ta.getName() + " " + ta.isAlive());
		ta.start();
		for (int i = 0; i < 10; i++) {
			ta.printThreadAlive();
		}
		System.out.println("线程运行后：" + ta.getName() + " " + ta.isAlive());
	}

	public static void setPriority() {
		System.out.println("setPriority 设置线程优先级setPriority");
	}

	public static void threadInterrupt() {
		System.out.println("终止线程，自带的stop方法是不安全的。使用thread.interrupt(); thread.join(); (isInterrupted() 方法来判断线程是否已中断：)");
	}

	/**
	 * 获取所有线程.
	 */
	public static void getThreadAliveGroup() {
		ThreadGroup threadGroup = Thread.currentThread().getThreadGroup();
		int activeCount = threadGroup.activeCount();
		Thread[] t = new Thread[activeCount];
		threadGroup.enumerate(t);
		for (int i = 0; i < activeCount; i++) {
			System.out.println("getThreadAliveGroup线程号：" + t[i].getName());
		}
	}

	public static void getThreadState() {
		Thread thread = Thread.currentThread();
		System.out.println("getThreadState线程存活状态：" + thread.isAlive());
		System.out.println("getThreadState线程状态：" + thread.getState());
	}

	public static void main(String[] args) {
		threadAlive();
		setPriority();
		threadInterrupt();
		getThreadAliveGroup();
		getThreadState();
	}

}
