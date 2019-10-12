package xyz.snowflake.chapter04.example.quick_sort;

import xyz.snowflake.chapter04.example.lomuto_partition.LomutoPartition;

import java.util.Arrays;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-12 13:39
 */
public class QuickSort {

    /**
     * 快速排序
     *
     * @param arr   待排序的数组
     */
    public void quickSort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    /**
     * 基于 Lomuto 算法编写快速排序
     *
     * @param arr   待排序数组
     * @param i     起始下标
     * @param j     终止下标
     */
    private void quickSort(int[] arr, int i, int j) {
        int s = new LomutoPartition().lomutoPartition(arr, i, j);
        System.out.println(Arrays.toString(arr));
        if (s - i >= 2) quickSort(arr, i, s - 1);
        if (j - s >= 2) quickSort(arr, s + 1, j);
    }

}
