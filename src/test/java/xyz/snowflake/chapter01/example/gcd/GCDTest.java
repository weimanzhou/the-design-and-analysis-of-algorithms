package xyz.snowflake.chapter01.example.gcd;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-02 16:39
 */
public class GCDTest {

    private GCD gcd = new GCD();

    private final int M = Integer.MAX_VALUE >> 2;
    private final int N = Integer.MAX_VALUE - 2 >> 2;

    private Instant start;

    @Before
    public void before() {
        start = Instant.now();
    }

    @After
    public void after() {
        Instant end = Instant.now();
        System.out.println("运行时间为: " + Duration.between(start, end).toMillis() + "ms");
    }

    @Test
    public void testGCD1() {
        // -----------------------------------------
        // 测试 欧几里得 算法
        // -----------------------------------------
        int factor = gcd.gcd1(M, N);
        System.out.println("---------------------欧几里得---------------------");
        System.out.println(M + " 和 " + N + " 的最大公因子为: " + factor);
    }

    @Test
    public void testGCD2() {
        // -----------------------------------------
        // 通过遍历的方式来求
        // 首先计算出 m 和 n 的最小值，然后对最小值 t 依次递减，一旦 m 除以 t 的余数为 0，并且 m 除以 t 的余数也为 0
        // -----------------------------------------
        int factor = gcd.gcd2(M, N);
        System.out.println("---------------------for循环---------------------");
        System.out.println(M + " 和 " + N + " 的最大公因子为: " + factor);
    }

    @Test
    public void testGCD3() {
        // -----------------------------------------
        // 首先对 m 和 n 分别求出对应的因子的集合
        // 然后找出两个因子集合的公共元素（可以重复），最后累乘起来就是 m 和 n 的最大因子
        // -----------------------------------------
        int factor = gcd.gcd3(M, N);
        System.out.println("--------------------公共因子积--------------------");
        System.out.println(M + " 和 " + N + " 的最大公因子为: " + factor);
    }

    @Test
    public void testGCD4() {
        // -----------------------------------------
        // 通过更相减损术的方法来求 m 和 n 的最大因子数
        // -----------------------------------------
        int factor = gcd.gcd4(M, N);
        System.out.println("--------------------更相减损术--------------------");
        System.out.println(M + " 和 " + N + " 的最大公因子为: " + factor);
    }

    @Test
    public void testGCD5() {
        // -----------------------------------------
        // 结合辗转相除法和更相减损法的优势以及移位运算
        // 对 m 和 n 分四种情况
        // 如果 m 为偶数 n 为偶数, gcd(m, n) = gcd(m >> 2, n >> 2) << 2;
        // 如果 m 为偶数 n 为奇数, gcd(m, n) = gcd(m >> 2, n);
        // 如果 m 为奇数 n 为偶数, gcd(m, n) = gcd(m, n >> 2);
        // 如果 m 为奇数 n 为奇数, gcd(m, n) = gcd(n, m - n);
        // -----------------------------------------
        int factor = gcd.gcd5(M, N);
        System.out.println("-------------欧几里得和更相减损术结合-------------");
        System.out.println(M + " 和 " + N + " 的最大公因子为: " + factor);
    }

    @Test
    public void testSteinGCD() {
        int factor = gcd.steinGCD(M, N);
        System.out.println("-------------欧几里得和更相减损术结合-------------");
        System.out.println(M + " 和 " + N + " 的最大公因子为: " + factor);
    }

}