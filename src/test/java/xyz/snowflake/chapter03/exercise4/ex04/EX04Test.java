package xyz.snowflake.chapter03.exercise4.ex04;

import org.junit.Test;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-24 20:59
 */
public class EX04Test {

    private final EX04 ex = new EX04();

    @Test
    public void heapPermute() {
        int[] nums2 = new int[]{1, 2};
        int[] nums3 = new int[]{1, 2, 3};
        int[] nums4 = new int[]{1, 2, 3, 4};

        System.out.println("==============2==============");
        ex.heapPermute(nums2.length, nums2);

        System.out.println("==============3==============");
        ex.heapPermute(nums3.length, nums3);

        System.out.println("==============4==============");
        ex.heapPermute(nums4.length, nums4);

    }
}