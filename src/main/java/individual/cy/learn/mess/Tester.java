package individual.cy.learn.mess;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2017/12/26 13:41
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
public class Tester {

    public static void main(String[] args) {
        int loop = 10;
        Set<Student> set = new HashSet<>(16);
        for (int i = 0; i < loop; i++) {
            Student s = new Student();
            if (i == 6) {
                s.setId(i);
                s.setAge(16);
                continue;
            }
            s.setId(i+1);
            s.setAge(16);
            set.add(s);
        }
        System.out.println("set = " + set);
        System.out.println("set.size() = " + set.size());
    }

}
