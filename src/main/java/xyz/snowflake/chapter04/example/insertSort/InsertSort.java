package xyz.snowflake.chapter04.example.insertSort;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-19 13:56
 */
public class InsertSort {

    /**
     * 插入排序
     * 一共要进行 n - 1 次循环，刚开始假设第一个元素是排序好的
     *
     * @param nums  int 数组
     */
    public void insertSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int index = i - 1;
            int tempValue = nums[i];
            while (index >= 0 && nums[index] > nums[i]) index--;
            // 循环完毕后找到了元素需要放置的位置，
            System.arraycopy(nums, index + 1, nums, index + 2, i - index - 1);
            nums[index + 1] = tempValue;
        }
    }

}
