package xyz.snowflake.chapter03.example.convexhull;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

/**
 *
 * hard hard hard hard hard *****
 *
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-09-22 20:06
 */
public class ConvexHull {

    public List<Edge> convexHull(List<Point> points) {
        List<Edge> ans = new ArrayList<>();
        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < points.size(); i++) {
            for (int j = i + 1; j < points.size(); j++) {
                edges.add(new Edge(points.get(i), points.get(j)));
            }
        }
        // 然后遍历全部的变，查看剩下的点是否是全部在一边
        for (Edge edge : edges) {
            // 如果不是线上的点，才进行计算
            int leftCount = 0;
            int rightCount = 0;
            Point start = edge.start;
            Point end = edge.end;
            for (Point point : points) {
                if (!start.equals(point) && !end.equals(point)) {
                    int calculateValue = start.x * end.y +
                            point.x * start.y +
                            end.x * point.y -
                            point.x * end.y -
                            end.x * start.y -
                            start.x * point.y;
                    // 在线上的话，默认为左边，也是成功的
                    if (calculateValue < 0) leftCount++;
                    else if (calculateValue > 0) rightCount++;
                    else {
                        leftCount++;
                        rightCount++;
                    }
                }
            }
            if (leftCount == points.size() - 2 || rightCount == points.size() - 2) {
                ans.add(edge);
            }
        }
        return ans;
    }


    // -----------------------------------------------------------------------------------------------------------------
    // 方法二，步进法 -> Jarvis步进法
    // -----------------------------------------------------------------------------------------------------------------

    public List<Point> convexHull(Point[] points) {


        // 找到最下面的那个点
        Point min = new Point(Integer.MAX_VALUE, Integer.MAX_VALUE);
        for (int i = 0; i < points.length; i++) {
            if (points[i].y < min.y) {
                min = points[i];
            }
        }
        // 到这个地方，已经找到了最下面的那个点了
        List<Point> ans = new ArrayList<>();
        ans.add(min);
        // 定义一个辅助的点
        Point temp = new Point(-10000, min.y);
        Point start = new Point(min.x, min.y);
        // 记录点的个数
        int count = 0;
        // 定义一个访问标记数组
        boolean[] visited = new boolean[points.length];
        // 由于还要再次访问其实顶点，所以不能将其实顶点标记访问过
        // visited[minIndex] = true;
        while (count == 0 || !start.equals(min)) {
            // 遍历其他剩余的点
            double angle = Integer.MIN_VALUE;
            double distance = 0;
            int index = 0;
            List<Integer> angleEquals = new ArrayList<>();
            boolean flag = false;
            for (int i = 0; i < points.length; i++) {
                if (!visited[i]) {
                    double tempAngle = angle(start, temp, points[i]);
                    if (Math.abs(tempAngle - angle) < 1e-10) {
                        double dis = dis(start, points[i]);
                        if (dis > distance) {
                            angleEquals.add(index);
                            angle = tempAngle;
                            index = i;
                            distance = dis(start, points[i]);
                            flag = true;
                        } else {
                            angleEquals.add(i);
                            flag = true;
                        }
                    } else if (tempAngle > angle) {
                        angle = tempAngle;
                        index = i;
                        distance = dis(start, points[i]);
                        flag = false;
                    }
                    if (!flag) angleEquals.clear();
                }
            }
            // 统计完成之后
            visited[index] = true;
            count++;
            for (int ii : angleEquals) {
                visited[ii] = true;
                ans.add(points[ii]);
            }
            ans.add(points[index]);
            temp = new Point(start.x, start.y);
            start = points[index];
        }
        return ans;
    }

    /**
     * 计算向量的角度
     * 返回两个向量的角度
     */
    public double angle(Point start, Point end1, Point end2) {
        Point v1 = new Point(end1.x - start.x, end1.y - start.y);
        Point v2 = new Point(end2.x - start.x, end2.y - start.y);

        return Math.acos((v1.x * v2.x + v1.y * v2.y)
                / Math.sqrt((Math.pow(v1.x, 2) + Math.pow(v1.y, 2))
                * (Math.pow(v2.x, 2) + Math.pow(v2.y, 2))));

    }

    /**
     * 计算两点之间的距离
     */
    public double dis(Point start, Point end) {

        return Math.sqrt(Math.pow(start.x - end.x, 2) + Math.pow(start.y - end.y, 2));

    }

    // -----------------------------------------------------------------------------------------------------------------
    // 方法三，扫描法 -> Graham扫描法
    // -----------------------------------------------------------------------------------------------------------------
    public List<PointForGraham> convexHullByGraham(PointForGraham[] points) {
        PointForGraham min = new PointForGraham(0, Integer.MAX_VALUE);
        for (PointForGraham point : points) {
            if (point.y < min.y) {
                min = point;
            } else if (point.y == min.y && point.x < min.x)
                min = point;
        }

        // 计算偏移量
        int x = min.x;
        int y = min.y;

        // 更新每一个点
        for (PointForGraham point : points) {
            point.x -= x;
            point.y -= y;
        }

        Arrays.sort(points, 0, points.length);
        System.out.println(Arrays.toString(points));

        List<PointForGraham> ans = new ArrayList<>();

        ans.add(min);

        PointForGraham[] result = new PointForGraham[points.length];
        result[0] = min;
        result[1] = points[1];
        result[2] = points[2];
        int top = 2;
        for (int i = 3; i <= points.length; i++) {
            while (multi(result[top - 1], result[top], points[i]) <= 0)
                top--;
            result[top + 1] = points[i];
            top++;
        }

        //————————————————
        //版权声明：本文为CSDN博主「bwju」的原创文章，遵循 CC 4.0 BY-SA 版权协议，转载请附上原文出处链接及本声明。
        //原文链接：https://blog.csdn.net/u010251278/article/details/50469594

        for (PointForGraham point : result) {
            point.x += x;
            point.y += y;
            ans.add(point);
        }

        return ans;
    }

    /**
     * 叉乘
     *
     * @param p1 start
     * @param p2 end1
     * @param p3 end2
     * @return end1 - start X end2 - start
     */
    private double multi(PointForGraham p1, PointForGraham p2, PointForGraham p3) {
        return x(new PointForGraham(p2.x - p1.x, p2.y - p1.y), new PointForGraham(p3.x - p1.x, p3.y - p1.y));
    }

    /**
     * 叉乘
     *
     * @param a 向量1
     * @param b 向量2
     * @return 向量1 X 向量
     */
    private double x(PointForGraham a, PointForGraham b) {
        return a.x * b.y - a.y * b.x;
    }


}

class PointForGraham implements Comparable<PointForGraham> {
    int x;
    int y;

    public PointForGraham(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PointForGraham point = (PointForGraham) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public String toString() {
        return "[x: " + x + ", y:" + y + "]";
    }

    public int compareTo(PointForGraham o) {
        if (this.x < 0 && o.x >= 0) return 1;
        if (this.x >= 0 && o.x < 0) return -1;
        if (this.x > 0 && o.x > 0) return Double.compare(this.y * 1.0 / this.x, o.y * 1.0 / o.x);
        if (this.x < 0) return -Double.compare(this.y * 1.0 / this.x, o.y * 1.0 / o.x);
        if (this.x == 0 && o.x == 0) return this.y - o.y;
        int i = new ArrayList<Integer>().stream().mapToInt(Integer::intValue).sum();
        return -1;



    }

}


class Point implements Comparable<Point> {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        if (x != point.x) return false;
        return y == point.y;
    }

    @Override
    public String toString() {
        return "[x: " + x + ", y:" + y + "]";
    }

    public int compareTo(Point o) {
        return this.x == o.x && this.y == o.y ? 0 : -1;
    }

}

class Edge {
    Point start;
    Point end;

    public Edge(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}

