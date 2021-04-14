package individual.cy.learn.demo;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
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
    private Random rand;

    public Test() {
        try {
            rand = SecureRandom.getInstanceStrong();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Test tt = new Test();
        int uniq = tt.filterUnique(new int[]{1, 2, 3, 4, 4, 3, 2});
        System.out.println(uniq);
    }

    public int filterUnique(int[] nums) {
        int retNum = 0;
        for (int num : nums) {
            retNum ^= num;
        }
        return retNum;
    }

    public void streamTest() {
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            randomList.add(rand.nextInt(10));
        }
        Map<Integer, Long> countMap = randomList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        countMap.forEach((k, v) -> System.out.println("k=" + k + ", v=" + v));
    }
}
