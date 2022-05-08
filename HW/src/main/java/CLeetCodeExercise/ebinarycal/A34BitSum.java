package CLeetCodeExercise.ebinarycal;

import java.util.Arrays;

/**
 * 338. 比特位计数：给你一个整数 n ，对于 0 <= i <= n 中的每个 i ，计算其二进制表示中 1 的个数，返回一个长度为 n + 1 的数组 ans 作为答案。
 */
public class A34BitSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(21)));
//        System.out.println(Arrays.toString(countBitsByHashMap(21)));
    }

    /**
     * 思路1：使用 x=x&x(x-1)，代替对一个数的二进制数的1的计数。
     * 1、获取n个数中，指定某个数然后被转化为二进制后1的个数
     * 2、当前数使用数组前面的数做一个递归操作
     * @param num
     * @return
     */
    public static int[] countBits(int num) {
        int[] bits = new int[num + 1];//新建一个临时结果数组，因为数组的元素下标从0开始，所以结果数组的长度为 num+1
        for (int i = 1; i <= num; i++) {//第一个数值默认是0，从1开始获取第1个元素的二进制数的1的个数。
            bits[i] = bits[i & (i - 1)] + 1;//每次都是用后面的
        }
        return bits;
    }


    /**
     * 思路2：获取从0到指定数字的二进制字符串的数组
     * @param num
     * @return
     */
    public static int[] countBitsByHashMap(int num) {
        int[] bits = new int[num + 1];//新建一个临时结果数组，因为数组的元素下标从0开始，所以结果数组的长度为 num+1
        for (int i = 0; i <= num; i++) {
            bits[i] = getNum(Integer.toBinaryString(i), "1");
        }
        return bits;
    }

    /**
     * 获取二进制数中1的个数
     *
     * @param originStr
     * @param targetStr
     * @return
     */
    public static int getNum(String originStr, String targetStr) {
        String result = originStr.replaceAll(targetStr, "");
        int i = originStr.length() - result.length();
        return i;
    }
}
