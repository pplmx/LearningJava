package individual.cy.learn.hash;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.ToIntFunction;

/**
 * @author mystic
 */
public class Randomness {

    public static void main(String[] args) {
      /* System.out.printf("%-7s%16s%16s%16s%16s%16s%16s%n",
                "length", "String.hashCode", "Arrays.hashCode", "hashCode 109", "hashCode 251", "nativeHashCode", "Random.nextInt");
        for (int length = 1; length <= 16; length++) {
            System.out.printf("%-7d%16.2f%16.2f%16.2f%16.2f%16.2f%16.2f%n",
                    length,
                    randomnessScore(v -> new String(v, 0).hashCode(), length),
                    randomnessScore(Arrays::hashCode, length),
                    randomnessScore(HashCodeBenchmark::hashCode109, length),
                    randomnessScore(HashCodeBenchmark::hashCode251, length),
                    randomnessScore(HashCodeBenchmark::nativeHashCode, length),
                    randomnessScore(value -> ThreadLocalRandom.current().nextInt(), length));
        }*/

        for (int length : new int[]{1, 2, 4, 8, 20, 64}) {
            System.out.println("length: " + length);
            for (double[] dist : new double[][]{
                    randomnessDistribution(HashCodeBenchmark::hashCode31, length),
                    randomnessDistribution(Arrays::hashCode, length),
                    randomnessDistribution(HashCodeBenchmark::hashCode109, length),
                    randomnessDistribution(HashCodeBenchmark::nativeHashCode, length),
                    randomnessDistribution(value -> ThreadLocalRandom.current().nextInt(), length)}) {
                System.out.println(Arrays.toString(dist).replaceAll("(\\[|\\])", ""));
            }
        }

    }

    /*
    static double randomnessScore(ToIntFunction<byte[]> hashCode, int length) {
        Random random = new Random(length + 1);
        byte[] bytes = new byte[length];
        int score = 0;
        int tests = 0;
        for (int t = 0; t < 1000000; t += length) {
            for (int i = 0; i < length; i++)
                bytes[i] = (byte) (' ' + random.nextInt(96));
            int base = hashCode.applyAsInt(bytes);
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < 8; j++) {
                    bytes[i] ^= 1 << j;
                    int val = hashCode.applyAsInt(bytes);
                    int score2 = Integer.bitCount(base ^ val);
                    score += score2;
                    tests++;
                    bytes[i] ^= 1 << j;
                }
            }
        }
        return Math.round(100.0 * score / tests) / 100.0;
    }
    */

    static double[] randomnessDistribution(ToIntFunction<byte[]> hashCode, int length) {
        double[] dist = new double[33];
        Random random = new Random(length);
        byte[] bytes = new byte[length];
        int tests = 0;
        for (int t = 0; t < 1000000; t += length) {
            for (int i = 0; i < length; i++) {
                bytes[i] = (byte) (' ' + random.nextInt(96));
            }
            int base = hashCode.applyAsInt(bytes);

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < 8; j++) {
                    bytes[i] ^= 1 << j;
                    int val = hashCode.applyAsInt(bytes);
                    int score2 = Integer.bitCount(base ^ val);
                    dist[score2]++;
                    tests++;
                    bytes[i] ^= 1 << j;
                }
            }
        }
        for (int i = 0; i < dist.length; i++) {
            dist[i] = Math.round(1000.0 * dist[i] / tests) / 10.0;
        }
        return dist;
    }
}
