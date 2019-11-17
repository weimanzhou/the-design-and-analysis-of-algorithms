package xyz.snowflake.chapter04.example.lomuto_partition;

import xyz.snowflake.util.MathUtil;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-26 14:43
 */
public class LomutoPartition {

    /**
     * 采用 Lomuto 算法，用第一个元素作为中轴对子数组进行划分
     *
     * @param nums 数组
     * @param i    起始下标
     * @param j    终止下标
     * @return 中轴的下标
     */
    public int lomutoPartition(int[] nums, int i, int j) {
        int p = nums[i];
        int s = i;
        for (int k = i + 1; k <= j; k++) {
            if (nums[k] >= p) {
                s++;
                MathUtil.swap(nums, s, k);
            }
        }
        MathUtil.swap(nums, i, s);
        return s;
    }


}
