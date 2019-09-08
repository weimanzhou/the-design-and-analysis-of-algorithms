package xyz.snowflake.chapter01.exercise1.ex11.a;

/**
 * 扩展的欧几里得算法，不仅能求出两个正整数 m 和 n 的最大公约数 d，还能求出
 * 两个整数 x 和 y（不一定为正），使得 mx + ny = d
 *
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-04 16:52
 */
public class EXA11 {

    private int x, y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    /**
     *
     * @param a     数字1
     * @param b     数字2
     * @return      x 和 y 的最大公约数
     */
    public int exgcd(int a, int b) {
        if (b == 0) {
            x = 1;
            y = 0;
            return a;
        }
        int d = exgcd(b, a % b);
        int temp = x;
        x = y;
        y = temp - a / b * y;
        return d;
    }

}
