package ScannerFunctionTest;

import java.util.Scanner;

/**
 * 计算一系列数的和
 * 输入描述：输入数据有多组, 每行表示一组输入数据。每行不定有n个整数，空格隔开。(1 <= n <= 100)。
 * 输出描述：每组数据输出求和的结果
 */
public class FSeriesNumberAddNoHavaTotalLineNumNoEndWithZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
