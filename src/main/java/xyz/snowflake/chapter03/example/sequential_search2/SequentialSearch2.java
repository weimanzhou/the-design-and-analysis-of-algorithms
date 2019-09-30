package xyz.snowflake.chapter03.example.sequential_search2;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-27 21:37
 */
public class SequentialSearch2 {

    /**
     * 顺序查找的算法实现，它用例查找键来作限位器
     *
     * @param nums      整型数组
     * @param target    目标值
     * @return          目标值在整形数组中的下标
     */
    public int sequentialSearch2(int[] nums, int target) {
        int n = nums.length;
        if (nums[n - 1] == target) return n - 1;
        nums[n - 1] = target;
        int i = 0;
        while (nums[i] != target)
            i++;
        if (i == n- 1) return -1;
        return i;
    }


}
