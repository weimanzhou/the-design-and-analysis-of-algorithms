package xyz.snowflake.chapter03.example.selectsort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-19 13:31
 */
public class SelectSortTest {

    private final SelectSort ss = new SelectSort();

    @Test
    public void selectSort() {
        int[] nums = new int[]{2, 1, 4, 4, 2, 1, 7, 3};
        ss.selectSort(nums);
        System.out.println(Arrays.toString(nums));
    }

}