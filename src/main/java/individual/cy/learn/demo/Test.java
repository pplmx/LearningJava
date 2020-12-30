package individual.cy.learn.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author mystic
 */
public class Test {
    public static void main(String[] args) {
        List<Integer> randomList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            randomList.add(rand.nextInt(10));
        }
        Map<Integer, Long> countMap = randomList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        countMap.forEach((k, v) -> System.out.println("k=" + k + ", v=" + v));
    }
}
