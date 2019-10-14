package xyz.snowflake.chapter04.example.josephus_problem_by_math;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-14 19:24
 */
public class JosephusProblemByMath {

    /**
     * 约瑟夫斯问题：
     * 利用数学的方法，来求得是哪个人最后存活下来
     *
     * 步骤:
     *  1. 将参与的人数转换为二进制的形式，然后将该二进制数循环左移
     *     然后再将循环左移后的二进制数转换为十进制的数，得到的值，即为存活的人的编号
     *     如果要得到其所对应的值，需要将之前得到的值减一，然后返回其位置所对应的数组中的值
     *
     * @param persons   参与的人员数组，由于是 int 数组，所以里面的数字不能出现重复
     * @return          存活的人员所对应的数组中的值
     */
    public int josephusProblemByMath(int[] persons) {
        int n = persons.length;
        String binary = Integer.toBinaryString(n);
        binary = binary.substring(1) + binary.substring(0, 1);
        return persons[Integer.parseInt(binary, 2) - 1];
    }

}
