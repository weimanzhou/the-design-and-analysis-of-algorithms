package xyz.snowflake.chapter01.example.sieve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 *
 *
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-02 13:39
 */
public class Sieve {

    /**
     * 实现“埃拉托色尼筛选法”
     *
     * 顺便记录一下质数的性值：n >= 5 的质数除以 6 的余数要么是 1，要么是 5
     *
     * @param num   一个正整数 n > 1
     * @return      返回 包含所有小于等于 n 的质数的数组
     */
    public int[] sieve(int num) {
        int[] arr = new int[num + 1];
        for (int i = 2; i <= num; i++) {
            arr[i] = i;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (arr[i] != 0) {
                for (int j = i * i; j <= num; j += i)
                    arr[j] = 0;
            }
        }
        return Arrays.stream(arr)
                .filter(e -> e != 0)
                .toArray();
    }

    /**
     * 通过循环遍历 2 -> num,判断每一个数是否为质数
     *
     * @param num   num > 0
     * @return      返回 2 - num(包括 num) 内的全部质数,以数组的形式
     */
    public int[] returnPrimeArr(int num) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= num; i += 2) {
            if (i == 1) continue;
            if (isPrime(i)) list.add(i);
        }
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    /**
     * 判断一个数是否是素数
     *
     * @param num   数字 num, num >= 1
     * @return      如果 num 是素数那么返回 true，否则返回 false
     */
    private boolean isPrime(int num) {
        if (num < 5) {
            return num < 4 && num > 1;
        }
        if (num % 6 != 1 && num % 6 != 5) {
            return false;
        }
        for (int i = 5; i <= Math.sqrt(num); i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

}
