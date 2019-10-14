package xyz.snowflake.chapter04.example.multiplication_by_recursive;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-14 13:58
 */
public class MultiplicationByRecursive {

    public int multiplicationByRecursive(int n1, int n2) {
        if (n1 == 0 || n2 == 0) return 0;
        int flag = n1 > 0 ? 1 : -1;
        n1 = Math.abs(n1);
        if (n1 == 1) return n2 * flag;
        if ((n1 & 1) == 0)
            return multiplicationByRecursive(n1 >> 1, n2 << 1) * flag;
        else return (multiplicationByRecursive(n1 >> 1, n2 << 1) + n2) * flag;
    }

}
