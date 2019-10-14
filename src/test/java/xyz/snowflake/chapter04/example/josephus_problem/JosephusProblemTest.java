package xyz.snowflake.chapter04.example.josephus_problem;

import org.junit.Test;
import xyz.snowflake.chapter04.example.josephus_problem_by_math.JosephusProblemByMath;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-14 19:37
 */
public class JosephusProblemTest {

    private final JosephusProblem jose = new JosephusProblem();

    @Test
    public void josephusProblem() {
        int[] persons6 = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(persons6) + " : " +jose.josephusProblem(persons6));

        int[] persons7 = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(persons7) + " : " +jose.josephusProblem(persons7));
    }

}