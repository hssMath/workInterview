package OnlineOJTest;

import java.util.Scanner;
/**
 * 计算 a+b
 * 输入描述：输入包括两个正整数a,b(1 <= a, b <= 1000),输入数据包括多组。
 */
public class ATwoNumberAdd {
    /**
     * 1、public static void main(),自己在练习的时候主函数的参数没写，出现数组越界报错，报错如下：
     *      首次执行出错：
     *          请检查是否存在数组越界等非法访问情况
     *          Error: Tool.Main method not found in class Tool.Main, please define the main method as:
     *          public static void main(String[] args) or a JavaFX application class must extend javafx.application.Application
     *      其实并不是数组越界错误，而是主函数没有写参数，自己要多注意。
     * 2、对于题目本身输入示例，虽然是按行显示，其实自测时一次性录入完毕了，然后在取值时，因为输入项全为数字，故可以使用2个连续的：sc.nextInt()进行取值，然后运算后通过sout进行输出。
     *      因为输入项全为数字，故使用 while(in.hasNextInt())来循环判断是否还有值可取。
     * 3、为了节约内存空间，可以在循环取值代码块之外定义2个临时变量。然后使用循环代码块不断去更新值这2个临时变量。
     *
     * @param args
     */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        while(sc.hasNextInt()){
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a+b);
        }
    }
}
