package xyz.snowflake.chapter02.example.fib_by_matrix_exponentiation;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-07 15:06
 */
public class FIB {

    /**
     * 计算第 n 项 菲波那锲数数
     *
     * @param n 项数
     * @return  第 n 项菲波那锲数
     */
    public int fib(int n) {
        int[][] q = {{1, 1}, {1, 0}};
        int[][] res = pow(q, n);
        return res[1][1];
    }

    private int[][] pow(int[][] a, int n) {
        int[][] ret = {{1, 1}, {1, 0}};
        while (n > 0) {
            // 如果 n 是奇数，指数除 2
            if ((n & 1) == 1) ret = multiply(ret, a);
            n >>= 1;
            a = multiply(a, a);
        }
        return ret;
    }

    /**
     * 矩阵的乘法
     *
     * @param a 矩阵 a
     * @param b 矩阵 b
     * @return  矩阵 a 和 矩阵 b 的乘积
     */
    private int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
        return c;
    }

}
