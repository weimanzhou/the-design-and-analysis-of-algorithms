package xyz.snowflake.chapter01.exercise1.ex04;

import org.junit.Test;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-03 18:28
 */
public class EX04Test {

    EX04 ex = new EX04();

    @Test
    public void floorSqrt() {
//        for (int i = 0XFFF; i <= 0XFFFFFFF; i += 0XFF) {
//            System.out.println(ex.floorSqrt(i));
//            System.out.println(Math.sqrt(i));
//            System.out.println();
//        }
        System.out.println(ex.floorSqrt(2147395600));
        System.out.println(Math.sqrt(2147395600));
    }

    @Test
    public void floorSqrtAdvance() {
        System.out.println(ex.floorSqrtAdvance(8));
        System.out.println(Math.sqrt(2147395600));
    }

    @Test
    public void floorSqrt2() {
        System.out.println(ex.floorSqrt2(2147395599));
        System.out.println(Math.sqrt(720));
    }

}