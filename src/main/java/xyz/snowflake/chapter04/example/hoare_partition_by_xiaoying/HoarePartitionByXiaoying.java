package xyz.snowflake.chapter04.example.hoare_partition_by_xiaoying;

import org.junit.Test;
import xyz.snowflake.util.MathUtil;

import java.util.Arrays;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-19 18:20
 */
public class HoarePartitionByXiaoying {

    /**
     * 划分的规则，左边的全部小于，右边的大于等于
     */
    @Test
    public void test() {
        int[] nums1 = {1, 2, 3, 4, 5, 6};
        int[] nums2 = {6, 5, 4, 3, 2, 1};
        int[] nums3 = {1, 1, 1, 1, 1, 1};
        int[] nums4 = {1, 1, 2, 2, 3, 3};
        int[] nums5 = {2, 2, 1, 1, 3, 3};

        int ans1 = HoarePartition(nums1, 0, 5);
        System.out.println(Arrays.toString(nums1));
        int ans2 = HoarePartition(nums2, 0, 5);
        System.out.println(Arrays.toString(nums2));

        int ans3 = HoarePartition(nums3, 0, 5);
        System.out.println(Arrays.toString(nums3));

        int ans4 = HoarePartition(nums4, 0, 5);
        System.out.println(Arrays.toString(nums4));

        int ans5 = HoarePartition(nums5, 0, 5);
        System.out.println(Arrays.toString(nums5));


        System.out.println(ans1 + " " + ans2 + " " + ans3 + " " + ans4 + " " + ans5);
    }

    /**
     * 以第一个元素为中轴，对子数组进行划分
     * 输入：可排序数组A[0,...,n - 1]的子数组A[l,...,r]和整数k（1 <= k <= r - l + 1)
     * 输出：A[l,...,r]的一个划分，分裂点的位置作为函数的返回值
     *
     * @param arr
     * @param begin
     * @param end
     */
    private int HoarePartition(int[] arr, int begin, int end) {
        //判断中值位置
        int start = arr[begin];
        //at1从起始地点开始
        int seat1 = begin + 1;
        //at2从末尾地点开始
        int seat2 = end;
        //条件seat1 < seat2 才可以交换
        while (seat1 < seat2) {
            //如果arr[seat1] > start ，循环结束
            while (seat1 < end && arr[seat1] < start)
                seat1++;
            //如果arr[seat2] < start , 循环结束
            while (seat2 > begin && arr[seat2] >= start)
                seat2--;
            MathUtil.swap(arr, seat1, seat2);
        }
        //当i >= j撤销最后一次交换
        MathUtil.swap(arr, seat1, seat2);
        //当seat1 >= seat2的时候，便将seat2和begin交换
        MathUtil.swap(arr, seat2, begin);
        return seat2;
    }

}
