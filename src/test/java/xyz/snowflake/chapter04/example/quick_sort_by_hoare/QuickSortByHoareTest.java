package xyz.snowflake.chapter04.example.quick_sort_by_hoare;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-19 14:52
 */
public class QuickSortByHoareTest {

    private final QuickSortByHoare quickSort = new QuickSortByHoare();

    @Test
    public void quickSort() {
        int[] nums = {/*1, 3, 2, 6, 5, 4, 9, 8, 7, 0, 2, 3, 4, 5, 6*/3, 1, 2};
        quickSort.quickSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}