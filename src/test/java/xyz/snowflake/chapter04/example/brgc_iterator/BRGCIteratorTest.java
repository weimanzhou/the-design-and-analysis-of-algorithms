package xyz.snowflake.chapter04.example.brgc_iterator;

import org.junit.Test;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-25 20:37
 */
public class BRGCIteratorTest {

    private final BRGCIterator brgc = new BRGCIterator();

    @Test
    public void brgcIterator() {
        brgc.brgcIterator(4).forEach(System.out::println);
    }

}