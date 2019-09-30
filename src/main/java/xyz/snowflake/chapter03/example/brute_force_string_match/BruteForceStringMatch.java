package xyz.snowflake.chapter03.example.brute_force_string_match;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-27 21:54
 */
public class BruteForceStringMatch {

    /**
     * 查找 pattern 在 text 第一次出现的下标
     *
     * @param text      文本
     * @param pattern   模式串
     * @return          模式串在文本中第一次出现的下标
     */
    public int bruteForceStringMatch(String text, String pattern) {
        for (int i = 0; i <= text.length() - pattern.length(); i++) {
            int j = 0;
            for (; j< pattern.length(); j++)
                if (text.charAt(i + j) != pattern.charAt(j)) break;
            if (j == pattern.length()) return i;
        }
        return -1;
    }


}
