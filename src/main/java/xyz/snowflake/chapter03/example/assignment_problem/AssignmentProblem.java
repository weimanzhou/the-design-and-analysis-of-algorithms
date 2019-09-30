package xyz.snowflake.chapter03.example.assignment_problem;

import xyz.snowflake.util.MathUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-28 23:08
 */
public class AssignmentProblem {

    /**
     * 分配问题
     *
     * @param costs 每个人做不工作的的花费
     * @return      每个人做的工作的编号
     */
    public int[] assignmentProblem(int[][] costs) {
        List<int[]>  list = new ArrayList<>();
        int[] indexs = Stream
                .iterate(0, e -> e + 1)
                .limit(4)
                .mapToInt(Integer::intValue)
                .toArray();
        bt(list, indexs, 0);
        int[] ans = new int[indexs.length + 1];
        int minCost = Integer.MAX_VALUE;
        for (int[] arr : list) {
            int sum = 0;
            for (int i = 0; i < arr.length; i++)
                sum += costs[i][arr[i]];
            if (sum < minCost) {
                minCost = sum;
                System.arraycopy(arr, 0, ans, 0, arr.length);
            }
        }
        ans[ans.length - 1] = minCost;
        return ans;
    }

    /**
     * 利用回溯法求出排列
     *
     * @param ans       返回值，存储不同的排列
     * @param nums      下标数组
     * @param start     起始下标
     */
    private void bt(List<int[]> ans, int[] nums, int start) {
        if (start == nums.length) ans.add(nums.clone());
        for (int i = start; i < nums.length; i++) {
            MathUtil.swap(nums, start, i);
            bt(ans, nums, start + 1);
            MathUtil.swap(nums, start, i);
        }
    }

}
