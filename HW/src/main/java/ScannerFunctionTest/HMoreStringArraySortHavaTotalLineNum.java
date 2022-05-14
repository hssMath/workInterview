package ScannerFunctionTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 计算一系列数的和
 * 输入描述：输入有两行，第一行n;第二行是n个字符串，字符串之间用空格隔开
 * 输出描述：输出一行排序后的字符串，空格隔开，无结尾空格
 */
public class HMoreStringArraySortHavaTotalLineNum {
    /**
     * 1、首先直接获取到组成字符串的字符数组的数目
     * 2、定义一个指定长度的字符串数组
     * 3、因为已经知道了字符串数组的长度，并且需要给字符串每个位置设置值，故使用for循环遍历获取值。不能用while，因为while没有下标。
     * 4、字符串数组添加完毕之后，使用 jdk 自带的 Arrays 默认正序的特点 进行排序，题目未说明逆序or顺序，故此处使用：Arrays.sort(排序数组) 即可
     * 5、题目要求输出为：一行排序后的字符串，空格隔开，无结尾空格。故需要单独写一个打印输出的方法。不能使用 jdk 自带的 Arrays.toString(数组) 进行输出。
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] strs = new String[n];
        for (int i = 0; i < n; i++) {
            strs[i] = sc.next();
        }
        Arrays.sort(strs);
        for (int i = 0; i < n; i++) {
            System.out.print(strs[i]);
            if (i != n - 1)
                System.out.print(" ");
        }
//        System.out.println(Arrays.toString(strs));
    }
}
