package xyz.snowflake.chapter02.example.uniqueelements;

import java.util.Arrays;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 14:50
 */
public class UniqueElements {

    /**
     * 判断一个数组中元素的唯一性
     *
     * @param nums  数值数组
     * @return      如果数组中的元素都是唯一的返回 true，否则返回 false
     */
    public boolean uniqueElements(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) return false;
            }
        }
        return true;
    }

    public boolean uniqueElements2(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] ^ nums[i + 1]) == 0) return false;
        }
        return true;
    }

}
