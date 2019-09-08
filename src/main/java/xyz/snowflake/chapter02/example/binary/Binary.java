package xyz.snowflake.chapter02.example.binary;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 15:07
 */
public class Binary {

    /**
     * 返回 num 在二进制表示中的二进制数字个数
     *
     * @param num   十进制正数字
     * @return      二进制表示中二进制数字的个数
     */
    public int binary(int num) {
        int count = 0;
        while (num != 0) {
            num /= 2;
            count++;
        }
        return count;
    }

}
