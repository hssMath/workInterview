package CLeetCodeExercise.fexercise;

/**
 * 415. 字符串相加：给定两个字符串形式的非负整数 num1 和 num2 ，计算它们的和并同样以字符串形式返回。
 * 注意:你不能使用任何內建的用于处理大整数的库（比如 BigInteger），也不能直接将输入的字符串转换为整数形式。
 */
public class A37AddStrings {
    public static void main(String[] args) {
        System.out.println(addStrings("9","99999999999999999999999999999999999999999999999999999999999994"));
    }

    /**
     * 思路：拆分字符串，从2个字符的最右边字符-字符0，进而得到2个字符的真实值；然后将2个真实值、进位数进行相加，得到和之后与10取余，将取余结果开始进行拼接，
     *      然后获取进位的变量。循环往复进行操作。
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
            sb.append((x + y + carry) % 10);//取个十百千万的数字
            carry = (x + y + carry) / 10;//下一位的值+1。
        }
        return sb.reverse().toString();
    }
}