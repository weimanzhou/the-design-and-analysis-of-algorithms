package xyz.snowflake.chapter02.example.matrixmultiplication;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 14:55
 */
public class MatrixMultiplication {

    /**
     * 计算两个矩阵的乘积
     * @param a 矩阵 a
     * @param b 矩阵 b
     * @return  矩阵 a 和 矩阵 b 的乘积
     */
    public int[][] matrixMultiplication(int[][] a, int[][] b) {
        if (a[0].length != b.length)
            throw new IllegalArgumentException("不合法参数 a 的列数应该等于 b 的行数");
        int[][] c = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                int sum = 0;
                for (int k = 0; k < a[i].length; k++) {
                    sum += (a[i][k] * b[k][j]);
                }
                c[i][j] = sum;
            }
        }
        return c;
    }

}
