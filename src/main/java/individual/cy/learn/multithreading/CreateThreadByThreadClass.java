package individual.cy.learn.multithreading;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @version X
 * Description:
 * @date 2017/12/5 8:40
 * @since JDK9.0.1
 */
public class CreateThreadByThreadClass extends Thread {
    @Override
    public void run() {
        int loopTimes = 100;
        for (int i = 0; i < loopTimes; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
