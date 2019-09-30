package xyz.snowflake.chapter03.example.knapsack_problem_dp;

import org.junit.Test;
import xyz.snowflake.chapter03.example.knapsack_problem_bf.KnapsackProblemBF;

import java.util.ArrayList;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-28 13:36
 */
public class KnapsackProblemDPTest {

    private final KnapsackProblemDP dp = new KnapsackProblemDP();

    @Test
    public void knapsackProblemBF() {
        int[] weights = {1, 2, 3, 3, 4, 2};
        int[] values = {2, 3, 1, 4, 2, 3};
        int w = 10;
        dp.knapsackProblemBF(weights, values, w);
//        Map<Integer, Integer> map = bf.knapsackProblemBF(weights, values, w);
//        for (Map.Entry<Integer, Integer> entry : map.entrySet())
//            System.out.println("weight: " + entry.getKey() + "  value: " + entry.getValue());
//        System.out.println("sum of value: " + new ArrayList<>(map.entrySet())
//                .stream()
//                .map(Map.Entry::getValue)
//                .mapToInt(e -> e)
//                .sum());
    }
}