package xyz.snowflake.chapter03.example.sequential_search2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-27 21:46
 */
public class SequentialSearch2Test {

    private final SequentialSearch2 search = new SequentialSearch2();

    @Test
    public void sequentialSearch2() {
        int[] nums1 = new int[]{1, 2, 3, 4, 5};
        int target1 = 3;
        System.out.println("============找到===========");
        int index1 = search.sequentialSearch2(nums1, target1);
        System.out.println("index ==> " + index1);

        int[] nums2 = new int[]{1, 2, 3, 4, 5};
        int target2 = 6;
        System.out.println("===========未找到==========");
        int index2 = search.sequentialSearch2(nums2, target2);
        System.out.println("index ==> " + index2);

    }
}