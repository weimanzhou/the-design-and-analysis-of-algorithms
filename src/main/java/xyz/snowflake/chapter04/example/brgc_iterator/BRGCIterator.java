package xyz.snowflake.chapter04.example.brgc_iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-25 20:29
 */
public class BRGCIterator {

    public List<String> brgcIterator(int n) {
        List<String> ans = new ArrayList<>();
        int[] nums = new int[n];

        for (int i = 1; i < Math.pow(2, n); i++) {
            StringBuilder sb = new StringBuilder();
            for (int num : nums) sb.append(num);
            ans.add(sb.reverse().toString());
            int index = index(i);
            if (nums[index] == 0) nums[index] = 1;
            else nums[index] = 0;
        }
        StringBuilder sb = new StringBuilder();
        for (int num : nums) sb.append(num);
        ans.add(sb.reverse().toString());
        int index = index(1);
        if (nums[index] == 0) nums[index] = 1;
        else nums[index] = 0;
        return ans;
    }

    public int index(int n) {
        n = n & -n;
        int count = 0;
        while (n != 0) {
            n >>= 1;
            count++;
        }
        return count - 1;
    }

}
