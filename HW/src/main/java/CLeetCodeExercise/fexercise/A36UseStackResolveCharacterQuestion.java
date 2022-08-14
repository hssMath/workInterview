package CLeetCodeExercise.fexercise;

import java.util.Stack;

/**
 * 20. 有效的括号：给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * 有效字符串需满足：
 *      1、左括号必须用相同类型的右括号闭合。
 *      2、左括号必须以正确的顺序闭合。
 */
public class A36UseStackResolveCharacterQuestion {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    /**
     * 使用栈，思路：
     *  1、先创建一个空栈，将给定的括号字符串 toCharArray 为 char 数组。
     *  2、然后扫描char数组，如果是左括号，给栈push一个相匹配的右括号。
     *  3、若扫描到右括号，使用栈的pop()方法，取出栈顶元素并进行比较，若不相等，则退出循环，同时返回fasle。
     *  4、若给定的括号字符串数组是匹配的，则栈是空的。返回：true。
     * 说明：
     *      字符串拆分为一个字符串数组使用 String.toCharArray();
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
