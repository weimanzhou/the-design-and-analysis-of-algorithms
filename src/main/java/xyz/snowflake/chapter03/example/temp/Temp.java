package xyz.snowflake.chapter03.example.temp;

import xyz.snowflake.util.MathUtil;

import java.util.Arrays;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-25 15:05
 */
public class Temp {

    public void temp(int[] nums) {
        // 定义一个状态数组
        // false 表示箭头向左
        // true  表示箭头向右
        boolean[] leftOrRight = new boolean[nums.length];

        for (int i = 0; i < MathUtil.a(nums.length)  - 1; i++) {
            System.out.println(Arrays.toString(nums));
            // 查找最大的并且，他所指向的下标对应的值比他小
            int max = -1;
            int maxValue = Integer.MIN_VALUE;
            for (int j = 0; j < leftOrRight.length; j++) {
                if (nums[j] > maxValue) {
                    // 指向右边
                    if (leftOrRight[j] && j + 1 < nums.length && nums[j + 1] < nums[j]) {
                        max = j;
                        maxValue = nums[max];
                    } else if (!leftOrRight[j] && j - 1 >= 0 && nums[j] > nums[j - 1]) {
                        max = j;
                        maxValue = nums[max];
                    }
                }
            }

            // 获取交换目标下标
            int index = leftOrRight[max] ? max + 1 : max - 1;

            // 这个时候需要交换
            MathUtil.swap(nums, max, index);
            // 状态值也要交换
            MathUtil.swap(leftOrRight, max, index);

            // 修改剩下的状态
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > maxValue)
                    leftOrRight[j] = !leftOrRight[j];
            }

        }

    }

}
