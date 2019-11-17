package xyz.snowflake.chapter04.example.hoare_partition;

import xyz.snowflake.util.MathUtil;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-12 14:30
 */
public class HoarePartition {

    /**
     * 在算导7.1节中给出的快排经典算法中，
     * 将主元值与围绕它划分形成的两个部分分隔开了，
     * 而 Hoare-Partition 划分则总是将主元值放入两个划分A[p..j]和A[j+1..r]的某一个中。
     *
     * @param arr   待划分数组
     * @param l     起始下标
     * @param r     终止下标
     * @return      划分后的下标
     */
    public int hoarePartition(int[] arr, int l, int r) {
        int x = arr[l];
        // 没有设置 i = l + 1，能够保证在第一次交换的时候，能将一个比 x 小的数与 l 位置交换。
        int i = l;
        // 这个毫无疑问，从右下标开始遍历
        int j = r;
        while (true) {
            // 循环条件：如果当前 j 指向的值大于等于 x，则下标左移
            while (j > l && arr[j] >= x) j--;
            // 循环条件：如果当前 i 指向的值小于 x，则下标右移
            while (i < r && arr[i] < x) i++;
            // 如果 j 仍然大于 i，才交换该两个数，之所以没有调整下标，
            // 是因为下一次循环中，会调整下标。
            if (j > i) MathUtil.swap(arr, i, j);
            // 否则则代表划分已经完成，可以直接返回 j
            else return i;
        }
    }

}
