package xyz.snowflake.chapter02.example.fbnq;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 15:44
 */
public class FBNQ {

    /**
     * 计算 斐波那契 数列的值
     *
     * 递归的方式
     *
     * @param n 第 n 项
     * @return  斐波那契第 n 项的值
     */
    public int fbnq(int n) {
        if (n == 0 || n == 1) return n;
        else return fbnq(n - 1) + fbnq(n - 2);
    }



}
