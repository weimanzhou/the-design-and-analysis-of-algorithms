package xyz.snowflake.chapter03.example.brgc;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-24 21:27
 */
public class BRGCTest {

    private final BRGC brgc = new BRGC();

    @Test
    public void bgrc() {
        List<String> ans2 = brgc.bgrc(2);
        System.out.println("===========2==========");
        ans2.forEach(System.out::println);
        List<String> ans3 = brgc.bgrc(3);
        System.out.println("===========3==========");
        ans3.forEach(System.out::println);
        List<String> ans4 = brgc.bgrc(4);
        System.out.println("===========4==========");
        ans4.forEach(System.out::println);
    }
}