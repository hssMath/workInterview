package OnlineOJTest;

import java.util.Scanner;

/**
 * ����һϵ�����ĺ�
 * �����������������ݰ������飻ÿ������һ��,ÿ�еĵ�һ������Ϊ�����ĸ���n(1 <= n <= 100), nΪ0��ʱ��������룻������n��������,����Ҫ��͵�ÿ����������
 * ���������ÿ�����������͵Ľ��
 */
public class DSeriesNumberAddNoHavaTotalLineNumEndWithZero {
    /**
     * 1�����Ȼ�ȡÿһ�еĵ�һ����ֵ���õ�������Ҫ��ӵ����ֵĸ��������Ϊ0����ʹ�� break ����ѭ����
     * 2��Ȼ��ʹ�� for ѭ��������ȡÿ�е�����������ֵ�������ۼӡ�
     * 3��������ÿ�в�������һ������֮�͡�
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            int nums = sc.nextInt();
            if (nums == 0) break;
            int sum = 0;
            for (int i = 0; i < nums; i++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);
        }
    }
}
