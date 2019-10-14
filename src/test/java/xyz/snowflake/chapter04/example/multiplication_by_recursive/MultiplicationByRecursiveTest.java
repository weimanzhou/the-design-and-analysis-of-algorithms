package xyz.snowflake.chapter04.example.multiplication_by_recursive;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-14 14:02
 */
public class MultiplicationByRecursiveTest {

    private final MultiplicationByRecursive multiplication = new MultiplicationByRecursive();

    @Test
    public void multiplicationByRecursive() {
        // 负数乘正数
        int ans1 = multiplication.multiplicationByRecursive(-12, 12);
        System.out.println("-12 * 12 = " + ans1);

        // 负数乘负数
        int ans2 = multiplication.multiplicationByRecursive(-12, -12);
        System.out.println("-12 * -12 = " + ans2);

        // 正数乘正数
        int ans3 = multiplication.multiplicationByRecursive(12, 12);
        System.out.println("12 * 12 = " + ans3);

        // 正数乘负数
        int ans4 = multiplication.multiplicationByRecursive(12, -12);
        System.out.println("12 * -12 = " + ans4);

        // 负数乘正数
        int ans5 = multiplication.multiplicationByRecursive(-11, 12);
        System.out.println("-11 * 12 = " + ans5);

        // 负数乘负数
        int ans6 = multiplication.multiplicationByRecursive(-11, -12);
        System.out.println("-11 * -12 = " + ans6);

        // 正数乘正数
        int ans7 = multiplication.multiplicationByRecursive(11, 12);
        System.out.println("11 * 12 = " + ans7);

        // 正数乘负数
        int ans8 = multiplication.multiplicationByRecursive(11, -12);
        System.out.println("11 * -12 = " + ans8);

    }
}