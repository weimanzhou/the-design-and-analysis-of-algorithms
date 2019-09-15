package xyz.snowflake.chapter02.example.random;

import org.junit.Test;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-10 19:27
 */
public class RandomTest {

    private final Random random = new Random();

    @Test
    public void random() {
        for (int i = 0; i < 10; i++) {
            System.out.println(random.next());
        }
    }

    @Test
    public void randomInt() {
        int[] nums = new int[1000000];
        for (int i = 0; i < nums.length; i++)
            nums[i] = (int) (random.next() * 10);

        Map<Integer, Long> map = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Integer::intValue, Collectors.counting()));

        for (Map.Entry<Integer, Long> entry : map.entrySet())
            System.out.println(entry.getKey() + " ----> " + entry.getValue());
    }

}