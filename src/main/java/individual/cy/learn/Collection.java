package individual.cy.learn;

import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2017/12/5 16:06
 * @since: JDK9.0.1
 * @version: X
 * Description:
 */
public class Collection {
    public static void main(String[] args) {
        // 不可变,不可继续添加元素
        Set<Integer> set = Set.of(1,2,12,23,3);
        List<String> list = List.of("hello","world");
        System.out.println("set = " + set);
        System.out.println("list = " + list);
    }
}
