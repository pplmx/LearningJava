package individual.cy.learn.multithreading;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @date 2017/12/5 16:00
 */
public class Tester {


    /**
     * 创建线程池
     */
    private static final ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("pool-%d").build();
    private static final ExecutorService executorService = new ThreadPoolExecutor(5, 200, 0L,
            TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(1024), threadFactory, new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        int loopTimes = 100;
        //testThread(loopTimes);
        testRunnable(loopTimes);
        //testCallable(loopTimes);
    }

    private static void testRunnable(int loopTimes) {
        for (int i = 0; i < loopTimes; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                CreateThreadByRunnableInterface myRunnable = new CreateThreadByRunnableInterface();
                // Do NOT create thread directly, please create it by threadpool
                executorService.execute(myRunnable);
                executorService.execute(myRunnable);
                executorService.shutdown();
            }
        }
    }

    private static void testThread(int loopTimes) {
        for (int i = 0; i < loopTimes; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                Thread thread1 = new CreateThreadByThreadClass();
                Thread thread2 = new CreateThreadByThreadClass();
                thread1.start();
                thread2.start();
            }
        }
    }

    private static void testCallable(int loopTimes) {
        for (int i = 0; i < loopTimes; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                Callable<Integer> myCallable = new CreateThreadByCallableInterface();
                FutureTask<Integer> futureTask = new FutureTask<>(myCallable);
                executorService.submit(futureTask);
                executorService.shutdown();
            }
        }
    }
}
