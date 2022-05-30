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
     * 思路：拆分字符串，从2个字符的最右边字符-'0'，进而得到2个字符的真实值；然后将2个真实值与进位数进行相加，
     *      得到和之后与10取余，将取余结果开始进行拼接，然后获取进位的变量。循环往复进行操作。
     * 注意:
     *  1、通过扫描字符串的单个字符与字符0的差值来获取真实的数值。
     *  2、每次取得真实值后，与10取余，求和之后，再取进位数。进而往复循环。
     * @param num1
     * @param num2
     */
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();//用户结果字符串的拼接
        int carry = 0;//记录进位的变量
        for (int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--) {//i，j进行倒叙处理
            int x = i < 0 ? 0 : num1.charAt(i) - '0';
            int y = j < 0 ? 0 : num2.charAt(j) - '0';
            sb.append((x + y + carry) % 10);//取个、十、百、千、万位的数字
            carry = (x + y + carry) / 10;//下一位的值+1。
        }
        return sb.reverse().toString();
    }
}