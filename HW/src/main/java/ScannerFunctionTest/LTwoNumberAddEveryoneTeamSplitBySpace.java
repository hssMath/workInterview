package ScannerFunctionTest;

import java.util.Scanner;

/**
 * 自测本地通过提交为0
 * 输入描述：输入有多组测试用例，每组空格隔开两个整数
 * 输出描述：对于每组数据输出一行两个整数的和
 */
public class LTwoNumberAddEveryoneTeamSplitBySpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] arr = line.split(" ");
            long sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += Long.parseLong(arr[i]);
            }
            System.out.println(sum);
        }
    }
}
