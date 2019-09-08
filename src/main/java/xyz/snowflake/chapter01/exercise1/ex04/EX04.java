package xyz.snowflake.chapter01.exercise1.ex04;

/**
 * 设计一计算 floor[sqrt(n)] 的算法，n 使 任意正整数，除了赋值和比较运算，该算法只能用到基本的四则运算操作
 *
 * 自己只能想到最糟糕的方法,进行枚举求解,但是这个方法有一个缺点就是当遍历到足够大的值的时候,会出现越界的清空,
 * 也求解不出来正确的答案
 *
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-03 18:23
 */
public class EX04 {

    /**
     * 求 floor[sqrt(n)]
     * <p>
     * ------------>> 错误
     *
     * @param n n > 0
     * @return floor[sqrt(n)]
     */
    public int floorSqrt(int n) {
        for (int i = 1; i <= n; i++) {
            // 这是一个失败的处理方法，一旦 i 到达一定值时， i * i 会是负值，造成结果错误
            int value1 = i * i;
            int value2 = (i + 1) * (i + 1);
            if (value1 <= n && value2 > n) {
                return i;
            }
        }
        throw new IllegalArgumentException("输入参数不合法，n 需要大于 0");
    }

    /**
     * 求 floor[sqrt(n)]
     *
     * @param n n > 0
     * @return floor[sqrt(n)]
     */
    public int floorSqrtAdvance(int n) {
        if (n == 0 || n == 1) return n;
        int left = 1, right = n;
        while (left < right) {
            // mid = (left + right) / 2 can overflow if right > Integer.MAX_VALUE - left
            int mid = left + (right - left) / 2;
            // 如果中值大于 n / mid 的值
            // 说明 mid * mid > n
            // 所以right = mid - 1
            if (mid > n / mid) {
                right = mid - 1;
            } else {
                // 同理 mid * mid < n
                // 将 left = mid + 1
                left = mid + 1;
                // 此时要继续判断一下 left 的值是否大于 n / left
                // 也就是判断 left * left 是否大于 n
                // 如果大于直接返回 mid, mid 即为结果
                if (left > n / left) {
                    return mid;
                }
            }
        }
        return left;
    }

    /**
     * 通过牛顿法来求 sqrt(t)
     *
     * @param n n > 0
     * @return  sqrt(t)
     */
    public int floorSqrt2(int n) {
        double t = n;
        // t^2接近c, 防止小数
        // 1e-10 是精度
        // 判断 t 和 n / t 的差,也就是求精度
        while (Math.abs(t - n / t) > 1e-10)
            // t(长) + (n/t)宽 然后 除以 2,求出新边,赋值给 t
            t = (t + n / t) / 2.0;
        System.out.println(t);
        return (int) t;
        // 参考博文
        // ————————————————
        // 版权声明：本文为CSDN博主「SpikeKing」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
        // 原文链接：https://blog.csdn.net/caroline_wendy/article/details/17114939
    }

}
