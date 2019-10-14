package xyz.snowflake.chapter04.example.multiplication;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-14 13:25
 */
public class Multiplication {

    /**
     * 俄式乘法
     *
     * @param n1    整型数值1
     * @param n2    整型数值2
     * @return      数值1和数值2的乘积
     */
    public int multiplication(int n1, int n2) {
        if (n1 == 0 || n2 == 0) return 0;
        int flag = n1 < 0 ? -1 : 1;
        n1 = Math.abs(n1);
        int temp = 0;
        while (n1 > 1) {
            if ((n1 & 1) == 1) temp += n2;
            n1 >>= 1;
            n2 <<= 1;
        }
        return (n2 + temp) * flag;
    }

}
