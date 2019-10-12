package xyz.snowflake.chapter05.example.topological_sort;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-10 14:39
 */
public class TopologicalSortTest {

    private final TopologicalSort topo = new TopologicalSort();

    @Test
    public void topologicalSort() {
        // 1 0 2 3 4
        int[][] map = {
                {0, 0, 1, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0}
        };

        List<Integer> ans =  topo.topologicalSort(map);
        System.out.println(ans);
    }
}