package ScannerFunctionTest;

import java.util.Scanner;

/**
 * ����һϵ�����ĺ�
 * ��������������ĵ�һ�а���һ��������t��ʾ��������;������t��, ÿ��һ������;ÿ�еĵ�һ������Ϊ�����ĸ���n;������n��������, ����Ҫ��͵�ÿ����������
 * ���������ÿ�����������͵Ľ��
 */
public class ESeriesNumberAddHavaTotalLineNumEndWithZero {
    /**
     * 1�����Ȼ�ȡ����һ�е�������ʹ��һ����ʱ������ѭ�������֮�����������ʹ�䲻����������㡣
     * 2��Ȼ���ȡÿһ�еĵ�һ����ֵ���õ�������Ҫ��ӵ����ֵĸ�����ʹ�� for ѭ��������ȡÿ�е�����������ֵ�������ۼӡ�
     * 3��������ÿ�в�������һ������֮�͡�
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
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
