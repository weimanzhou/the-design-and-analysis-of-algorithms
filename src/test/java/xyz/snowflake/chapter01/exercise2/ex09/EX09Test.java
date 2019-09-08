package xyz.snowflake.chapter01.exercise2.ex09;

import org.junit.Test;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 13:56
 */
public class EX09Test {

    private final EX09 ex = new EX09();

    private final int[] nums = new int[]{1, 3, -2, -3, 0, 9, 6, 8};

    @Test
    public void minDistance() {
        System.out.println(ex.minDistance(nums));
    }

    @Test
    public void minDistance2() {
        System.out.println(ex.minDistance2(nums));
    }

    @Test
    public void minDistance3() {
        System.out.println(ex.minDistance3(nums));
    }

}