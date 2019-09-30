package xyz.snowflake.chapter03.example.bfs;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-28 14:34
 */
public class BFSTest {

    private final BFS bfs = new BFS();

    @Test
    public void bfs() {
        int[][] graph = {
                {0, 1, 1, 1},
                {1, 0, 2, 0},
                {1, 1, 0, 0},
                {1, 0, 0, 0}
        };

        bfs.bfs(graph, 0);
    }

}