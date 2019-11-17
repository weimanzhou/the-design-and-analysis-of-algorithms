package xyz.snowflake.chapter04.example.lexicographic_permute;

import xyz.snowflake.util.MathUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-14 21:27
 */
public class LexicographicPermute {

    /**
     * 按照字典的顺序，生成一个数组的全排列
     *
     * @param n 数组的长度
     * @return  长度为 n 的全排列的集合
     */
    public List<int[]> lexicographicPermute(int n) {
        List<int[]> ans = new ArrayList<>();
        int[] arr = Stream.iterate(1, i -> i + 1)
                .limit(n)
                .mapToInt(Integer::intValue)
                .toArray();
        while (help(arr)) {
            ans.add(arr.clone());

            int index = -1;
            for (int i = n - 1; i > 0; i--)
                if (arr[i] > arr[i - 1]) {
                    index = i;
                    break;
                }
            // 找到需要交换的下标
            // 比 arr[index - 1] 大，但是又是 [index ... n - 1] 最小的
            int tempMax = Integer.MAX_VALUE;
            int tempIndex = -1;
            for (int i = index; i < n; i++) {
                if (arr[i] > arr[index - 1]) {
                    if (arr[i] < tempMax) {
                        tempMax = arr[i];
                        tempIndex = i;
                    }
                }
            }

            // 成功找到
            // 交换 tempIndex 和 index - 1 位置处
            MathUtil.swap(arr, tempIndex, index - 1);
            Arrays.sort(arr, index, n);
        }
        ans.add(arr.clone());
        return ans;
    }

    /**
     * 判断数组中是否有两个连续升序的元素
     *
     * @param arr   整型数组
     * @return      如果数组中存在两个连续升序的元素，那么返回 true
     *              如果数组中不存在两个连续升序的元素，那么返回 false
     */
    private boolean help(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            if (arr[i + 1] > arr[i]) return true;
        return false;
    }

}
