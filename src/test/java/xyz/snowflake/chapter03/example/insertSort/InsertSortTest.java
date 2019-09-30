package xyz.snowflake.chapter03.example.insertSort;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-19 13:59
 */
public class InsertSortTest {

    private final InsertSort is = new InsertSort();

    @Test
    public void insertSort() {
        int[] nums = new int[]{2, 3, 3, 2, 1, 2, 3, 3};
        is.insertSort(nums);
        System.out.println(Arrays.toString(nums));
    }
}