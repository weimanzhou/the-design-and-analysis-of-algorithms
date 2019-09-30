package xyz.snowflake.chapter03.example.dfs;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-28 13:53
 */
public class DFS {

    /**
     * 深度遍历
     *
     * @param graph 图的二维数组
     * @param start 起点下标
     */
    public void dfs(int[][] graph, int start) {
        // 定义一个访问标记数组
        boolean[] visited = new boolean[graph.length];
        // 标记起始点被访问过
        for (int i = start, j = 0; i != start || j == 0; i = (i + 1) % graph.length, j++) {
            // 如果这个点没有被访问过，从这个点开始进行深度变量
            if (!visited[i]) {
                // 标记这个点被访问过
                visited[i] = true;
                // 进行深度遍历
                dfs(graph, i, visited);
            }
        }
    }

    /**
     * 深度遍历的具体实现
     *
     * @param graph     图的二维数组表示
     * @param i         起始下标
     * @param visited   标记数组
     */
    private void dfs(int[][] graph, int i, boolean[] visited) {
        visited[i] = true;
        for (int j = 0; j < graph.length; j++) {
            if (graph[i][j] != 0 && !visited[j]) {
                System.out.println(i + " --> " + j);
                dfs(graph, j, visited);
            }
        }
    }

}
