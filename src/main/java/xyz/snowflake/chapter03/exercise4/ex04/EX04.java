package xyz.snowflake.chapter03.exercise4.ex04;

import xyz.snowflake.util.MathUtil;

import java.util.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-24 20:54
 */
public class EX04 {

    /**
     * 实现生成排列的heap算法
     *
     * @param n    一个正整数 n
     * @param nums 一个全局数组
     */
    public void heapPermute(int n, int[] nums) {
        if (n == 1)
            System.out.println(Arrays.toString(nums));
        else
            for (int i = 0; i < n; i++) {
                heapPermute(n - 1, nums);
                // System.out.println("===>> " + n);
                if ((n & 1) == 1) MathUtil.swap(nums, 0, n - 1);
                else MathUtil.swap(nums, i, n - 1);
            }
    }

}

