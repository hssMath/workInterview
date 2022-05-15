package OnlineOJTest;

import java.util.Scanner;

/**
 * 计算 a+b
 * 输入描述：输入数据包括多组；每组数据一行,每行的第一个整数为整数的个数n(1 <= n <= 100), n为0的时候结束输入。接下来n个正整数,即需要求和的每个正整数。
 * 输出描述：每组数据输出求和的结果
 */
public class CTwoNumberAddSampleEndWithZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            if (a == 0) break;
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}