package xyz.snowflake.chapter03.example.bfs;

import java.util.ArrayDeque;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-28 14:27
 */
public class BFS {

    public void bfs(int[][] graph, int start) {
        // 定义一个队列
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        // 定义一个访问标记数组
        boolean[] visited = new boolean[graph.length];
        queue.add(start);
        visited[start] = true;
        while (!queue.isEmpty()) {
            int i = queue.removeFirst();
            for (int j = 0; j < graph.length; j++)
                if (!visited[j] && graph[i][j] != 0) {
                    visited[j] = true;
                    queue.addLast(j);
                    System.out.println(i + " --> " + j);
                }
        }
    }

}
