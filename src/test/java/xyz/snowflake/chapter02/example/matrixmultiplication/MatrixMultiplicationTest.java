package xyz.snowflake.chapter02.example.matrixmultiplication;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 15:00
 */
public class MatrixMultiplicationTest {

    private MatrixMultiplication matrixMultiplication = new MatrixMultiplication();

    private int[][] a = {
            {1, 2, 3},
            {2, 3, 4}
    };

    private int[][] b = {
            {1, 2},
            {2, 3},
            {3, 4}
    };

    /**
     * 结果应该为
     * 14  20
     * 20 29
     *
     * [14, 20]
     * [20, 29]
     *
     * 答案正确
     */
    @Test
    public void matrixMultiplication() {
        int[][] c = matrixMultiplication.matrixMultiplication(a, b);
        for (int i = 0; i < c.length; i++)
            System.out.println(Arrays.toString(c[i]));
    }
}