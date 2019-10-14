package xyz.snowflake.chapter04.example.topological_sort;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-10 14:30
 */
public class TopologicalSort {

    /**
     * 对一个有向图进行拓扑排序
     *
     * @param map   矩阵表示一个有向图
     * @return      拓扑排序后的一个结果
     */
    public List<Integer> topologicalSort(int[][] map) {
        List<Integer> topoResult = new ArrayList<>();
        int[] inDegree = new int[map.length];
        for (int[] parent : map) {
            for (int i = 0; i < map.length; i++) {
                if (parent[i] != 0) {
                    inDegree[i]++;
                }
            }
        }

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 0) {
                queue.addLast(i);
            }
        }

        while (!queue.isEmpty()) {
            int curr = queue.removeFirst();
            topoResult.add(curr);

            for (int i = 0; i < map[curr].length; i++) {
                if (map[curr][i] != 0) {
                    if (inDegree[i] > 0) {
                        if (--inDegree[i] == 0)
                            queue.addLast(i);
                    }
                }
            }

        }

        return topoResult.size() == map.length ? topoResult : new ArrayList<>();
    }

}
