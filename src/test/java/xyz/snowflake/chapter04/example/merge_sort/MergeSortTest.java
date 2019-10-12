package xyz.snowflake.chapter04.example.merge_sort;

import org.junit.Test;
import xyz.snowflake.chapter05.example.merge_sort.MergeSort;

import java.util.Arrays;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-10 14:04
 */
public class MergeSortTest {

    private final MergeSort mergeSort = new MergeSort();

    @Test
    public void mergeSort() {
        int[] nums = {8, 3, 2, 9, 7, 1, 5, 4};
        mergeSort.mergeSort(nums);
        System.out.println(Arrays.toString(nums));

        nums = new int[]{8, 3, 2, 9, 7, 1, 5, 4, 2};
        mergeSort.mergeSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}