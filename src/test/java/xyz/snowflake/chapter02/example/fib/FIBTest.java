package xyz.snowflake.chapter02.example.fib;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 15:49
 */
public class FIBTest {

    private FIB fib = new FIB();

    @Test
    public void fib() {
        for (int i = 1; i < 10; i++)
            System.out.println(fib.fib(i));
    }
}