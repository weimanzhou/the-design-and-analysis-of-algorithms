package xyz.snowflake.chapter02.example.random;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-08 15:54
 */
public class Random {

    private int preNumber = (int) System.nanoTime();
    private int m = 1 << 30;
    private int a = (int) (0.33 * (1 << 30));
    private int b = 1;

    private double random() {
        // 将产生的 randomInt 转化为小数
        double randomDouble = Math.abs((a * preNumber + b) % m);
        preNumber = (int) randomDouble;
        while (randomDouble > 1)
            randomDouble /= 10.0;
        return randomDouble;
    }

    /**
     * 返回一个浮点型的随机数
     *
     * @return  随机的浮点数
     */
    public double next() {
        return random();
    }

}
