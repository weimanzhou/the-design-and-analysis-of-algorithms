package xyz.snowflake.chapter04.example.quick_select;

import xyz.snowflake.chapter04.example.lomuto_partition.LomutoPartition;

import java.util.Arrays;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-26 14:46
 */
public class QuickSelect {

    /**
     * 用基于划分的递归算法解决选择问题,返回中位数
     *
     * @param nums  整型数组
     * @param i     起始下标
     * @param j     终止下标
     * @param k     整数 k（i<=k<=j-i+1）
     * @return      第k个最小元素
     */
    public int quickSelect(int[] nums, int i , int j, int k) {
        int s = new LomutoPartition().lomutoPartition(nums, i, j);
        if (s == i + k - 1) return nums[s];
        else if (s > i + k - 1) return quickSelect(nums, i, s -1, k);
        else return quickSelect(nums, s + 1, j, i + k - 1 - s);
    }

}
