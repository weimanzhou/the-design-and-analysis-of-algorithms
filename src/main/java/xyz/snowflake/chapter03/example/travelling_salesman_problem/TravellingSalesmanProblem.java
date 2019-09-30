package xyz.snowflake.chapter03.example.travelling_salesman_problem;

import xyz.snowflake.util.MathUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-27 22:34
 */
public class TravellingSalesmanProblem {

    /**
     * 旅行商问题
     *
     * @param points    点的集合
     * @param diss      任意两点之间的距离的二维数组
     * @param start     起点下标
     * @return          起点下标的集合
     */
    public List<Integer> travellingSalesmanProblem(int[] points, int[][] diss, int start) {
        // 生成一个下标数组
        int[] indexs = new int[points.length - 1];
        for (int i = 0, j = 0; i < points.length; i++)
            if (i != start) indexs[j++] = i;
        List<int[]> indexss = new ArrayList<>();
        bt(indexss, indexs, indexs.length);

        // 定义最短距离
        int minDis = Integer.MAX_VALUE;
        List<Integer> ans = new ArrayList<>();
        for (int[] arr : indexss) {
            int dis = diss[start][arr[0]];
            for (int i = 0; i < arr.length - 1; i++) {
                dis += diss[arr[i]][arr[i + 1]];
            }
            dis += diss[arr[arr.length - 1]][start];
            if (dis < minDis) {
                minDis = dis;
                ans.clear();
                ans.add(start);
                ans.addAll(Arrays.stream(arr).boxed().collect(Collectors.toList()));
                ans.add(start);
            }
        }

        return ans;
    }

    /**
     * 利用回溯法实现数组的排列组合
     *
     * @param ans       返回结果
     * @param indexs    下标数组
     * @param n         限制变量
     */
    public void bt(List<int[]> ans, int[] indexs, int n) {
        if (n == 1) ans.add(indexs.clone());
        for (int i = 0; i < n; i++) {
            bt(ans, indexs, n - 1);
            if ((n & 1) == 1) MathUtil.swap(indexs, 0, n - 1);
            else MathUtil.swap(indexs, i, n - 1);
        }
    }

}
