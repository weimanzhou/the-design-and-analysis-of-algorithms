package xyz.snowflake.chapter04.example.quick_select;

import org.junit.Test;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-12 13:37
 */
public class QuickSelectTest {

    private final QuickSelect qs = new QuickSelect();

    @Test
    public void quickSelect() {
        int[] arr = new int[]{3, 5, 4, 8, 2, 1, 9};
        int ans = qs.quickSelect(arr, 0, arr.length - 1, 4);
        System.out.println(ans);
    }

}