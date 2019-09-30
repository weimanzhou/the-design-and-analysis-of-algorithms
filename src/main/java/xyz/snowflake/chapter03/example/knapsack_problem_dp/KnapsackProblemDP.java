package xyz.snowflake.chapter03.example.knapsack_problem_dp;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-28 00:36
 */
public class KnapsackProblemDP {

    /**
     * 利用 dp 思想实现背包问题
     *
     * @param weights   物体的质量
     * @param values    物体的价值
     * @param w         背包容量
     * @return          以集合的形式返回背包所能装下的最大价值的物品（包括物品的质量和物品的价值）
     */
    public Map<Integer, Integer> knapsackProblemBF(int[] weights, int[] values, int w) {
        int[][] dp = new int[weights.length + 1][w + 1];
        for (int i = 1; i <= weights.length; i++) {
            for (int j = 1; j <= w; j++) {
                if (j < weights[i - 1]) dp[i][j] = dp[i][j - 1];
                else dp[i][j] = Math.max(dp[i - 1][j], values[i - 1] + dp[i - 1][j - weights[i - 1]]);
            }
        }
        System.out.println(dp[weights.length][w]);
        return null;
    }

}
