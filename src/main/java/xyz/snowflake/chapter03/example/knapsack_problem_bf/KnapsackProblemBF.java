package xyz.snowflake.chapter03.example.knapsack_problem_bf;

import xyz.snowflake.util.MathUtil;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-28 00:36
 */
public class KnapsackProblemBF {

    /**
     * 背包问题
     *
     * @param weights   物体质量数组
     * @param values    物体价值数组
     * @param w         背包容量
     * @return          背包所能装的最大值的物品的集合（质量和价值）
     */
    public Map<Integer, Integer> knapsackProblemBF(int[] weights, int[] values, int w) {
        List<int[]> list = new ArrayList<>();
        // 生成一个下标数组
        int[] temp = new int[weights.length];
        for (int i = 0; i < temp.length; i++) temp[i] = i;
        bt(list, temp);
        List<Integer> ans = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        int maxValue = Integer.MIN_VALUE;
        for (int[] arr : list) {
            int weight = 0;
            int value = 0;
            for (int ww : arr) {
                weight += weights[ww];
                value += values[ww];
            }
            if (weight > max && weight <= w && value > maxValue) {
                max = weight;
                maxValue = value;
                ans.clear();
                ans.addAll(Arrays.stream(arr).boxed().collect(Collectors.toList()));
            }
        }
        // 然后对这个下标集合进行处理
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer index : ans)
            map.put(weights[index], values[index]);
        return map;
    }

    /**
     * 或者数组的排列组合，以集合的形式返回
     *
     * @param ans   返回集合
     * @param nums  一维数组
     */
    public void bt(List<int[]> ans, int [] nums) {
        for (int i = 1; i <= Math.pow(nums.length, 2); i++) {
            List<Integer> list = new ArrayList<>();
            int j = 0;
            while ((1 << j) <= i) {
                if (((1 << j) & i) != 0) list.add(nums[j]);
                j++;
            }
            ans.add(new ArrayList<>(list).stream().mapToInt(Integer::valueOf).toArray());
        }
    }

}
