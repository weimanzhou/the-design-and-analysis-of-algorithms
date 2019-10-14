package xyz.snowflake.chapter04.example.brgc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-24 21:17
 */
public class BRGC {

    /**
     * 递归生成 n 位的二进制反射格雷码
     *
     * @param n 位数 n
     * @return  二进制反射格雷码
     */
    public List<String> bgrc(int n) {
        if (n == 1) return Arrays.asList("0", "1");
        else {
            List<String> l1 = bgrc(n - 1);
            List<String> l2 = new ArrayList<>(l1);
            Collections.reverse(l2);
            l1 = l1.stream().map(e -> "0" + e).collect(Collectors.toList());
            l2 = l2.stream().map(e -> "1" + e).collect(Collectors.toList());
            l1.addAll(l2);
            return l1;
        }
    }


}
