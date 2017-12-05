package individual.cy.learn;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import individual.cy.learn.multithreading.CreateThreadByCallableInterface;
import individual.cy.learn.multithreading.CreateThreadByRunnableInterface;
import individual.cy.learn.multithreading.CreateThreadByThreadClass;

import java.util.concurrent.*;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2017/12/1 15:20
 * @since: JDK9.0.1
 * @version: X
 * Description:
 */
public class Java {

    /**
     * 创建线程池
     */
    private static ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat("pool-%d").build();
    private static ExecutorService executorService = new ThreadPoolExecutor(5, 200, 0L,
            TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>(1024), threadFactory, new ThreadPoolExecutor.AbortPolicy());

    public static void main(String[] args) {
        int loopTimes = 100;
        //testThread(loopTimes);
        testRunnable(loopTimes);
        //testCallable(loopTimes);
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

    private static void testRunnable(int loopTimes) {
        for (int i = 0; i < loopTimes; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            if (i == 30) {
                CreateThreadByRunnableInterface myRunnable = new CreateThreadByRunnableInterface();
                // 不要显示创建线程,通过线程池创建
                executorService.execute(myRunnable);
                executorService.execute(myRunnable);
                executorService.shutdown();
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
