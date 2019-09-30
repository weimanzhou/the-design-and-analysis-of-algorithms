package xyz.snowflake.chapter03.example.brute_force_closest_points;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-27 22:20
 */
public class BruteForceClosestPoints {

    public double bruteForceClosestPoints(int[][] points) {
        double minDis = Double.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                minDis = Math.min(minDis, Math.sqrt(Math.pow(points[j][1] - points[i][1], 2) + Math.pow(points[j][0] - points[i][0], 2)));
            }
        }
        return Double.valueOf(String.format("%.4f", minDis));
    }

}
