package xyz.snowflake.chapter03.example.shellsort;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-19 14:06
 */
public class ShellSort {

    public void shellSort(int[] nums) {
        // 最外层循环是步进的值
        for (int step = nums.length / 2; step >= 1; step >>= 1) {
            // 次层循环为 步进值，循环内部为插入排序的值
            for (int i = step; i < nums.length; i++) {
                int tempValue = nums[i];
                int index = i - step;
                // 由于 nums[i] 位置的值会被覆盖，所以比较的时候不能每次重新取下标值进行比较
                while (index >= 0 && tempValue < nums[index]) {
                    nums[index + step] = nums[index];
                    index -= step;
                }
                // index 为需要插入的位置的前 step 位置，所以赋值时要恢复位置
                nums[index + step] = tempValue;
            }
        }
    }

}
