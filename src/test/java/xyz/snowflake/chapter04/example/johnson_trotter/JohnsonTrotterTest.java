package xyz.snowflake.chapter04.example.johnson_trotter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-13 13:44
 */
public class JohnsonTrotterTest {

    private final JohnsonTrotter johnsonTrotter = new JohnsonTrotter();


    @Test
    public void johnsonTrotter() {
        int[] nums3 = new int[]{1, 2, 3};
        int[] nums4 = new int[]{1, 2, 3, 4};

        System.out.println("===============3===============");
        johnsonTrotter.johnsonTrotter(nums3);

        System.out.println("===============4===============");
        johnsonTrotter.johnsonTrotter(nums4);

    }
}