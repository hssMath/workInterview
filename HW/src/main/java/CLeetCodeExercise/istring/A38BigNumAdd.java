package CLeetCodeExercise.istring;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 大数相加，就可以按照整数相加的方式，从个位开始，逐渐往上累加，换到字符串中就是从两个字符串的末尾开始相加。
 * 测试数据局:"9","99999999999999999999999999999999999999999999999999999999994"
 *
 * 总结：
 *     1、给定一个正整数符串，可以通过：String.charAt(i)，来遍历获取字符串中的每一个字符。(数字字符串转换为整型的方法:字符串-'0')
 *          虽然可以获得每一个字符值，但是因为是字符类型不能直接获取到数值，只需要给字符-'0'，即可获得整数字符类型的数值，因为字符的加减实际是 字符 or 字符串的 ascll 码值的加减，其返回结果为 int。
 *     2、在线编程，输入数据后台接收方式汇总：
 *          "654321","9" : String.trim().replace("\"","").split(",") ，返回一个 String[]。
 *          654321,9     : String.trim().split(",") ，返回一个 String[]。
 *          654321 9     : String.trim().split(" ") ，返回一个 String[]。
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
     *  以字符串的形式读入两个数字，编写一个函数计算它们的和，以字符串形式返回。
     * @param s
     * @param t
     * @return
     */
    public static String solve(String s, String t) {
        if (s.length() <= 0)   return t;          //若是其中一个为空，返回另一个
        if (t.length() <= 0)   return s;          //若是其中一个为空，返回另一个

        //让s为较长的，t为较短的
        if (s.length() < t.length()) {//比较2个字符串的长度，将较长的字符串放在前面。
            String temp = s;
            s = t;
            t = temp;
        }
        int carry = 0; //定义一个进位标志
        StringBuilder sb = new StringBuilder();//用户结果字符串的拼接

        for (int i = s.length() - 1,j = t.length() - 1; i >= 0 || j >= 0 || carry == 1; i--,j--) {//从后往前遍历较长的字符串
            int x = i < 0 ? 0 : s.charAt(i) - '0';
            int y = j < 0 ? 0 : t.charAt(j) - '0';
            sb.append((x + y + carry) % 10);//取个十百千万的数字
            carry = (x + y + carry) / 10;//下一位的值+1。
        }
        return sb.reverse().toString();
    }
}
