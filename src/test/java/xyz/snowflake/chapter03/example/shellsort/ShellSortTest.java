package xyz.snowflake.chapter03.example.shellsort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-19 14:18
 */
public class ShellSortTest {

    private final ShellSort ss = new ShellSort();

    @Test
    public void shellSort() {
        int[] nums = new int[]{2, 1, 3, 4, 2, 1, 6, 8, 2};
        ss.shellSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}