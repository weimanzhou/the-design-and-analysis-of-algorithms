package xyz.snowflake.chapter01.exercise1.ex11.a;

import org.junit.Test;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-04 20:49
 */
public class EXA11Test {

    EXA11 ex = new EXA11();

    @Test
    public void exgcd() {
        int n = ex.exgcd(10, 15);
        System.out.println(n);
        System.out.println(ex.getX());
        System.out.println(ex.getY());
    }
}