package xyz.snowflake.chapter02.example.uniqueelements;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 14:53
 */
public class UniqueElementsTest {

    private final UniqueElements uniqueElements = new UniqueElements();

    private int[] nums = {1, 2, 3, 4};
    private int[] nums2 = {1, 2, 3, 4, 4};

    @Test
    public void uniqueElements() {
        System.out.println("nums : " + uniqueElements.uniqueElements(nums));
        System.out.println("nums2 : " + uniqueElements.uniqueElements(nums2));
    }
}