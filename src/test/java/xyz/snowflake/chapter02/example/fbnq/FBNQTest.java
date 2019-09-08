package xyz.snowflake.chapter02.example.fbnq;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 15:48
 */
public class FBNQTest {

    private FBNQ fbnq = new FBNQ();

    @Test
    public void fbnq() {
        for (int i = 1; i < 10; i++)
            System.out.println(fbnq.fbnq(i));
    }
}