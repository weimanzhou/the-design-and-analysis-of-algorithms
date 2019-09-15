package xyz.snowflake.chapter02.example.hanio;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-09 17:10
 */
public class Hanio {

    public void hanio(int n) {
        hanio(n, 1, 2 ,3);
    }

    private void hanio(int n, int start, int mid, int end) {
        if (n == 1) {
            System.out.println("将编号为 " + n + " 的盘子从柱子 " + start + " 移动到柱子 " + end);
        } else {
            hanio(n - 1, start, end, mid);
            System.out.println("将编号为 " + n + " 的盘子从柱子 " + start + " 移动到柱子 " + end);
            hanio(n - 1, mid, start, end);
        }
    }

}
