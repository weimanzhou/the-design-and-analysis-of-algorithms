package xyz.snowflake.chapter04.example.multiplication;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-14 14:01
 */
public class MultiplicationTest {

    private final Multiplication multiplication = new Multiplication();

    @Test
    public void multiplication() {
        int ans = multiplication.multiplication(-20, -11);
        System.out.println(ans);
    }
}