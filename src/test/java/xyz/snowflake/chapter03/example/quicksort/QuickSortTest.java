package xyz.snowflake.chapter03.example.quicksort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-19 14:40
 */
public class QuickSortTest {

    private final QuickSort qs = new QuickSort();

    @Test
    public void quickSort() {
        int[] nums = new int[]{2, 1, 3, 4, 5, 6, 7, 2, 1, 4};
        qs.quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}