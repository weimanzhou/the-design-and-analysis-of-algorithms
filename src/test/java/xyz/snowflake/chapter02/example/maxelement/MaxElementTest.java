package xyz.snowflake.chapter02.example.maxelement;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 14:48
 */
public class MaxElementTest {

    private final MaxElement maxElement = new MaxElement();

    private int[] nums = new int[]{1, 2, 3, 4, -2, -3};

    @Test
    public void maxElement() {
        System.out.println("max:" + maxElement.maxElement(nums));
    }

}