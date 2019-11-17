package xyz.snowflake.chapter04.example.lexicographic_permute;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-14 21:39
 */
public class LexicographicPermuteTest {

    private final LexicographicPermute lexicographicPermute = new LexicographicPermute();

    @Test
    public void lexicographicPermute() {
        for (int i = 1; i <= 5; i++) {
            List<int[]> ans = lexicographicPermute.lexicographicPermute(i);
            System.out.println(i + " size: " + ans.size() + " ================================================");
            ans.forEach(e -> System.out.println(Arrays.toString(e)));
        }
    }
}