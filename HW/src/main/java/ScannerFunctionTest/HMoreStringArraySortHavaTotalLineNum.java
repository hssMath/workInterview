package ScannerFunctionTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ����һϵ�����ĺ�
 * �������������������У���һ��n;�ڶ�����n���ַ������ַ���֮���ÿո����
 * ������������һ���������ַ������ո�������޽�β�ո�
 */
public class HMoreStringArraySortHavaTotalLineNum {
    /**
     * 1������ֱ�ӻ�ȡ������ַ������ַ��������Ŀ
     * 2������һ��ָ�����ȵ��ַ�������
     * 3����Ϊ�Ѿ�֪�����ַ�������ĳ��ȣ�������Ҫ���ַ���ÿ��λ������ֵ����ʹ��forѭ��������ȡֵ��������while����Ϊwhileû���±ꡣ
     * 4���ַ�������������֮��ʹ�� jdk �Դ��� Arrays Ĭ��������ص� ����������Ŀδ˵������or˳�򣬹ʴ˴�ʹ�ã�Arrays.sort(��������) ����
     * 5����ĿҪ�����Ϊ��һ���������ַ������ո�������޽�β�ո񡣹���Ҫ����дһ����ӡ����ķ���������ʹ�� jdk �Դ��� Arrays.toString(����) ���������
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
