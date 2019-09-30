package xyz.snowflake.chapter03.example.assignment_problem;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-28 23:39
 */
public class AssignmentProblemTest {

    private final AssignmentProblem assignment = new AssignmentProblem();

    @Test
    public void assignmentProblem() {
        int[][] costs = {
                {9, 2, 7, 8},
                {6, 4, 3, 7},
                {5, 8, 1, 8},
                {7, 6, 9, 4}
        };

        int[] ans = assignment.assignmentProblem(costs);

        for (int i = 0; i < ans.length - 1; i++)
            System.out.println("第" + (i + 1) + "个人做任务" + (ans[i]) + ",价格为：" + costs[i][ans[i]]);
        System.out.println("总花费为: " + ans[ans.length - 1]);
    }
}