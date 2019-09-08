package xyz.snowflake.chapter02.example.fib;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 15:46
 */
public class FIB {

    /**
     * 计算 斐波那契 数列的值
     *
     * 迭代的方式
     *
     * @param n 第 n 项
     * @return  斐波那契第 n 项的值
     */
    public int fib(int n) {
        if (n == 0 || n == 1) return n;
        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }

}
