package OnlineOJTest;

import java.util.Scanner;

/**
 * 计算一系列数的和
 * 输入描述：输入数据包括多组；每组数据一行,每行的第一个整数为整数的个数n(1 <= n <= 100), n为0的时候结束输入；接下来n个正整数,即需要求和的每个正整数。
 * 输出描述：每组数据输出求和的结果
 */
public class DSeriesNumberAddNoHavaTotalLineNumEndWithZero {
    /**
     * 1、首先获取每一行的第一个数值，得到该行需要相加的数字的个数。如果为0，则使用 break 跳出循环。
     * 2、然后使用 for 循环遍历获取每行的其余所有数值并进行累加。
     * 3、最后输出每行不包含第一个数字之和。
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int nums = sc.nextInt();
            if (nums == 0) break;
            int sum = 0;
            for (int i = 0; i < nums; i++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}
