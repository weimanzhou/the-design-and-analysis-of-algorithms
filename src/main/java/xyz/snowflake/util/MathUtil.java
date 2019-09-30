package xyz.snowflake.util;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-19 13:54
 */
public class MathUtil {

    /**
     * @param nums int 数组
     * @param i    下标1
     * @param j    下标2
     */
    public static void swap(int[] nums, int i, int j) {
        // 这个地方由于需要交换的两个数字是相等的，异或运算符会
        if (i == j) return;
        nums[i] ^= nums[j];
        nums[j] ^= nums[i];
        nums[i] ^= nums[j];
    }

    public static void swap(boolean[] bs, int i, int j) {
        boolean temp = bs[i];
        bs[i] = bs[j];
        bs[j] = temp;
    }

    public static int a(int n) {
        if (n ==  1) return n;
        return n * a(n - 1);
    }

}
