package xyz.snowflake.chapter03.example.bm;

import org.junit.Test;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-19 20:54
 */
public class BMTest {

    private final BM bm = new BM();

    @Test
    public void bm() {
        String text = "jim_saw_me_in_a_barbershop";
        String pattern = "barber";
        int index = bm.bm(text, pattern);
        int index2 = bm.horspool(text, pattern);
        System.out.println("========>  bm");
        System.out.println(text.charAt(index));
        System.out.println(index);
        System.out.println("========>  horspool");
        System.out.println(text.charAt(index2));
        System.out.println(index2);
    }
}