package ScannerFunctionTest;

import java.util.Scanner;

/**
 * ����һϵ�����ĺ�
 * �������������������ж���, ÿ�б�ʾһ����������;ÿ�в�����n���������ո������(1 <= n <= 100)��
 * ���������ÿ�����������͵Ľ��
 */
public class GSeriesNumberAddRandomNumsNoEndWithZero {
    /**
     * ���ÿ�е����ָ�����һ������
     * 1��ÿ�ζ�ȡһ�У�Ȼ��ʹ�� String ��� split()�������ָ��ַ���������һ���ַ������顣
     * 2��ѭ�������ַ������飬��һ���ۼӡ�
     * 3�����������ܵĽ��ֵ��
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] snums = line.split(" ");
            int sum = 0;
            for (int i = 0; i < snums.length; i++) {
                sum += Integer.parseInt(snums[i]);
            }
            System.out.println(sum);
        }
    }
}
