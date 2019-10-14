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
        int i = l;
        int j = r;
        while (true) {
            while (j > l && arr[j] >= x) j--;
            while (i < r && arr[i] < x) i++;
            if (j > i) MathUtil.swap(arr, i, j);
            else return j;
        }
    }

}
