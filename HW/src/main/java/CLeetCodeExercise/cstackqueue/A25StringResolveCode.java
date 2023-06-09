package CLeetCodeExercise.cstackqueue;

import java.util.Collections;
import java.util.LinkedList;

/**
 * 给定一个经过编码的字符串，返回它解码后的字符串。
 * 编码规则为: k[encoded_string]，表示其中方括号内部的 encoded_string 正好重复 k 次。注意 k 保证为正整数。
 * 你可以认为输入字符串总是有效的；输入字符串中没有额外的空格，且输入的方括号总是符合格式要求的。
 * 此外，你可以认为原始数据不包含数字，所有的数字只表示重复的次数 k ，例如不会出现像?3a?或?2[4]?的输入。
 *
 * 对应的是 leetcode 的第 394 题
 */
public class A25StringResolveCode {
    public static int ptr;
    public static void main(String[] args) {
        System.out.println(decodeString("3[a]2[bc]"));
    }

    /**
     * 思路：
     *   1.使用jdk提供的 Stack 或者 LinkedList 来作为栈使用
     * @param s
     */
    public static String decodeString(String s) {
        LinkedList<String> stk = new LinkedList<String>();
        ptr = 0;
        while (ptr < s.length()) {
            char cur = s.charAt(ptr);
            if (Character.isDigit(cur)) {//处理数字使得数字完整
                String digits = getDigits(s);// 获取一个数字并进栈
                stk.addLast(digits);
            } else if (Character.isLetter(cur) || cur == '[') {
                stk.addLast(String.valueOf(s.charAt(ptr++)));// 获取一个字母并进栈
            } else {
                ++ptr;
                LinkedList<String> sub = new LinkedList<String>();
                while (!"[".equals(stk.peekLast())) {
                    sub.addLast(stk.removeLast());
                }
                Collections.reverse(sub);
                stk.removeLast();// 左括号出栈
                int repTime = Integer.parseInt(stk.removeLast());//此时栈顶为当前 sub 对应的字符串应该出现的次数
                StringBuffer t = new StringBuffer();
                String o = getString(sub);
                while (repTime-- > 0) {//构造字符串
                    t.append(o);
                }
                stk.addLast(t.toString());// 将构造好的字符串入栈
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
