package xyz.snowflake.chapter02.example.binrec;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 15:19
 */
public class BinRec {

    /**
     * 返回 正整数 num 以二进制表示的二进制数字的位数
     *
     * @param num   正整数
     * @return      以二进制表示的二进制数字的位数
     */
    public int binRec(int num) {
        if (num == 1) return 1;
        else return binRec(num >> 1) + 1;
    }

}
