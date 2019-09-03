package xyz.snowflake.chapter01.example.sieve;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-02 16:40
 */
public class SieveTest {

    private Sieve sieve = new Sieve();

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


    /**
     * 产生 25000000 以内的素数
     *
     * 通过 埃拉托色尼筛选法 产生素数数组： 1200ms
     * 通过正常的循环遍历每一个数字，并判断其是否为素数，然后添加到集合中，最后返回结果数组：12801ms
     *
     *
     */
    @Test
    public void testSieve() {
        System.out.println("-----------埃拉托色尼筛选法-----------");
        sieve.sieve(25000000);
    }

    /**
     * 通过循环遍历的方式,判断每一个数是否是质数
     * 如果是质数,将该数字添加到集合中,如果不是则跳过,最后将集合转化为 int 数组
     */
    @Test
    public void testReturnPrimeArr() {
        System.out.println("----------------for循环----------------");
        sieve.returnPrimeArr(25000000);
    }

}