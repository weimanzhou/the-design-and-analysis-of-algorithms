package xyz.snowflake.chapter04.example.quick_sort_by_hoare;

import xyz.snowflake.chapter04.example.hoare_partition.HoarePartition;
import xyz.snowflake.chapter04.example.lomuto_partition.LomutoPartition;

import java.util.Arrays;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-12 14:40
 */
public class QuickSortByHoare {

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
        if (i >= j) return;
        int s = new HoarePartition().hoarePartition(arr, i, j);
        quickSort(arr, i, s);
        quickSort(arr, s + 1, j);
    }

}
