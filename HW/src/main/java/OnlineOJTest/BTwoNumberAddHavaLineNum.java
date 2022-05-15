package OnlineOJTest;

import java.util.Scanner;

/**
 * 计算 a+b
 * 输入描述：输入第一行包括一个数据组数t(1 <= t <= 100)；接下来每行包括两个正整数a,b(1 <= a, b <= 1000)
 */
public class BTwoNumberAddHavaLineNum {
    /**
     * 1、对于题目本身输入示例而言，第一行是一个输入的总行数，实际程序中用不到,故可以先获取后搁置起来不参与后面的运算，其余都是2个数为一行实际参与运算的目标数。
     * 2、在实际自测时数据是一次性录入完毕了的。
     * 3、在取值时，因为输入项全为数字，故使用 while(in.hasNextInt()) 来循环判断是否还有值可取，如果有值可取，就可以使用2个连续的取值函数：sc.nextInt()，进行取值，然后运算后通过sout进行输出。
     *
     * @param args
     */
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        while (sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a + b);
        }
    }
}
