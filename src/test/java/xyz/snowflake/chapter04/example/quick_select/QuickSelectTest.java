package xyz.snowflake.chapter04.example.quick_select;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-12 13:37
 */
public class QuickSelectTest {

    private final QuickSelect qs = new QuickSelect();

    @Test
    public void quickSelect() {


        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        int ans = qs.quickSelect(arr, 0, arr.length - 1, 2);
        System.out.println(ans);
    }

}