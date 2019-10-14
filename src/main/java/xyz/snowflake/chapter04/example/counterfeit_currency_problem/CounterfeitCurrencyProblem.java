package xyz.snowflake.chapter04.example.counterfeit_currency_problem;

import java.util.Arrays;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-14 13:22
 */
public class CounterfeitCurrencyProblem {

    /**
     * 从一堆硬币中找出假币（前提：假币的质量比真币的质量轻）
     *
     * 算法思想：
     * 1. 如果硬币的个数为偶数个将银币分为两部分；
     *    如果硬币的个数是奇数，将硬币分为三部分，两部分相等的以及一个多余的硬币
     * 2. 比较两部分相等数量的硬币，如果硬币的个数为偶数，那么对质量轻的那一堆，重新进行步骤1
     *    如果硬币的个数为奇数个，如果两部分相等数量的硬币一样重，那么多余的那个硬币就是假币，
     *    否则跟偶数一样处理，递归执行步骤1
     * 3. 如果 起始下标和终止下标一样了，那么就说明当前只有一个硬币，肯定是假币，递归结束
     *
     * @param coins 存储硬币质量的数组
     * @return      返回查找到假硬币，需要分堆的次数
     */
    public int counterfeitCurrencyProblem(int[] coins) {
        return counterfeitCurrencyProblem(coins, 0, coins.length - 1);
    }

    private int counterfeitCurrencyProblem(int[] coins, int begin, int end) {
        if (begin == end) return 0;
        int count = (end - begin + 1) / 2;
        int left = weight(coins, begin, begin + count - 1);
        int right = weight(coins, begin + count, begin + count * 2 - 1);
        if (left == right) return 1;
        else if (left < right) {
            return counterfeitCurrencyProblem(coins, begin, begin + count - 1) + 1;
        } else return counterfeitCurrencyProblem(coins, begin + count, begin + count * 2 - 1) + 1;
    }

    private int weight(int[] coins, int begin, int end) {
        return Arrays.stream(coins, begin, end + 1)
                .sum();
    }

}
