package xyz.snowflake.chapter01.exercise1.ex12;

import java.util.ArrayList;
import java.util.List;

/**
 * 在走廊上有 n 个带锁的门，从 1 到 n 依次编号。最初所有的门都是关着的。
 * 我们从门前经过 n 次，每一次都从 1 号门开始。在第 i 次经过时（i = 1, 2, ..., n）
 * 我们改变 i 的整数倍号锁的状态；如果门时关的，就打开它；
 * 如果门时开的，就关上它。在最后依次经过后，哪些门时打开的，哪些门是关上的？有多少打开的？
 *
 *
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-04 16:25
 */
public class EX12 {

    /**
     * 返回锁着的门的编号集合
     *
     * @param n 门的个数
     * @return  锁着的门的编号集合
     */
    public int[] lockFloorList(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] opened = calculate(n);
        for (int i = 1; i <= n; i++) {
            if (!opened[i]) list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     *
     * @param n 门的个数
     * @return  开着的门的编号集合
     */
    public int[] openFloorList(int n) {
        List<Integer> list = new ArrayList<>();
        boolean[] opened = calculate(n);
        for (int i = 1; i <= n; i++) {
            if (opened[i]) list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    /**
     * 返回关着的门的个数
     *
     * @param n 门的个数
     * @return  关着的门的个数
     */
    public int lockFloor(int n) {
        return lockFloorList(n).length;
    }

    /**
     * 返回开着的门的个数
     *
     * @param n 门的个数
     * @return  开着的门的个数
     */
    public int openFloor(int n) {
        return openFloorList(n).length;
    }

    /**
     * 计算的主要方法
     *
     * @param n 门的个数
     * @return  门状态数组
     */
    private boolean[] calculate(int n) {
        boolean[] opened = new boolean[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                opened[j] = !opened[j];
            }
        }
        return opened;
    }

}
