package CLeetCodeExercise.istring;

import java.util.Arrays;
import java.util.Scanner;

/**
 * NC10 �����˷�,���������ַ�������ʽ�����������֣���дһ�������������ǵĳ˻������ַ�����ʽ���ء�
 * ˼·��
 *      ��������ò��û���㷨��·����Ŀ��Ӧ����ֽ�ϻ�ͼ�����㣬�ó�����
 */
public class A38StingMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().trim().replace("\"", "").split(",");
        System.out.println(Arrays.toString(strings));
        String s = strings[0];
        String t = strings[1];
        System.out.println(multiplication(s, t));
    }

    /**
     * ˼·��
     *      1���������ַ���ת��Ϊ����������ʽ��ʹ�ã��ַ�-'0'��
     *      2����λ��ˣ��м� i * j �����ظ����֣��磺89 * 12, ����res = [0, 81, 82+91, 92]
     *      3�������λ��Ҳ��������res���ұ�Ԫ�ؿ�ʼ�����λ
     *      4�����Ŵ����λ��ʼ�ռ��������
     * @param s
     * @param t
     * @return
     */
    private static String multiplication(String s, String t) {
        //���ַ���ת��Ϊ������ʽ
        int lenS = s.length(), lenT = t.length();
        int[] arrS = new int[lenS];
        int[] arrT = new int[lenT];
        for(int i = 0; i < lenS; i++) {
            arrS[i] = s.charAt(i) - '0';
        }
        for(int i = 0; i < lenT; i++) {
            arrT[i] = t.charAt(i) - '0';
        }
        // ��Ž��
        int[] res = new int[lenS + lenT];
        // �м� i * j �����ظ����֣���:89 * 12, ����res = [0, 8*1, 8*2+9*1, 9*2]
        for(int i = 0; i < lenS; i++) {
            for(int j = 0; j < lenT; j++) {
                // i + j + 1 ��Ϊ�˸���λ��һ��λ��
                res[i + j + 1] += arrS[i] * arrT[j];
            }
        }
        // ��λ��ֵ
        int carry = 0;
        // �����λ��Ҳ��������res���ұ�Ԫ�ؿ�ʼ�����λ
        for(int i = lenS + lenT - 1; i >= 0; i--) {
            res[i] += carry;
            carry = res[i] / 10;
            res[i] = res[i] % 10;
        }
        StringBuilder ans = new StringBuilder();
        // ��ʾ��ǰλ�������������Ŀ�����ҳ���λ��0��λ�ã�ǰ�õ�0��Ҫ���Ե�
        int cur = 0;
        while(cur < lenS + lenT && res[cur] == 0) {
            cur++;
        }
        // �ռ����
        for(int i = cur; i < res.length; i++) {
            ans.append(res[i]);
        }
        return ans.length() == 0 ? "0" : ans.toString();
    }
}