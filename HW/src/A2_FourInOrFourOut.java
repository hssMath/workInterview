import java.util.Scanner;

public class A2_FourInOrFourOut {
    /**
     * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于5,向上取整；小于5，则向下取整。
     */
    public static void main(String[] args) {
//        1.思路1：按照小数点分割，取小数点后的字符串的第一位数，大于等于5，就给小数点前的数字+1,小于5，返回小数点前的值。最后打印输出该值。
//        Scanner sc = new Scanner(System.in);
//        BigDecimal num = null;
//        int finalNum = 0;
//        while (sc.hasNextBigDecimal()){
//            num = sc.nextBigDecimal();
//        }
//        String[] dateAndSec = num.toString().split("\\.");
//        Integer pre = Integer.valueOf(dateAndSec[0]);
//        Integer suf = Integer.valueOf(dateAndSec[1].substring(0,1));
//        if (suf>=5){
//            finalNum = pre+1;
//        }else {
//            finalNum = pre;
//        }
//        System.out.println(finalNum);
//        sc.close();

//        2.对该整数取整，用原数-取整后的数，差值大于等于5，就给取整的数字+1,小于5，返回取整的数字。最后打印输出该值。
//        Scanner scan = new Scanner(System.in);
//        while(scan.hasNext()){
//            double d = scan.nextDouble();
//            int dint = (int)d;
//            if((d-dint)>=0.5) {
//                dint++;
//            }
//            System.out.println(dint);
//        }

//        3.使用Math函数的round方法。
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            System.out.println( Math.round(scan.nextDouble()));
        }
    }
}
