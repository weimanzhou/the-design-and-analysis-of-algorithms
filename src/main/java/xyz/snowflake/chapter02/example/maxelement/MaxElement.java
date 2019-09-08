package xyz.snowflake.chapter02.example.maxelement;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 14:47
 */
public class MaxElement {

    /**
     * 求数组中的最大值
     *
     * @param nums  数值数组
     * @return      数组中的最大值
     */
    public int maxElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        return max;
    }

}
