package CLeetCodeExercise.ebinarycal;

import java.util.Scanner;

/**
 * ������д��һ�����򣬽���һ��ʮ�����Ƶ������������ֵ��ʮ���Ʊ�ʾ��
 * ����������
 *      ����һ��ʮ�����Ƶ���ֵ�ַ�����
 * ���������
 *      �������ֵ��ʮ�����ַ�������ͬ��Ĳ���������\n������
 */
public class HJ5_Base_Conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // �ص�ʮ������ǰ���0x
        System.out.println(Integer.parseInt(str.substring(2), 16));
    }
}