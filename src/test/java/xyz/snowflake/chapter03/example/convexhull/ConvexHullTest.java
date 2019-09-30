package xyz.snowflake.chapter03.example.convexhull;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-22 20:09
 */
public class ConvexHullTest {

    private final ConvexHull ch = new ConvexHull();

    @Test
    public void convexHull() {
        // [[0,2],[0,9],[1,2],[1,4],[2,9],[3,7],[5,4],[5,8],[6,2],[6,4],[6,9],[7,3],[7,4],[7,9],[9,4],[9,6],[9,7],[9,8]]
        Point[] points = new Point[]{
                new Point(0, 2),
                new Point(0, 9),
                new Point(1, 2),
                new Point(1, 4),
                new Point(2, 9),
                new Point(3, 7),
                new Point(5, 4),
                new Point(5, 8),
                new Point(6, 2),
                new Point(6, 4),
                new Point(6, 9),
                new Point(7, 3),
                new Point(7, 4),
                new Point(7, 9),
                new Point(9, 4),
                new Point(9, 6),
                new Point(9, 7),
                new Point(9, 8)
        };

        List<Point> ans = new ArrayList<>(new HashSet<>(ch.convexHull(points)));
        System.out.println("========Jarvis步进法======");
        ans.forEach(System.out::println);

        List<Point> pointList = new ArrayList<>(Arrays.asList(points));
        List<Edge> ans2 = new ArrayList<>(new HashSet<>(ch.convexHull(pointList)));
        System.out.println("==========蛮力法=========");
        ans2.forEach(System.out::println);
    }

    @Test
    public void convexHullByGraham() {
        PointForGraham[] points = new PointForGraham[]{
                new PointForGraham(2, 1),
                new PointForGraham(3, 3),
                new PointForGraham(0, 2),
                new PointForGraham(2, 2),
                new PointForGraham(1, 4)
        };

        List<PointForGraham> ans = ch.convexHullByGraham(points);
        ans.forEach(System.out::println);
    }

}