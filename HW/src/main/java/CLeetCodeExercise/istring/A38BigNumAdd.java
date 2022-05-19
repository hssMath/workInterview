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
public class A38BigNumAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strings = sc.nextLine().trim().replace("\"", "").split(",");
        System.out.println(Arrays.toString(strings));
        String s = strings[0];
        String t = strings[1];
        System.out.println(solve(s, t));
    }

    /**
     *  ���ַ�������ʽ�����������֣���дһ�������������ǵĺͣ����ַ�����ʽ���ء�
     * @param s
     * @param t
     * @return
     */
    public static String solve(String s, String t) {
        if (s.length() <= 0)   return t;          //��������һ��Ϊ�գ�������һ��
        if (t.length() <= 0)   return s;          //��������һ��Ϊ�գ�������һ��

        //��sΪ�ϳ��ģ�tΪ�϶̵�
        if (s.length() < t.length()) {//�Ƚ�2���ַ����ĳ��ȣ����ϳ����ַ�������ǰ�档
            String temp = s;
            s = t;
            t = temp;
        }
        int carry = 0; //����һ����λ��־
        StringBuilder sb = new StringBuilder();//�û�����ַ�����ƴ��

        for (int i = s.length() - 1,j = t.length() - 1; i >= 0 || j >= 0 || carry == 1; i--,j--) {//�Ӻ���ǰ�����ϳ����ַ���
            int x = i < 0 ? 0 : s.charAt(i) - '0';
            int y = j < 0 ? 0 : t.charAt(j) - '0';
            sb.append((x + y + carry) % 10);//ȡ��ʮ��ǧ�������
            carry = (x + y + carry) / 10;//��һλ��ֵ+1��
        }
        return sb.reverse().toString();
    }
}
