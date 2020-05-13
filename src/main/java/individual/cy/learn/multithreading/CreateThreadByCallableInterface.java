package individual.cy.learn.multithreading;

import java.util.concurrent.Callable;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @version X
 * Description:
 * @date 2017/12/5 8:53
 * @since JDK9.0.1
 */
public class CreateThreadByCallableInterface implements Callable<Integer> {
    @Override
    public Integer call() {
        int sum = 0, loopTimes = 100;
        for (int i = 0; i < loopTimes; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            sum += i;
        }
        return sum;
    }
}
