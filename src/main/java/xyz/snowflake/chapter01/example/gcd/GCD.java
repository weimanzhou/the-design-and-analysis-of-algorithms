package xyz.snowflake.chapter01.example.gcd;

import java.util.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-01 20:56
 */
public class GCD {

    //利用质数分解法来进行计算
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入非负整数m和n：");
        int m, n;
        m = input.nextInt();
        n = input.nextInt();
        System.out.println("最大公约数为" + gcd(m, n));
    }

    /**
     * 最好最好朋友的代码示例
     *
     * @author smileying
     * @email 905023219@qq.com
     *
     * @param m m
     * @param n n
     * @return  m 和 n 的最大公约数
     */
    private static int gcd(int m, int n) {
        int[] arrm = resolve(m);
        int[] arrn = resolve(n);
        int max = 1;
        for (int i1 : arrm) {
            for (int j = 0; j < arrn.length; j++) {
                if (i1 == arrn[j]) {
                    max = max * i1;
                    arrn[j] = 0;
                    break;
                }
            }
        }
        return max;
    }

    /**
     * 返回 m 的全部因子
     *
     * @param m m
     * @return  m 的全部因子
     */
    private static int[] resolve(int m) {
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(m); i++) {
            while (m % i == 0) {
                m = m / i;
                list.add(i);
            }
        }
        list.add(m);
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    /**
     * 欧几里得算法的递归实现
     *
     * @param m m
     * @param n n
     * @return  m 和 n 的最大公因数
     */
    public int gcd11(int m, int n) {
        if (m % n == 0) return n;
        return gcd11(n, m % n);
    }

    /**
     * 利用 欧几里得算法 求 m 和 n 的最大公约数,并且 m >= n
     *
     * @param m m
     * @param n n
     * @return m 和 n 的最大公约数
     */
    public int gcd1(int m, int n) {
        while (n != 0) {
            int temp = m % n;
            m = n;
            n = temp;
        }
        return m;
    }

    /**
     * 通过遍历的方式来求 m 和 n 的最大公约数
     *
     * @param m m
     * @param n n
     * @return m 和 n 的最大公约数
     */
    public int gcd2(int m, int n) {
        // 第一步:将 min{m, n}的值赋值给 t
        int t = Math.min(m, n);
        for (; t >= 2; t--) {
            // 第二步和第三步,如果 m 除以 t 余数为 0 并且 n 除以 t 余数为 0,直接返回 t
            if (m % t == 0 && n % t == 0) {
                return t;
            }
            // 否则 t--,返回第二步和第三步
        }
        return 1;
    }

    public int gcd3(int m, int n) {
//        Instant start = Instant.now();
        int[] marr = factorArr(m);
        int[] narr = factorArr(n);

        // -------------------------------------------------------------------------------------------------------------
        // 处理两个数组的公共元素
        // -------------------------------------------------------------------------------------------------------------
        // 求出 marr 和 narr 的最大值
//        int mMax = Arrays.stream(marr).max().orElse(0);
//        int nMax = Arrays.stream(narr).max().orElse(0);
//
//        int max = Math.max(mMax, nMax);
//
//        int[] arr = new int[max + 1];

//        for (int i = 0; i < marr.length; i++) {
//            int index = i;
//            int count = 0;
//            while (index < marr.length && marr[index] == marr[i]) {
//                count++;
//                index++;
//            }
//            arr[marr[i]] = count;
//        }
//
//        for (int i = 0; i < narr.length; i++) {
//            int index = i;
//            int count = 0;
//            while (index < narr.length && narr[index] == narr[i]) {
//                count++;
//                index++;
//            }
//            arr[narr[i]] = Math.min(count, arr[narr[i]]);
//        }

        Map<Integer, Integer> mMap = new HashMap<>(marr.length);
        Map<Integer, Integer> nMap = new HashMap<>(narr.length);

        // 处理 marr
        for (int i = 0; i < marr.length; ) {
            int index = i;
            int count = 0;
            while (index < marr.length && marr[index] == marr[i]) {
                count++;
                index++;
            }
            mMap.put(marr[i], count);
            i = index;
        }

        // 处理 narr
        for (int i = 0; i < narr.length; ) {
            int index = i;
            int count = 0;
            while (index < narr.length && narr[index] == narr[i]) {
                count++;
                index++;
            }
            nMap.put(narr[i], count);
            i = index;
        }

        int sum = 1;

        // 可以遍历任意一个 map ，来找出公共元素的个数
        for (Map.Entry<Integer, Integer> entry : mMap.entrySet()) {
            // 取出 value
            int value = entry.getKey();
            // 取出个数
            int count = entry.getValue();
            // 取出另外一个集合中对应 value 值出现的次数
            int anotherCount = nMap.get(value) == null ? 0 : nMap.get(value);
            // 两个因子数组相同因子出现次数的较小值
            int minCount = Math.min(count, anotherCount);

            sum *= minCount == 0 ? 1 : Math.pow(value, minCount);
        }
//        int sum = 1;
//        for (int i = 2; i < arr.length; i++) {
//            sum *= Math.pow(i, arr[i]);
//        }

        return sum;
    }

    /**
     * 返回 value 的全部因子,以数组的形式返回
     *
     * @param value value 值
     * @return value 的全部因子,以数组的形式返回
     */
    private int[] factorArr(int value) {
        if (value == 1) return new int[]{1};
        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(value); i++) {
            if (value % i == 0) {
                list.add(i);
                value /= i;
                i--;
            }
        }
        // 最后还可能剩下自己
        list.add(value);
        return list.stream().mapToInt(Integer::valueOf).toArray();
    }

    /**
     * 使用更相减损法求 m 和 n 的最大公约数
     *
     * @param m 数字 m
     * @param n 数字 n
     * @return m 和 n 的最大公约数
     */
    public int gcd4(int m, int n) {
        // 两个数字不相等时，继续进行运算，
        while (m != n) {
            if (m > n) m -= n;
            else n -= m;
        }
        return m;
    }

    //————————————————
    //版权声明：本文为CSDN博主「keep_belief」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
    //原文链接：https://blog.csdn.net/qq_34992845/article/details/53043339

    /**
     * 求两个正整数的最大公因数
     * <p>
     * 结合辗转相除法和更相减损法的优势以及移位运算
     * <p>
     * 结合辗转相除法和更相减损法的优势以及移位运算
     * 对 m 和 n 分四种情况
     * 如果 m 为偶数 n 为偶数, gcd(m, n) = gcd(m >> 2, n >> 2) << 2;
     * 如果 m 为偶数 n 为奇数, gcd(m, n) = gcd(m >> 2, n);
     * 如果 m 为奇数 n 为偶数, gcd(m, n) = gcd(m, n >> 2);
     * 如果 m 为奇数 n 为奇数, gcd(m, n) = gcd(n, m - n);
     *
     * @param m 数字 m
     * @param n 数字 n
     * @return 返回 m 和 n 的最大公因数
     */
    public int gcd5(int m, int n) {
        // 这个地方也是利用到更相减损术
        if (m == n) {
            return m;
        }
        // 为了保证较大的数始终在前面，减少了代码
        if (n > m) {
            return gcd5(n, m);
        } else {
            if (((m & 1) == 0) && ((n & 1) == 0)) {
                // 两数都是偶数
                return gcd5(m >> 1, n >> 1) << 1;
            } else if ((m & 1) == 0 && (n & 1) == 1) {
                // m为偶数，n为奇数
                return gcd5(m >> 1, n);
            } else if ((m & 1) == 1 && (n & 1) == 0) {
                // m为奇数，n为偶数
                return gcd5(m, n >> 1);
            } else {
                // 当两个数都为奇数时，应用更相减损法
                // 这个位置利用到了更相减损术
                return gcd5(n, m - n);
            }
        }
    }

    /**
     * Stein 算法的非递归实现
     *
     * @param m m
     * @param n n
     * @return m 和 n 的最大公因子
     */
    public int steinGCD(int m, int n) {
        int count = 0;
        if (m < n) return steinGCD(n, m);
        while ((m & 1) == 0 && (n & 1) == 0) {
            count++;
            m >>= 1;
            n >>= 1;
        }
        while (m != n) {
            while ((m & 1) == 0) m >>= 1;
            while ((n & 1) == 0) n >>= 1;
            if (m < n) {
                m ^= n;
                n ^= m;
                m ^= n;
            }
            // 进行一次更相减损术
            int temp = m - n;
            m = n;
            n = temp;
        }
        return m << count;
    }

}
