package OnlineOJTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 计算一系列数的和
 * 输入描述：多个测试用例，每个测试用例一行;每行通过空格隔开，有n个字符，n＜100
 * 输出描述：对于每组测试用例，输出一行排序过的字符串，每个字符串通过空格隔开
 */
public class JMoreStringArraySortNoHavaTotalLineNumSplitByComma {
    /**
     * 1、获取字符串的第i行，使用 String 类的 split(" ") 方法进行字符串分割，获得一个字符串数组.
     * 2、然后使用 jdk 自带的 Arrays 类的默认排序正序的特点进行排序，题目未说明逆序or顺序，故此处使用：Arrays.sort(排序数组) 即可
     * 3、题目要求输出为：一行排序后的字符串，空格隔开，无结尾空格。故需要单独写一个打印输出的方法。不能使用 jdk 自带的 Arrays.toString(数组) 进行输出。
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] arr = line.split(" ");
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i != arr.length - 1)
                    System.out.print(" ");
                else
                    System.out.println();
            }
        }
    }
}
