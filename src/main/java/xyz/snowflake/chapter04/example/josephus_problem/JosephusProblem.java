package xyz.snowflake.chapter04.example.josephus_problem;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-14 13:38
 */
public class JosephusProblem {

    /**
     * 解决约瑟夫斯问题
     *
     * @param persons   人的集合
     * @return          最后存活的那个人
     */
    public int josephusProblem(int[] persons) {
        int n = persons.length;
        while (n > 1) {
            // 声明一个新的数组
            int[] newpersons = new int[n / 2];
            int personIndex = (n & 1) == 0 ? 0 : 2;
            for (int i = 0; i < newpersons.length; i++) {
                newpersons[i] = persons[personIndex];
                personIndex += 2;
            }
            persons = newpersons;
            n = persons.length;
        }
        return persons[0];
    }

}
