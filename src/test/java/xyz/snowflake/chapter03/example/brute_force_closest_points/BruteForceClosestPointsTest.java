package xyz.snowflake.chapter03.example.brute_force_closest_points;

import org.junit.Test;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-27 22:23
 */
public class BruteForceClosestPointsTest {

    private final BruteForceClosestPoints brute = new BruteForceClosestPoints();

    @Test
    public void bruteForceClosestPoints() {
        int[][] nums = {
                {1, 2},
                {3, 1},
                {4, 4}
        };

        double minDis = brute.bruteForceClosestPoints(nums);
        System.out.println("min distance ==> " + minDis);
    }

}