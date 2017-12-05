package individual.cy.learn.multithreading;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2017/12/5 8:52
 * @since: JDK9.0.1
 * @version: X
 * Description:
 */
public class CreateThreadByRunnableInterface implements Runnable {
    @Override
    public void run() {
        int loopTimes = 100;
        for (int i = 0; i < loopTimes; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
