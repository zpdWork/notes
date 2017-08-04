package zpd.xiancheng.executor;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 *
 * Created by Ad on 2017-02-15.
 */
public class Ada {

	public static void main(String[] args) throws ExecutionException, InterruptedException {

		// 初始化一个指定大小的线程池。
		Executor ada1 = Executors.newFixedThreadPool(7);
		ada1.execute(new Runnable() {
			@Override
			public void run() {

			}
		});

		ExecutorService ada2 = Executors.newFixedThreadPool(7);
        String ada2Str = ada2.submit(new Callable<String>() {
            public String call() {
                return "";
            }
        }).get();

	}

}
