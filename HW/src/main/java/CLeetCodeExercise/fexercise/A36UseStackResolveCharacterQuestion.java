package CLeetCodeExercise.fexercise;

import java.util.Stack;

/**
 * 20. ��Ч�����ţ�����һ��ֻ���� '('��')'��'{'��'}'��'['��']' ���ַ��� s ���ж��ַ����Ƿ���Ч��
 * ��Ч�ַ��������㣺
 *      1�������ű�������ͬ���͵������űպϡ�
 *      2�������ű�������ȷ��˳��պϡ�
 */
public class A36UseStackResolveCharacterQuestion {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    /**
     * ʹ��ջ��˼·��
     *  1���ȴ���һ����ջ���������������ַ��� toCharArray Ϊ char ���顣
     *  2��Ȼ��ɨ��char���飬����������ţ���ջpushһ����ƥ��������š�
     *  3����ɨ�赽�����ţ�ʹ��ջ��pop()������ȡ��ջ��Ԫ�ز����бȽϣ�������ȣ����˳�ѭ����ͬʱ����fasle��
     *  4���������������ַ���������ƥ��ģ���ջ�ǿյġ����أ�true��
     * ˵����
     *      �ַ������Ϊһ���ַ�������ʹ�� String.toCharArray();
     * @param s
     * @return
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
