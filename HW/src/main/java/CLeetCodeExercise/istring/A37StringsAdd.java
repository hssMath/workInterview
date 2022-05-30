package CLeetCodeExercise.istring;

import java.util.Arrays;
import java.util.Scanner;

/**
 * ������ӣ��Ϳ��԰���������ӵķ�ʽ���Ӹ�λ��ʼ���������ۼӣ������ַ����о��Ǵ������ַ�����ĩβ��ʼ��ӡ�
 * �������ݾ�:"9","99999999999999999999999999999999999999999999999999999999994"
 *
 * �ܽ᣺
 *     1������һ������������������ͨ����String.charAt(i)����������ȡ�ַ����е�ÿһ���ַ���(�����ַ���ת��Ϊ���͵ķ���:�ַ���-'0')
 *          ��Ȼ���Ի��ÿһ���ַ�ֵ��������Ϊ���ַ����Ͳ���ֱ�ӻ�ȡ����ֵ��ֻ��Ҫ���ַ�-'0'�����ɻ�������ַ����͵���ֵ����Ϊ�ַ��ļӼ�ʵ���� �ַ� or �ַ����� ascll ��ֵ�ļӼ����䷵�ؽ��Ϊ int��
 *     2�����߱�̣��������ݺ�̨���շ�ʽ���ܣ�
 *          "654321","9" : String.trim().replace("\"","").split(",") ������һ�� String[]��
 *          654321,9     : String.trim().split(",") ������һ�� String[]��
 *          654321 9     : String.trim().split(" ") ������һ�� String[]��
 */
public class A37StringsAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().trim().replace("\"", "").split(",");
        System.out.println(Arrays.toString(strings));
        String s = strings[0];
        String t = strings[1];
        System.out.println(addStrings("9","99999999999999999999999999999999999999999999999999999999999994"));
    }

    /**
     * ˼·������ַ�������2���ַ������ұ��ַ�-'0'�������õ�2���ַ�����ʵֵ��Ȼ��2����ʵֵ���λ��������ӣ�
     *      �õ���֮����10ȡ�࣬��ȡ������ʼ����ƴ�ӣ�Ȼ���ȡ��λ�ı�����ѭ���������в�����
     * ע��:
     *  1��ͨ��ɨ���ַ����ĵ����ַ����ַ�0�Ĳ�ֵ����ȡ��ʵ����ֵ��
     *  2��ÿ��ȡ����ʵֵ����10ȡ�࣬���֮����ȡ��λ������������ѭ����
     * @param num1
     * @param num2
     */
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();//�û�����ַ�����ƴ��
        int carry = 0;//��¼��λ�ı���
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--) {//i��j���е�����
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x + y + carry) % 10);//ȡ����ʮ���١�ǧ����λ������
            carry = (x + y + carry) / 10;//��һλ��ֵ+1��
        }
        return sb.reverse().toString();
    }
}