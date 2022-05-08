package CLeetCodeExercise.cstackqueue;

import java.util.Collections;
import java.util.LinkedList;

/**
 * ����һ������������ַ������������������ַ�����
 * �������Ϊ: k[encoded_string]����ʾ���з������ڲ��� encoded_string �����ظ� k �Ρ�ע�� k ��֤Ϊ��������
 * �������Ϊ�����ַ���������Ч�ģ������ַ�����û�ж���Ŀո�������ķ��������Ƿ��ϸ�ʽҪ��ġ�
 * ���⣬�������Ϊԭʼ���ݲ��������֣����е�����ֻ��ʾ�ظ��Ĵ��� k �����粻�������?3a?��?2[4]?�����롣
 *
 * ��Ӧ���� leetcode �ĵ� 394 ��
 */
public class A25StringResolveCode {
    public static int ptr;
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
    }

    /**
     * ˼·��
     *   1.ʹ��jdk�ṩ�� Stack ���� LinkedList ����Ϊջʹ��
     * @param s
     */
    public static String decodeString(String s) {
        LinkedList<String> stk = new LinkedList<String>();
        ptr = 0;
        while (ptr < s.length()) {
            char cur = s.charAt(ptr);
            if (Character.isDigit(cur)) {//��������ʹ����������
                String digits = getDigits(s);// ��ȡһ�����ֲ���ջ
                stk.addLast(digits);
            } else if (Character.isLetter(cur) || cur == '[') {
                stk.addLast(String.valueOf(s.charAt(ptr++)));// ��ȡһ����ĸ����ջ
            } else {
                ++ptr;
                LinkedList<String> sub = new LinkedList<String>();
                while (!"[".equals(stk.peekLast())) {
                    sub.addLast(stk.removeLast());
                }
                Collections.reverse(sub);
                stk.removeLast();// �����ų�ջ
                int repTime = Integer.parseInt(stk.removeLast());//��ʱջ��Ϊ��ǰ sub ��Ӧ���ַ���Ӧ�ó��ֵĴ���
                StringBuffer t = new StringBuffer();
                String o = getString(sub);
                while (repTime-- > 0) {//�����ַ���
                    t.append(o);
                }
                stk.addLast(t.toString());// ������õ��ַ�����ջ
            }
        }
        return getString(stk);
    }

    public static String getDigits(String s) {
        StringBuffer ret = new StringBuffer();
        while (Character.isDigit(s.charAt(ptr))) {
            ret.append(s.charAt(ptr++));
        }
        return ret.toString();
    }

    public static String getString(LinkedList<String> v) {
        StringBuffer ret = new StringBuffer();
        for (String s : v) {
            ret.append(s);
        }
        return ret.toString();
    }
}
