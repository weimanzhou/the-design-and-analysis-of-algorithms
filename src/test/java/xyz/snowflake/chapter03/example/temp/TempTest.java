package xyz.snowflake.chapter03.example.temp;

import org.junit.Test;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-25 15:14
 */
public class TempTest {

    private final Temp temp = new Temp();


    @Test
    public void temp() {
        int[] nums3 = new int[]{1, 2, 3};
        int[] nums4 = new int[]{1, 2, 3, 4};

        System.out.println("===============3===============");
        temp.temp(nums3);

        System.out.println("===============4===============");
        temp.temp(nums4);
    }
}