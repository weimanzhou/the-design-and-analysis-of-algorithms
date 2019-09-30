package xyz.snowflake.chapter03.example.travelling_salesman_problem;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-27 22:57
 */
public class TravellingSalesmanProblemTest {

    private final TravellingSalesmanProblem travel = new TravellingSalesmanProblem();

    @Test
    public void travellingSalesmanProblem() {
        int[] points = new int[]{1, 2, 3, 4};
        int[][] dis = {
                {0, 2, 5, 7},
                {2, 0, 8, 3},
                {5, 8, 0, 1},
                {7, 3, 1, 0}
        };

        List<Integer> ans = travel.travellingSalesmanProblem(points, dis, 0);

        System.out.println(ans);
    }
}