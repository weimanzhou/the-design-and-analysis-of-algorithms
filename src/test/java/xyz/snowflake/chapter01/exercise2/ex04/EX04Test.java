package xyz.snowflake.chapter01.exercise2.ex04;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-07 21:19
 */
public class EX04Test {

    private final EX04 ex = new EX04();

    @Test
    public void calculate() {

        int a = 1;
        int b = -2;
        int c = 1;

        Map<Integer, Double> ans = ex.calculate(a, b, c);
        System.out.println(a + "x^2 + " + b + "x + " + c + " 的两个解为：");
        System.out.println("x1: " + ans.get(EX04.X1));
        System.out.println("x2: " + ans.get(EX04.X2));
    }

}