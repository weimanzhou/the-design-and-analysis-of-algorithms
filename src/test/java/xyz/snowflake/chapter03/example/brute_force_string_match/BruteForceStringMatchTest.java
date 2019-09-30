package xyz.snowflake.chapter03.example.brute_force_string_match;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-27 21:58
 */
public class BruteForceStringMatchTest {

    private final BruteForceStringMatch brute = new BruteForceStringMatch();

    @Test
    public void bruteForceStringMatch() {
        String text1 = "abcdefghi";
        String pattern1 = "abc";
        int index1 = brute.bruteForceStringMatch(text1, pattern1);
        System.out.println("===========找到==========");
        System.out.println("找到：index ==> " + index1);

        String text2 = "abcd";
        String pattern2 = "cd";
        int index2 = brute.bruteForceStringMatch(text2, pattern2);
        System.out.println("===========找到（恰好在最后一个组合中）==========");

        System.out.println("index ==> " + index2);

        String text3 = "abcd";
        String pattern3 = "bcde";
        int index3 = brute.bruteForceStringMatch(text3, pattern3);
        System.out.println("===========未找到==========");
        System.out.println("index ==> " + index3);
    }
}