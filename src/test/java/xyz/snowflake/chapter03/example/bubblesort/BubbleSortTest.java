package xyz.snowflake.chapter03.example.bubblesort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-19 13:55
 */
public class BubbleSortTest {

    private final BubbleSort bs = new BubbleSort();

    @Test
    public void bubbleSort() {
        int[] nums = new int[]{2, 3, 1, 3, 4, 2, 2, 1, 4};
        bs.bubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}