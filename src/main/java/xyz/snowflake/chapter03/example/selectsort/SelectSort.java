package xyz.snowflake.chapter03.example.selectsort;

import org.junit.Test;
import xyz.snowflake.util.MathUtil;

import java.util.Arrays;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-19 13:22
 */
public class SelectSort {

    /**
     * 选择排序
     * 由于选择排序的思想是在指定的范围内选出最大值，并且与当前范围内最后一个元素进行交换
     * 然后继续这一步，但是要排除已经找到的最大值，目前这个算法是每次找出一个最大值，放在后面
     * ，也可以每次找出最小值放在前面。
     *
     * @param nums int 数组
     */
    public void selectSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int max = 0;
            for (int j = 1; j < nums.length - i; j++)
                if (nums[j] > nums[max]) max = j;
            // 交换
            MathUtil.swap(nums, max, nums.length - 1 - i);
        }
    }

}
