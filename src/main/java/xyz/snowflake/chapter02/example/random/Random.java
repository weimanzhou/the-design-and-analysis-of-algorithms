package xyz.snowflake.chapter02.example.random;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 15:54
 */
public class Random {

    public int[] random(int n, int m, int seed, int a, int b) {
        int[] r = new int[n];
        r[0] = seed;
        for (int i = 1; i < n; i++)
            r[i] = (a * r[i - 1] + b) % m;
        return r;
    }

}
