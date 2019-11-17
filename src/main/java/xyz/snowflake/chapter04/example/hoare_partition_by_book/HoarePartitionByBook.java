package xyz.snowflake.chapter04.example.hoare_partition_by_book;

import xyz.snowflake.util.MathUtil;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-19 15:16
 */
public class HoarePartitionByBook {

    /**
     * hoare 划分，根据书上的伪代码编写
     *
     * @param nums  待划分的数组
     * @param start 起始下标
     * @param end   终止下标
     * @return      划分的位置
     */
    public int hoarePartitionByBook(int[] nums, int start, int end) {
        int val = nums[start];
        int left = start;
        int right = end + 1;
        // 如果是 3， 1， 2
        // 那么在最后一次循环时， left =
        do {
            do {
                left++;
            } while (nums[left] < val);
            do {
                right--;
            } while (nums[right] > val);
            MathUtil.swap(nums, left, right);
        } while (left < right);
        MathUtil.swap(nums, left, right);
        MathUtil.swap(nums, start, right);
        return right;
    }

}
