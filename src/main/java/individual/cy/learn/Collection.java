package individual.cy.learn;

import java.util.List;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 *
 * @author mystic
 * @date 2017/12/5 16:06
 */
public class Collection {
    public static void main(String[] args) {
        // The following collections are immutable and CANNOT append the new element
        Set<Integer> set = Set.of(1, 2, 12, 23, 3);
        List<String> list = List.of("hello", "world");
        System.out.println("set = " + set);
        System.out.println("list = " + list);
    }
}
