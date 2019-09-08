package xyz.snowflake.chapter02.example.binrec;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 15:20
 */
public class BinRecTest {

    private BinRec binRec = new BinRec();

    @Test
    public void binRec() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("正确答案：" + Integer.toBinaryString(i).length() + ", 我的答案：" + binRec.binRec(i));
        }
    }
}