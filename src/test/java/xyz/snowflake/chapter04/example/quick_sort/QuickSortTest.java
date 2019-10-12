package xyz.snowflake.chapter04.example.quick_sort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-12 13:55
 */
public class QuickSortTest {

    private final QuickSort qs = new QuickSort();

    @Test
    public void quickSort() {
        int[] arr = {2, 1, 4, 2, 1, 9, 3, 7};
        int[] arr2 = {5, 6, 8, 1, 354, 513, 47, 384, 9};
        qs.quickSort(arr2);
        System.out.println(Arrays.toString(arr2));
    }

}