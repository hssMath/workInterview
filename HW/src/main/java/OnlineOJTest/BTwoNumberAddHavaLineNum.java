package OnlineOJTest;

import java.util.Scanner;

/**
 * ���� a+b
 * ���������������һ�а���һ����������t(1 <= t <= 100)��������ÿ�а�������������a,b(1 <= a, b <= 1000)
 */
public class BTwoNumberAddHavaLineNum {
    /**
     * 1��������Ŀ��������ʾ�����ԣ���һ����һ���������������ʵ�ʳ������ò���,�ʿ����Ȼ�ȡ����������������������㣬���඼��2����Ϊһ��ʵ�ʲ��������Ŀ������
     * 2����ʵ���Բ�ʱ������һ����¼������˵ġ�
     * 3����ȡֵʱ����Ϊ������ȫΪ���֣���ʹ�� while(in.hasNextInt()) ��ѭ���ж��Ƿ���ֵ��ȡ�������ֵ��ȡ���Ϳ���ʹ��2��������ȡֵ������sc.nextInt()������ȡֵ��Ȼ�������ͨ��sout���������
     *
     * @param args
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
