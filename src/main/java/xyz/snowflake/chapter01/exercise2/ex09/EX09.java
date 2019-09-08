package xyz.snowflake.chapter01.exercise2.ex09;

import java.util.Arrays;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 13:49
 */
public class EX09 {

    /**
     * 书上 14 页给的求数组中大小最接近的两个元素的差
     *
     * 时间复杂度：N^2
     *
     * @param nums  int 数组
     * @return      最接近两个元素的差
     */
    public int minDistance(int[] nums) {
        int min = Integer.MAX_VALUE;
        // N^2
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (i != j && Math.abs(nums[j] - nums[i]) < min) {
                    min = Math.abs(nums[j] - nums[i]);
                }
            }
        }
        return min;
    }


    /**
     * 书上 14 页给的求数组中大小最接近的两个元素的差
     *
     * 时间复杂度：N^2
     *
     * @param nums  int 数组
     * @return      最接近两个元素的差
     */
    public int minDistance2(int[] nums) {
        int min = Integer.MAX_VALUE;
        // N^2
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                min = Math.min(min, Math.abs(nums[j] - nums[i]));
            }
        }
        return min;
    }

    /**
     * 书上 14 页给的求数组中大小最接近的两个元素的差
     *
     * 时间复杂度：NlgN
     *
     * @param nums  int 数组
     * @return      最接近两个元素的差
     */
    public int minDistance3(int[] nums) {
        int min = Integer.MAX_VALUE;
        // NlgN
        Arrays.sort(nums);
        // N
        for (int i = 0; i < nums.length - 1; i++) {
            min = Math.min(nums[i + 1] - nums[i], min);
        }
        return min;
    }

//    /**
//     * 书上 14 页给的求数组中大小最接近的两个元素的差
//     *
//     * 时间复杂度：NlgN
//     *
//     * @param nums  int 数组
//     * @return      最接近两个元素的差
//     */
//    public int minDistance4(int[] nums) {
//        int min = Integer.MAX_VALUE;
//        // NlgN
//        Arrays.sort(nums);
//        // N
//        for (int i = 0; i < nums.length - 1; i++) {
//            min = Math.min(nums[i + 1] - nums[i], min);
//        }
//        return min;
//    }


}
