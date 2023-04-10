package CLeetCodeExercise.ebinarycal;

import java.util.Scanner;

/**
 * 描述：写出一个程序，接收一个十六进制的数，输出该数值的十进制表示。
 * 输入描述：
 *      输入一个十六进制的数值字符串。
 * 输出描述：
 *      输出该数值的十进制字符串。不同组的测试用例用\n隔开。
 */
public class HJ5_Base_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // 截掉十六进制前面的0x
        System.out.println(Integer.parseInt(str.substring(2), 16));
    }
}