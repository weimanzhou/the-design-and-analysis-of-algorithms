package xyz.snowflake.chapter03.example.bm;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-19 20:38
 */
public class BM {

    /**
     * 利用 bm 算法来查找 pattern 在 text 第一次出现的位置
     *
     * @param text    主串
     * @param pattern 模式串
     * @return 模式串在主串第一次出现的位置
     */
    public int bm(String text, String pattern) {
        if (text.length() < pattern.length()) return -1;
        int[] dis = dis(pattern);
        for (int i = pattern.length() - 1; i < text.length(); ) {
            // 如果这两个位置的字符不相等，那么看 text 在 i 的字符有没有在模式串中出现过
            // 情况一，二
            if (text.charAt(i) != pattern.charAt(pattern.length() - 1)) {
                int index = dis[text.charAt(i)];
                // 情况二 pattern 除最后一个位置处存在主串当前位置的字符
                if (index != -1) {
                    boolean isEquals = text.substring(i - pattern.length() + 1, i + 1).equals(pattern);
                    if (isEquals) return i - pattern.length() + 1;
                }
                // 情况一 pattern 串中不存在主串当前位置的字符
                i += index;
            }
            // 情况三，四 pattern 存在主串当前位置的字符
            else {
                boolean isEquals = text.substring(i - pattern.length() + 1, i + 1).equals(pattern);
                if (isEquals) return i - pattern.length() + 1;
                i += dis[text.charAt(i)];
            }
        }
        return -1;
    }

    public int horspool(String text, String pattern) {
        int[] dis = dis(pattern);
        for (int i = pattern.length() - 1; i < text.length(); ) {
            // 逐一比较
            /*int k = 0;
            while (k < pattern.length() && pattern.charAt(pattern.length() - 1 - k) == text.charAt(i - k))
                k++;
            if (k == pattern.length()) return i - pattern.length() + 1;*/
            // equals 比较
            boolean isEquals = text.substring(i - pattern.length() + 1, i + 1).equals(pattern);
            if (isEquals) return i - pattern.length() + 1;
            else i += dis[text.charAt(i)];
        }
        return -1;
    }

    public int[] dis(String pattern) {
        int length = pattern.length();
        int[] dis = new int[128];
        for (int i = 0; i < dis.length; i++) dis[i] = length;
        for (int i = 0; i < length - 1; i++) dis[pattern.charAt(i)] = length - 1 - i;
        return dis;
    }

}
