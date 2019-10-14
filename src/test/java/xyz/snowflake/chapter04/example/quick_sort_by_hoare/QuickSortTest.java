package xyz.snowflake.chapter04.example.quick_sort_by_hoare;

import org.junit.Test;
import xyz.snowflake.chapter04.example.quick_sort.QuickSort;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-12 14:41
 */
public class QuickSortTest {

    private final QuickSortByHoare sort = new QuickSortByHoare();

    @Test
    public void quickSort() {
        int[] arr = Stream.iterate(2, e -> e + (int) (Math.random() * 100 + (int) (Math.random() * 200)))
                .mapToInt(Integer::intValue)
                .limit(5000)
                .toArray();

        int[] t1 = arr.clone();

        Instant start = Instant.now();
        sort.quickSort(t1);
        Instant end = Instant.now();
        System.out.println("Hoare: diff: " + Duration.between(start, end).toMillis() + "ms");
        System.out.println(Arrays.toString(t1));


        int[] t2 = arr.clone();
        Instant start2 = Instant.now();
        new QuickSort().quickSort(t2);
        Instant end2 = Instant.now();
        System.out.println("Lomuto: diff: " + Duration.between(start2, end2).toMillis() + "ms");
        System.out.println(Arrays.toString(t2));

    }

}