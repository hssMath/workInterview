package OnlineOJTest;

import java.util.Scanner;

/**
 * ���� a+b
 * �����������������ݰ������飻ÿ������һ��,ÿ�еĵ�һ������Ϊ�����ĸ���n(1 <= n <= 100), nΪ0��ʱ��������롣������n��������,����Ҫ��͵�ÿ����������
 * ���������ÿ�����������͵Ľ��
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