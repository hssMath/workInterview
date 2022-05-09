package Aapplication;

import java.util.Scanner;

public class A3_BitCalculation {
    /**
     * 描述:输入一个int型的正整数，计算出该int型数据在内存中存储时1的个数。
     * 输入描述：输入一个整数（int类型）
     * 输出描述：这个数转换成2进制后，输出1的个数
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()){
            int num = sc.nextInt();
            String str = Integer.toBinaryString(num);
            num = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '1') {
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}
