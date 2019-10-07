package xyz.snowflake.chapter02.example.fib_by_matrix_exponentiation;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-07 15:17
 */
public class FIBTest {

    private final FIB fib = new FIB();

    @Test
    public void fib() {
        for (int i = 0; i < 10; i++)
            System.out.println(fib.fib(i));
    }
}