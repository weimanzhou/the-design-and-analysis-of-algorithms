package xyz.snowflake.chapter04.example.counterfeit_currency_problem;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-14 19:07
 */
public class CounterfeitCurrencyProblemTest {

    private final CounterfeitCurrencyProblem counterfeitCurrency = new CounterfeitCurrencyProblem();

    @Test
    public void counterfeitCurrencyProblem() {
        int[] coins1 = {1, 2, 2, 2, 2, 2};
        System.out.println(Arrays.toString(coins1) + " : " +
                counterfeitCurrency.counterfeitCurrencyProblem(coins1));

        int[] coins2 = {2, 2, 2, 2, 2, 2, 1};
        System.out.println(Arrays.toString(coins2) + " : " +
                counterfeitCurrency.counterfeitCurrencyProblem(coins2));

        int[] coins3 = {2, 1, 2, 2, 2, 2, 2, 2};
        System.out.println(Arrays.toString(coins3) + " : " + counterfeitCurrency.counterfeitCurrencyProblem(coins3));
    }
}