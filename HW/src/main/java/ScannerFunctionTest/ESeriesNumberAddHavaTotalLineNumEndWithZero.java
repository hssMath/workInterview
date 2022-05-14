package ScannerFunctionTest;

import java.util.Scanner;

/**
 * 计算一系列数的和
 * 输入描述：输入的第一行包括一个正整数t表示数据组数;接下来t行, 每行一组数据;每行的第一个整数为整数的个数n;接下来n个正整数, 即需要求和的每个正整数。
 * 输出描述：每组数据输出求和的结果
 */
public class ESeriesNumberAddHavaTotalLineNumEndWithZero {
    /**
     * 1、首先获取到第一行的行数，使用一个临时变量在循环代码块之外搁置起来，使其不参与后续计算。
     * 2、然后获取每一行的第一个数值，得到该行需要相加的数字的个数。使用 for 循环遍历获取每行的其余所有数值并进行累加。
     * 3、最后输出每行不包含第一个数字之和。
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        while (sc.hasNextInt()) {
            int nums = sc.nextInt();
            int sum = 0;
            for (int i = 0; i < nums; i++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}
