package OnlineOJTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ����һϵ�����ĺ�
 * �����������������������ÿ����������һ��;ÿ��ͨ���ո��������n���ַ���n��100
 * �������������ÿ��������������һ����������ַ�����ÿ���ַ���ͨ���ո����
 */
public class JMoreStringArraySortNoHavaTotalLineNumSplitByComma {
    /**
     * 1����ȡ�ַ����ĵ�i�У�ʹ�� String ��� split(" ") ���������ַ����ָ���һ���ַ�������.
     * 2��Ȼ��ʹ�� jdk �Դ��� Arrays ���Ĭ������������ص����������Ŀδ˵������or˳�򣬹ʴ˴�ʹ�ã�Arrays.sort(��������) ����
     * 3����ĿҪ�����Ϊ��һ���������ַ������ո�������޽�β�ո񡣹���Ҫ����дһ����ӡ����ķ���������ʹ�� jdk �Դ��� Arrays.toString(����) ���������
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] arr = line.split(" ");
            Arrays.sort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
                if (i != arr.length - 1)
                    System.out.print(" ");
                else
                    System.out.println();
            }
        }
    }
}
