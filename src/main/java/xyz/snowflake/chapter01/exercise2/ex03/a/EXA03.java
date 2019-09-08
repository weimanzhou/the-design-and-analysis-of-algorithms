package xyz.snowflake.chapter01.exercise2.ex03.a;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-07 20:57
 */
public class EXA03 {

    /**
     * 计算边长为 a b c 的三角形的面积
     *
     * @param a     边长 a
     * @param b     边长 b
     * @param c     边长 c
     * @return      三角形面积
     */
    public double area(int a, int b, int c) {
        checkRule(a, b, c);
        double p = (a + b + c) / 2.0;
        return Double.parseDouble(String.format("%.2f", Math.sqrt(p * (p - a) * (p - b) * (p - c))));
    }

    /**
     * 检查三角形的三边是否可以构成一个三角形
     *
     * @param a     边长 a
     * @param b     边长 b
     * @param c     边长 c
     */
    private void checkRule(int a, int b, int c) {
        if (a + b > c && a + c > b && b + c > a) { }
        else
            throw new IllegalArgumentException("不合法的参数");
    }

}
