package ScannerFunctionTest;

import java.util.Scanner;

/**
 * ����һϵ�����ĺ�
 * �������������������ж���, ÿ�б�ʾһ���������ݡ�ÿ�в�����n���������ո������(1 <= n <= 100)��
 * ���������ÿ�����������͵Ľ��
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
