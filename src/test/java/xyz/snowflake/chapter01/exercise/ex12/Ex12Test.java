package xyz.snowflake.chapter01.exercise.ex12;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-04 16:45
 */
public class Ex12Test {

    private final Ex12 ex = new Ex12();

    /** 门的个数 */
    private final int n = 10;

    @Test
    public void lockFloorList() {
        System.out.println("锁着门的编号：" + Arrays.toString(ex.lockFloorList(n)));
    }

    @Test
    public void openFloorList() {
        System.out.println("开着门的编号：" + Arrays.toString(ex.openFloorList(n)));
    }

    @Test
    public void lockFloor() {
        System.out.println("锁着门的个数：" + ex.lockFloor(n));
    }

    @Test
    public void openFloor() {
        System.out.println("开着门的编号：" + ex.openFloor(n));
    }

}