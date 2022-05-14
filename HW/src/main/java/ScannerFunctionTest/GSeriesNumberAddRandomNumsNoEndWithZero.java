package ScannerFunctionTest;

import java.util.Scanner;

/**
 * 计算一系列数的和
 * 输入描述：输入数据有多组, 每行表示一组输入数据;每行不定有n个整数，空格隔开。(1 <= n <= 100)。
 * 输出描述：每组数据输出求和的结果
 */
public class GSeriesNumberAddRandomNumsNoEndWithZero {
    /**
     * 解决每行的数字个数不一致问题
     * 1、每次读取一行，然后使用 String 类的 split()方法，分割字符串，返回一个字符串数组。
     * 2、循环遍历字符串数组，做一个累加。
     * 3、最后输出汇总的结果值。
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] snums = line.split(" ");
            int sum = 0;
            for (int i = 0; i < snums.length; i++) {
                sum += Integer.parseInt(snums[i]);
            }
            System.out.println(sum);
        }
    }
}
