package xyz.snowflake.chapter03.example.bubblesort;

import xyz.snowflake.util.MathUtil;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-19 13:51
 */
public class BubbleSort {

    /**
     * 冒泡排序
     * 思想，首先遍历前n-1个元素，在从前往后扫描的过程中，如果前面的数比后面的数大，那么交换这两个数
     * 否者直接跳过。
     *
     * @param nums  int 数组
     */
    public void bubbleSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) MathUtil.swap(nums, j, j + 1);
            }
        }
    }

}
