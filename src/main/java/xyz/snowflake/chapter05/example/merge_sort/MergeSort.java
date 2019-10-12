package xyz.snowflake.chapter05.example.merge_sort;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-10 13:58
 */
public class MergeSort {

    /**
     * 利用归并的思想将 nums 数组排序
     *
     * @param nums  源数组
     */
    public void mergeSort(int[] nums) {
        if (nums.length > 1) {
            int[] b = new int[nums.length >> 1];
            int[] c = new int[nums.length - b.length];
            System.arraycopy(nums, 0, b, 0, b.length);
            System.arraycopy(nums, b.length, c, 0, c.length);
            mergeSort(b);
            mergeSort(c);
            merge(b, c, nums);
        }
    }


    /**
     * 将 a 和 b 数组归并到 c 数组中
     *
     * @param a 源数组 a
     * @param b 源数组 b
     * @param c 排序后的数组 c
     */
    public void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (i < a.length)
            c[k++] = a[i++];
        while (j < b.length)
            c[k++] = b[j++];
    }

}
