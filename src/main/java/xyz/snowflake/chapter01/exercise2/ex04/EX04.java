package xyz.snowflake.chapter01.exercise2.ex04;

import java.util.HashMap;
import java.util.Map;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-07 21:09
 */
public class EX04 {

    public static final int X1 = 1;
    public static final int X2 = 2;

    /**
     * 计算 ax^2 + bx + c = 0 的结果，返回 x 的可能值
     *
     * 如果没有答案，返回 null
     * 如果有答案，但会 Map 对象，
     * get(1) 为第一个答案， get(2) 为第二个答案，本类提供了两个成员常量来获取 x 值
     *
     * @param a     二次项系数
     * @param b     一次项系数
     * @param c     零次项系数
     */
    public Map<Integer, Double> calculate(int a, int b, int c) {
        int detal2 = b * b - 4 * a * c;
        if (detal2 < 0) return null;
        double detal = Math.sqrt(detal2);
        double x1 = (-b + detal) / (2 * a);
        double x2 = (-b - detal) / (2 * a);

        Map<Integer, Double> ans = new HashMap<>();
        ans.put(1, x1);
        ans.put(2, x2);
        return ans;
    }


}
