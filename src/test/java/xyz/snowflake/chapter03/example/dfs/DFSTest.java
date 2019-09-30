package xyz.snowflake.chapter03.example.dfs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-28 14:18
 */
public class DFSTest {

    private final DFS dfs = new DFS();

    @Test
    public void dfs() {
        int[][] graph = {
                {0, 1, 1, 1},
                {1, 0, 2, 0},
                {1, 1, 0, 0},
                {1, 0, 0, 0}
        };

        dfs.dfs(graph, 0);
    }

}