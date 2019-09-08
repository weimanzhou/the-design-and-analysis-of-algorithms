package xyz.snowflake.chapter01.example.gcd;

import java.util.Scanner;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-04 22:15
 */
public class Topic_1 {
    //利用质数分解法来进行计算
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入非负整数m和n：");
        int m, n;
        m = input.nextInt();
        n = input.nextInt();
        System.out.println("最大公约数为" + gcd(m, n));
    }

    private static int gcd(int m, int n) {
        int[] arr_m = resolve(m);
        int[] arr_n = resolve(n);
        int max = 1;
        for (int i = 0; i < arr_m.length && arr_m[i] != 0; i++) {
            for (int j = 0; j < arr_n.length; j++) {
                if (arr_m[i] == arr_n[j]) {
                    max = max * arr_m[i];
                    arr_n[j] = 0;
                    break;
                }
            }
        }
        return max;
    }

    private static int[] resolve(int m) {
        int[] arr = new int[20];
        int num = 0;
        int temp = m;
        for (int i = 2; i <= temp / 2; i++) {
            while (m % i == 0) {
                if (m == i) {
                    arr[num] = i;
                    break;
                } else {
                    m = m / i;
                    arr[num] = i;
                    num = num + 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        return arr;
    }
}