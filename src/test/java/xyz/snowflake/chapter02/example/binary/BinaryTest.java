package xyz.snowflake.chapter02.example.binary;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 15:09
 */
public class BinaryTest {

    private Binary binary = new Binary();

    @Test
    public void binary() {

        for (int i = 1; i <= 10; i++) {
            System.out.println("标准答案：" + Integer.toBinaryString(i).length() + ", 我的答案：" + binary.binary(i));
        }

    }
}