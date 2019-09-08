package xyz.snowflake.chapter02.example.sequentialsearch;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 14:44
 */
public class SequentialSearchTest {

    private final SequentialSearch search = new SequentialSearch();

    private int[] nums = new int[]{1, 2, 3, 4, 5};

    @Test
    public void sequentialSearch() {
        int target = 4;
        System.out.println(search.sequentialSearch(nums, target));
    }
}