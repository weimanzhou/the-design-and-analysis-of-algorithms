package xyz.snowflake.chapter03.example.quicksort;

import xyz.snowflake.util.MathUtil;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-19 14:37
 */
public class QuickSort {

    public void quickSort(int[] nums) {
        quickSort(nums, 0 , nums.length - 1);
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left >= right || nums == null || nums.length <= 1) return;
        int i = left, j = right, mid = left + right >> 1;
        int midValue = nums[mid];
        while (i < j) {
            while (nums[j] > midValue) j--;
            while (nums[i] < midValue) i++;
            if (i < j) {
                MathUtil.swap(nums, i, j);
                i++;
                j--;
            } else if (i == j) i++;
        }
        quickSort(nums, left, j);
        quickSort(nums, i, right);
    }

}
