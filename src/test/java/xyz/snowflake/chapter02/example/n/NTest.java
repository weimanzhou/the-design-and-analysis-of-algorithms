package xyz.snowflake.chapter02.example.n;

import org.junit.Test;

import static javafx.scene.input.KeyCode.F;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 15:17
 */
public class NTest {

    private N n = new N();

    @Test
    public void n() {
        for (int i = 0; i < 10; i++) {
            System.out.println(n.n(i));
        }
    }

    @Test
    public void n2() {
        for (int i = 0; i < 10; i++) {
            System.out.println(n.n2(i));
        }
    }
}