package xyz.snowflake.chapter02.example.sequentialsearch;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 14:43
 */
public class SequentialSearch {

    public int sequentialSearch(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;
        }
        return -1;
    }

}
