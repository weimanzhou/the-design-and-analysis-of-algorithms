package xyz.snowflake.chapter01.exercise2.ex03.a;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-07 21:03
 */
public class EXA03Test {

    private final EXA03 ex = new EXA03();

    @Test
    public void area() {
        final int a = 3;
        final int b = 4;
        final int c = 5;
        double area = ex.area(a, b, c);
        System.out.println("a = " + a + ", b = " + b + ", c = " + c + " 的面积为：" + area);
    }

}