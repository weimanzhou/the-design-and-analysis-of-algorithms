package xyz.snowflake.chapter02.example.n;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 15:15
 */
public class N {

    /**
     * 计算 n 的阶乘
     *
     * 通过递归的算法
     *
     * @param n 非负整数
     * @return  n 的阶乘
     */
    public int n(int n) {
        if (n == 0) return 1;
        else return n * n(n - 1);
    }

    /**
     * 计算 n 的阶乘
     *
     * 通过非递归的算法
     *
     * @param n 非负整数
     * @return  n 的阶乘
     */
    public int n2(int n) {
        int sum = 1;
        for (int i = 1; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }

}
