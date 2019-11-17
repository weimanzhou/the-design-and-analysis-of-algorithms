package xyz.snowflake.chapter04.example.josephus_problem_by_xiaoying;

/**
 * @author snowflake
 * @email 278121951@qq.com
 * @create-date 2019-10-15 20:55
 */
public class JosephusProblemByXiaoying {

    private static int flag = 0;

    //约瑟夫斯问题
    public static void main (String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("请输入一个数字：");
//        int number = input.nextInt();
        josephus_2(new int[]{1, 2, 3, 4, 5, 6});
    }

    /**
     * 使用递归的算法来不断的计算存活的人数
     *
     * @param numbers      int类型
     */
    private static void josephus(int numbers) {
        //如果只有一个人的情况下，那么这一个人存活J(K) = 1
        //如果有偶数的情况下，那么情况为J(2 * K) = 2 * J(K) - 1
        //如果有奇数的情况下，那么情况为J(2 * K + 1) = 2 * J(K) + 1
        if (numbers == 1) {
            flag = 1;
        } else if (numbers % 2 == 0) {
            josephus(numbers / 2);
            flag = flag * 2 - 1;
        } else if (numbers % 2 != 0) {
            josephus((numbers - 1) / 2);
            flag = flag * 2 + 1;
        }
    }

    /**
     * 使用非递归循环的方法来得出最后一个幸运者
     *
     * @param arrNumbers     int类型数组
     */
    private static void josephus_2 (int[] arrNumbers) {
        //计算arrNumbers.length的长度
        int length = arrNumbers.length;
        int[] arrNumberNew = new int[0];
        while (length != 1) {
            //如果为偶数的时候，长度缩小为原来的一半
            //如果为奇数的情况,长度缩小为原来的一半
            if (length % 2 == 0) {
                length = length / 2;
                arrNumberNew = new int[length];
                //从1开始
                for (int i = 0; i < arrNumberNew.length; i++)
                    arrNumberNew[i] = arrNumbers[2 * i];
            } else if (length % 2 != 0) {
                length = length / 2;
                arrNumberNew = new int[length];
                for (int i = 0; i < arrNumberNew.length; i++)
                    arrNumberNew[i] = arrNumbers[2 * i + 2];
            }
            arrNumbers = arrNumberNew;
        }
        System.out.println("幸存者为2：" + arrNumberNew[0]);
    }

}
